package problem01922_네트워크_연결;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by ehay@naver.com on 2018-08-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] visit = new boolean[n];
        List<Edge>[] list = new ArrayList[n];

        for (int i = 0; i < n; i++) list[i] = new ArrayList();

        String[] temp;
        while (m-- > 0) {
            temp = br.readLine().split(" ");
            int start = Integer.parseInt(temp[0]) - 1;
            int end = Integer.parseInt(temp[1]) - 1;
            int weight = Integer.parseInt(temp[2]);
            list[start].add(new Edge(end, weight));
            list[end].add(new Edge(start, weight));
        }

        int ans = 0;
        int count = 0;
        int index = 0;

        PriorityQueue<Edge> pq = new PriorityQueue();
        visit[index] = true;

        while (count < n - 1) {
            for (Edge edge : list[index]) pq.offer(edge);

            while (!pq.isEmpty()) {
                Edge edge = pq.poll();
                if (!visit[edge.end]) {
                    visit[edge.end] = true;
                    ans += edge.weight;
                    index = edge.end;
                    count++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    static class Edge implements Comparable<Edge> {
        int end;
        int weight;

        public Edge(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge edge) {
            return weight < edge.weight ? -1 : 1;
        }
    }
}