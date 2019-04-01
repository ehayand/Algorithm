package problem01167_트리의_지름;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by ehay@naver.com on 2019-04-01
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static LinkedList<Edge>[] list;
    static boolean[] visit;
    static int max, maxNode;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());

        list = new LinkedList[v];

        for (int i = 0; i < v; i++)
            list[i] = new LinkedList<>();

        int s, e, w;
        String[] temp;
        for (int i = 0; i < v; i++) {
            temp = br.readLine().split(" ");
            s = Integer.parseInt(temp[0]) - 1;

            for (int j = 1; ; j += 2) {
                e = Integer.parseInt(temp[j]) - 1;
                if (e < 1) break;
                w = Integer.parseInt(temp[j + 1]);

                list[s].add(new Edge(e, w));
                list[e].add(new Edge(s, w));
            }
        }

        max = 0;
        visit = new boolean[v];
        dfs(0, 0);

        max = 0;
        visit = new boolean[v];
        dfs(maxNode, 0);

        System.out.println(max);
    }

    public static void dfs(int node, int sum) {
        visit[node] = true;

        if (max < sum) {
            max = sum;
            maxNode = node;
        }

        for (Edge e : list[node]) {
            if (!visit[e.end])
                dfs(e.end, sum + e.weight);
        }
    }

    static class Edge {
        int end;
        int weight;

        public Edge(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
    }
}
