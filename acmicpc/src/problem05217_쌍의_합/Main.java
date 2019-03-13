package problem05217_쌍의_합;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int n;

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            sb.append("Pairs for ").append(n).append(": ");

            if (n > 2) {
                for (int i = 1; i <= n >> 1; i++) {
                    if (i != n - i)
                        sb.append(i).append(" ").append(n - i).append(", ");
                }

                sb.replace(sb.length() - 2, sb.length(), "");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
