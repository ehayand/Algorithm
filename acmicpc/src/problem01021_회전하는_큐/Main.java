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

        init(deque, n);

        int ans = 0;
        temp = br.readLine().split(" ");

        for (String str : temp) {
            int value = Integer.parseInt(str);

            int left = findIndex(deque, value);
            int right = deque.size() - left + 1;

            if (left <= right) ans += shiftLeft(deque, left);
            else ans += shiftRight(deque, right);
        }

        System.out.println(ans);
    }

    public static void init(final Deque<Integer> deque, int size) {
        for (int i = 1; i <= size; i++) deque.add(i);
    }

    public static int findIndex(final Deque<Integer> deque, int value) {
        int index = 0;

        for (Integer i : deque) {
            index++;
            if (value == i) break;
        }

        return index;
    }

    public static int drop(final Deque<Integer> deque) {
        return deque.pollFirst();
    }

    public static int shiftLeft(final Deque<Integer> deque, int left) {
        int count = --left;

        while (left-- > 0) deque.addLast(deque.pollFirst());
        drop(deque);

        return count;
    }

    public static int shiftRight(final Deque<Integer> deque, int right) {
        int count = right;

        while (right-- > 0) deque.addFirst(deque.pollLast());
        drop(deque);

        return count;
    }
}
