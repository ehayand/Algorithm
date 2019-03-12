package problem01009_분산처리;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-12
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int a, b, c;

        String[] temp;

        while (t-- > 0) {
            temp = br.readLine().split(" ");
            c = a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);

            for (int i = 1; i < b; i++) {
                c *= (a % 10);
                c %= 10;
            }

            sb.append(c == 0 ? 10 : c).append("\n");
        }

        System.out.print(sb.toString());
    }
}
