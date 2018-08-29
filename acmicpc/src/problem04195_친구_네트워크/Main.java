package problem04195_친구_네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehay@naver.com on 2018-08-25
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[] parents = new int[100001];
    static int[] count = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;
        Integer u, v;
        int t = Integer.parseInt(br.readLine());
        int f, index;

        while (t-- > 0) {
            f = Integer.parseInt(br.readLine());
            Map<String, Integer> network = new HashMap<>();
            init(f);
            index = 0;

            while (f-- > 0) {
                temp = br.readLine().split(" ");

                if (!network.isEmpty()) {
                    u = network.get(temp[0].trim());
                    v = network.get(temp[1].trim());

                    if (u == null) {
                        network.put(temp[0], index);
                        u = index++;
                    }
                    if (v == null) {
                        network.put(temp[1], index);
                        v = index++;
                    }

                    union(u, v);
                } else {
                    network.put(temp[0], index);
                    u = index++;
                    network.put(temp[1], index);
                    v = index++;

                    union(u, v);
                }

                sb.append(count[find(u)]).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

    public static void init(int f) {
        for (int i = 0; i <= f; i++) {
            parents[i] = i;
            count[i] = 1;
        }
    }

    public static void union(int u, int v) {
        u = find(u);
        v = find(v);

        if (u == v) return;

        if (count[u] > count[v]){
            if (u > v) {
                int temp = u;
                u = v;
                v = temp;
            }
        }

        parents[v] = u;
        count[u] += count[v];
        count[v] = 0;
    }

    public static int find(int u) {
        if (parents[u] == u) return u;

        return parents[u] = find(parents[u]);
    }
}
