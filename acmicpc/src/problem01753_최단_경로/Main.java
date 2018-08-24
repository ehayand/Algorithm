package problem01753_최단_경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by ehay@naver.com on 2018-07-07
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int INF = 10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;
        int V, E, K, u, v, w;

        temp = br.readLine().split(" ");
        V = Integer.parseInt(temp[0]);
        E = Integer.parseInt(temp[1]);
        K = Integer.parseInt(br.readLine()) - 1;

        List<Edge>[] list = new ArrayList[V];
        int[] dist = new int[V];

        for (int i = 0; i < V; i++) {
            list[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < E; i++) {
            temp = br.readLine().split(" ");
            u = Integer.parseInt(temp[0]) - 1;
            v = Integer.parseInt(temp[1]) - 1;
            w = Integer.parseInt(temp[2]);

            list[u].add(new Edge(v, w));
        }

        for (int i = 0; i < V; i++) {
            dist[i] = INF;
        }

        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

        dist[K] = 0;
        pq.offer(new Edge(K, dist[K]));

        while (!pq.isEmpty()) {
            K = pq.peek().end;
            pq.poll();

            for (Edge edge : list[K]) {
                int current = edge.end;

                if (dist[current] > dist[K] + edge.weight) {
                    dist[current] = dist[K] + edge.weight;
                    pq.offer(new Edge(current, dist[current]));
                }
            }
        }

        for (int i = 0; i < V; i++) {
            if (dist[i] != INF) sb.append(dist[i] + "\n");
            else sb.append("INF\n");
        }

        System.out.print(sb.toString());
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
