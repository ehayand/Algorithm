package problem01874_스택_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-10
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] stack = new int[100001];
    static int top = 0, number = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp;
        boolean err = false;

        while (n-- > 0) {
            temp = Integer.parseInt(br.readLine());

            while (stack[top] < temp) {
                push();
            }

            if (temp != pop()) {
                err = true;
                break;
            }
        }

        System.out.print(err ? "NO" : sb.toString());
    }

    static void push() {
        stack[++top] = ++number;
        sb.append("+\n");
    }

    static int pop() {
        if (top < 1) return 0;
        sb.append("-\n");
        return stack[top--];
    }
}
