package problem01260_DFS와_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by ehay@naver.com on 2018-11-18
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static ArrayList<Integer>[] map;
    static boolean[] visit;
    static int n, m, v;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        v = Integer.parseInt(temp[2]);
        map = new ArrayList[n + 1];
        visit = new boolean[n + 1];
        sb = new StringBuilder();

        for (int i = 0; i <= n; i++) map[i] = new ArrayList<>();

        while (m-- > 0) {
            temp = br.readLine().split(" ");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);

            map[start].add(end);
            map[end].add(start);
        }

        for(final ArrayList list : map) Collections.sort(list);

        dfs(v);
        sb.append("\n");
        Arrays.fill(visit, false);
        bfs();

        System.out.print(sb.toString());
    }

    public static void dfs(int index) {
        if (visit[index]) return;

        visit[index] = true;
        sb.append(index).append(" ");

        for (int i : map[index]) dfs(i);
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);
        while (!queue.isEmpty()) {
            int index = queue.poll();

            visit[index] = true;
            sb.append(index).append(" ");

            for (int i : map[index]) {
                if (!visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                }
            }

        }
    }
}
