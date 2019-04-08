package problem01966_프린터_큐;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ehay@naver.com on 2019-04-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        int n, m, p, dnum, count;
        int[] priorities;
        String[] temp;
        Queue<Doc> q;

        while (testCase-- > 0) {
            temp = br.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);

            q = new LinkedList<>();
            priorities = new int[10];
            dnum = -1;
            p = count = 0;

            temp = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                p = Integer.parseInt(temp[i]);
                q.offer(new Doc(i, p));
                priorities[p]++;
            }

            while (dnum != m) {
                for (int i = 0; i < 10; i++) {
                    if (priorities[i] > 0) p = i;
                }

                while (q.peek().priority < p) q.offer(q.poll());

                dnum = q.poll().num;
                priorities[p]--;
                count++;
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }

    static class Doc {
        int num;
        int priority;

        public Doc(int num, int priority) {
            this.num = num;
            this.priority = priority;
        }
    }
}
