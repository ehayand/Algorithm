package problem10828_스택;

import java.io.*;

/**
 * Created by ehay@naver.com on 2018-08-31
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] temp;
        int top = -1;
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n + 1];

        while (n-- > 0) {
            temp = br.readLine().split(" ");

            switch (temp[0]) {
                case "push":
                    top++;
                    stack[top] = Integer.parseInt(temp[1]);
                    break;
                case "pop":
                    if (top > -1) {
                        bw.write(stack[top] + "\n");
                        stack[top] = 0;
                        top--;
                    } else bw.write(-1 + "\n");
                    break;
                case "size":
                    bw.write(top + 1 + "\n");
                    break;
                case "empty":
                    if (top == -1) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case "top":
                    if (top == -1) bw.write(-1 + "\n");
                    else bw.write(stack[top] + "\n");
            }
        }

        bw.flush();
    }
}
