package problem11437_LCA;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ehay@naver.com on 2018-12-17
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int N;
    static int M;
    static int[] parent;
    static int[] depth;
    static LinkedList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;

        N = Integer.parseInt(br.readLine());
        list = new LinkedList[N + 1];

        for (int i = 1; i <= N; i++) list[i] = new LinkedList<>();

        for (int i = 0; i < N - 1; i++) {
            temp = br.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);

            list[x].add(y);
            list[y].add(x);
        }

        int start = 1;
        parent = new int[N + 1];
        depth = new int[N + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        parent[start] = start;
        depth[start] = start;

        while (!queue.isEmpty()) {
            int from = queue.poll();

            for (int to : list[from]) {
                if (parent[to] == 0) {
                    queue.offer(to);
                    parent[to] = from;
                    depth[to] = depth[from] + 1;
                }
            }
        }

        M = Integer.parseInt(br.readLine());

        while (M-- > 0) {
            temp = br.readLine().split(" ");

            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]); // 깊이가 더 깊은 쪽을 y 로 설정한다.

            if (depth[x] > depth[y]) {
                int swap = x;
                x = y;
                y = swap;
            }

            // 같은 높이가 되도록 끌어 올린다.
            while (depth[x] != depth[y]) {
                y = parent[y];
            }

            if (x == y) sb.append(x).append("\n");
            else {
                // 같은 부모가 될때까지 올라간다.
                while (parent[x] != parent[y]) {
                    x = parent[x];
                    y = parent[y];
                }

                sb.append(parent[x]).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
