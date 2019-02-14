package problem01916_최소비용_구하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by ehay@naver.com on 2019-02-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp;
        int n, m, u, v, w, start, end;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        List<Edge>[] list = new ArrayList[n];
        int[] dist = new int[n];

        for (int i = 0; i < n; i++)
            list[i] = new ArrayList();

        for (int i = 0; i < n; i++)
            dist[i] = INF;

        for (int i = 0; i < m; i++) {
            temp = br.readLine().split(" ");
            u = Integer.parseInt(temp[0]) - 1;
            v = Integer.parseInt(temp[1]) - 1;
            w = Integer.parseInt(temp[2]);

            list[u].add(new Edge(v, w));
        }

        temp = br.readLine().split(" ");
        start = Integer.parseInt(temp[0]) - 1;
        end = Integer.parseInt(temp[1]) - 1;


        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

        dist[start] = 0;
        pq.offer(new Edge(start, dist[start]));

        while (!pq.isEmpty()) {
            start = pq.poll().end;

            for (Edge edge : list[start]) {
                int current = edge.end;

                if (dist[current] > dist[start] + edge.weight) {
                    dist[current] = dist[start] + edge.weight;
                    pq.offer(new Edge(current, dist[current]));
                }
            }
        }

        System.out.println(dist[end]);
    }

    static class Edge implements Comparable<Edge> {
        int end;
        int weight;

        public Edge(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        public int compareTo(Edge edge) {
            return weight <= edge.weight ? -1 : 1;
        }
    }
}
