package problem01021_회전하는_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ehay@naver.com on 2018-09-28
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);

        for (int i = 1; i < n + 1; i++) deque.add(i);

        int ans = 0;
        temp = br.readLine().split(" ");

        for (String str : temp) {
            int value = Integer.parseInt(str);

            int left = 0;

            for (Integer i : deque) {
                left++;
                if (value == i) break;
            }

            int right = deque.size() - left + 1;

            if (left <= right) {
                ans += --left;
                while (left-- > 0) deque.addLast(deque.pollFirst());
                deque.pollFirst();
            } else {
                ans += right;
                while (right-- > 0) deque.addFirst(deque.pollLast());
                deque.pollFirst();
            }
        }

        System.out.println(ans);
    }
}
