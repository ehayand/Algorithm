package problem02553_마지막_팩토리얼_수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long f = 1;

        for (int i = 2; i <= n; i++) {
            f *= i;
            while (f % 10 == 0)
                f /= 10;

            f %= 1000000000;
        }

        System.out.print(f % 10);
    }
}
