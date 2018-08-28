package problem01717_집합의_표현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-08-25
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[] parents, ranks;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int select, a, b;
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        parents = new int[n + 1];
        ranks = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            parents[i] = i;
            ranks[i] = 1;
        }

        while (m-- > 0) {
            temp = br.readLine().split(" ");
            select = Integer.parseInt(temp[0]);
            a = Integer.parseInt(temp[1]);
            b = Integer.parseInt(temp[2]);

            if (select == 0) {
                union(a, b);
            } else {
                sb.append(find(a) == find(b) ? "YES" : "NO").append("\n");
            }
        }

        System.out.print(sb.toString());
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return;

        if (ranks[a] > ranks[b]) parents[b] = a;
        else parents[a] = b;

        if (ranks[a] == ranks[b]) ranks[b]++;
    }

    public static int find(int e) {
        if (parents[e] == e) return e;

        return parents[e] = find(parents[e]);
    }
}