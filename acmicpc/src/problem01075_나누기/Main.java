package problem01075_나누기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-26
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        int result = 0;

        n -= (n % 100);

        for (int i = n; i < n + 100; i++) {
            if (i % f == 0) {
                result = i % 100;
                break;
            }
        }

        if (result == 0) System.out.println("00");
        else {
            if (result / 10 == 0) System.out.println("0" + result);
            else System.out.println(result);
        }
    }
}
