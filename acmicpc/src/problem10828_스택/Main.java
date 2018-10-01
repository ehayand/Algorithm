package problem10828_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-08-31
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[] stack = new int[10000];
    static int top = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] temp;

        while (n-- > 0) {
            temp = br.readLine().split(" ");

            if ("push".equals(temp[0])) {
                push(Integer.parseInt(temp[1]));
            } else if ("pop".equals(temp[0])) {
                sb.append(pop()).append("\n");
            } else if ("top".equals(temp[0])) {
                sb.append(top()).append("\n");
            } else if ("size".equals(temp[0])) {
                sb.append(size()).append("\n");
            } else {
                sb.append(empty() ? 1 : 0).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

    static void push(int value) {
        stack[++top] = value;
    }

    static int pop() {
        return empty() ? -1 : stack[top--];
    }

    static int top() {
        return empty() ? -1 : stack[top];
    }

    static int size() {
        return empty() ? 0 : top + 1;
    }

    static boolean empty() {
        return top < 0 ? true : false;
    }
}
