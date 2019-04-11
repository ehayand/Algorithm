package problem02606_바이러스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ehay@naver.com on 2019-04-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<Integer>[] arr = new LinkedList[n + 1];
        boolean[] visit = new boolean[n + 1];

        for (int i = 0; i <= n; i++)
            arr[i] = new LinkedList<>();

        int start, end;
        String[] temp;

        for (int i = 0; i < m; i++) {
            temp = br.readLine().split(" ");
            start = Integer.parseInt(temp[0]);
            end = Integer.parseInt(temp[1]);

            arr[start].add(end);
            arr[end].add(start);
        }

        int node, count;
        Queue<Integer> q = new LinkedList<>();

        for (int i : arr[1]) {
            q.offer(i);
            visit[i] = true;
        }

        visit[1] = true;
        count = 0;

        while (!q.isEmpty()) {
            node = q.poll();

            for (int i : arr[node]) {
                if (!visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
