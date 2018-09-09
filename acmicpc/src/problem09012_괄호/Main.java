package problem09012_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static short top;
    static boolean err;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] temp;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            top = -1;
            err = false;
            temp = br.readLine().toCharArray();

            for (char i : temp) {
                if (err) break;

                if (i == '(') push();
                else pop();
            }

            sb.append(top == -1 && !err ? "YES" : "NO").append("\n");
        }

        System.out.print(sb.toString());
    }

    public static void push() {
        top++;
    }

    public static void pop() {
        if (top > -1) top--;
        else err = true;
    }
}
