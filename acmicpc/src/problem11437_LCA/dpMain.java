package problem11437_LCA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ehay@naver.com on 2018-12-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class dpMain {

    static int N;
    static int M;
    static int[][] parent;
    static int[] depth;
    static boolean[] check;
    static List<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;

        N = Integer.parseInt(br.readLine());
        list = new List[N + 1];

        int log2n = 1;
        while ((1 << log2n) <= N) log2n++;

        parent = new int[N + 1][log2n];
        check = new boolean[N + 1];
        depth = new int[N + 1];

        for (int i = 1; i <= N; i++) list[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            temp = br.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);

            list[x].add(y);
            list[y].add(x);
        }

        int start = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        check[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            int size = list[now].size();

            for (int i = 0; i < size; i++) {
                int next = list[now].get(i);

                if (!check[next]) {
                    check[next] = true;
                    depth[next] = depth[now] + 1;
                    parent[next][0] = now;
                    queue.offer(next);
                }
            }
        }

        for (int j = 1; j < log2n; j++) {
            for (int i = 1; i <= N; i++) {
                if (parent[i][j - 1] != 0) parent[i][j] = parent[parent[i][j - 1]][j - 1];
            }
        }

        M = Integer.parseInt(br.readLine());

        while (M-- > 0) {
            temp = br.readLine().split(" ");
            sb.append(LCA(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]))).append("\n");
        }

        System.out.print(sb.toString());
    }

    public static int LCA(int x, int y) {
        int a, b;

        if (depth[x] > depth[y]) {
            a = y;
            b = x;
        } else {
            a = x;
            b = y;
        }

        int log = 1;
        while ((1 << log) <= depth[b]) log++;
        log--;

        for (int i = log; i >= 0; i--) {
            if (depth[b] - (1 << i) >= depth[a]) b = parent[b][i];
        }

        if (a == b) return a;

        for (int i = log; i >= 0; i--) {
            if (parent[a][i] != 0 && parent[a][i] != parent[b][i]) {
                a = parent[a][i];
                b = parent[b][i];
            }
        }

        return parent[a][0];
    }
}
