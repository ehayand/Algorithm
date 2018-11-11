package problem01697_숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ehay@naver.com on 2018-11-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");

        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);
        int ans = 0;
        boolean visit[] = new boolean[100001];

        Queue<Node> q = new LinkedList<>();

        q.add(new Node(n, 0));

        while (!q.isEmpty()) {

            Node current = q.poll();

            int index = current.index;
            int count = current.count;

            if (index == k) {
                ans = count;
                break;
            }

            if (index > 0 && !visit[index - 1]) {
                q.add(new Node(index - 1, count + 1));
                visit[index - 1] = true;
            }

            if (index < 100000 && !visit[index + 1]) {
                q.add(new Node(index + 1, count + 1));
                visit[index + 1] = true;
            }

            if (index << 1 <= 100000 && !visit[index << 1]) {
                q.add(new Node(index << 1, count + 1));
                visit[index << 1] = true;
            }
        }

        System.out.println(ans);
    }
}

class Node {
    int index;
    int count;

    public Node(int index, int count) {
        this.index = index;
        this.count = count;
    }
}