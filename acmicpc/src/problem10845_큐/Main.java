package problem10845_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-17
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[] q = new int[10000];
    static int head = 0, tail = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String[] temp;

        while (t-- > 0) {
            temp = br.readLine().split(" ");

            if ("push".equals(temp[0])) {
                push(Integer.parseInt(temp[1]));
            } else if ("pop".equals(temp[0])) {
                sb.append(pop()).append("\n");
            } else if ("front".equals(temp[0])) {
                sb.append(front()).append("\n");
            } else if ("back".equals(temp[0])) {
                sb.append(back()).append("\n");
            } else if ("size".equals(temp[0])) {
                sb.append(size()).append("\n");
            } else {
                sb.append(empty()).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

    static void push(int value) {
        q[++tail] = value;
    }

    static int pop() {
        return empty() == 0 ? q[head++] : -1;
    }

    static int front() {
        return empty() == 0 ? q[head] : -1;
    }

    static int back() {
        return empty() == 0 ? q[tail] : -1;
    }

    static int size() {
        return empty() == 0 ? tail - head + 1 : 0;
    }

    static int empty() {
        return head > tail ? 1 : 0;
    }
}
