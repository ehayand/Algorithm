package problem02504_괄호의_값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-10
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static char[] stack = new char[31];
    static int top = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        System.out.println(solve(chars));
    }

    static int solve(char[] chars) {
        int temp = 1;
        int ans = 0;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                    push('(');
                    temp *= 2;
                    break;
                case ')':
                    if (top == 0 || stack[top] != '(') return 0;
                    if (chars[i - 1] == '(') ans += temp;
                    pop();
                    temp /= 2;
                    break;
                case '[':
                    push('[');
                    temp *= 3;
                    break;
                case ']':
                    if (top == 0 || stack[top] != '[') return 0;
                    if (chars[i - 1] == '[') ans += temp;
                    pop();
                    temp /= 3;
                    break;
            }
        }

        if (top != 0) return 0;

        return ans;
    }

    static void push(char i) {
        stack[++top] = i;
    }

    static void pop() {
        if (top < 1) return;
        stack[top--] = 0x0;
    }
}
