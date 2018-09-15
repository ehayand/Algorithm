package problem01697_숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ehay@naver.com on 2018-09-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int MAX = 100001;
    static int n, k;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        k = Integer.parseInt(temp[1]);
        visit = new boolean[MAX];

        if (n >= k) System.out.println(n - k);
        else System.out.println(bfs(n, k));
    }

    static int bfs(int start, int end) {
        Queue<Node> q = new LinkedList<>();
        visit[start] = true;
        q.add(new Node(start, 0));

        while (!q.isEmpty()) {
            Node node = q.poll();
            int index = node.index;
            int count = node.count;

            if (index == end) {
                return count;
            }

            if (index - 1 >= 0 && visit[index - 1] == false) {
                q.add(new Node(index - 1, count + 1));
                visit[index - 1] = true;
            }
            if (index + 1 < MAX && visit[index + 1] == false) {
                q.add(new Node(index + 1, count + 1));
                visit[index + 1] = true;
            }
            if (index << 1 < MAX && visit[index << 1] == false) {
                q.add(new Node(index << 1, count + 1));
                visit[index << 1] = true;
            }
        }

        return 0;
    }

    static class Node {
        int index;
        int count;

        public Node(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }
}