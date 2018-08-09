package problem01197_최소_스패닝_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by ehay@naver.com on 2018-07-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[];

        temp = br.readLine().split(" ");
        int v = Integer.parseInt(temp[0]);
        int e = Integer.parseInt(temp[1]);

        boolean[] visit = new boolean[v];
        List<Edge>[] list = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            list[i] = new ArrayList();
        }

        for (int i = 0; i < e; i++) {
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
        while (count < v - 1) {
            for(Edge edge : list[index]) pq.offer(edge);

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