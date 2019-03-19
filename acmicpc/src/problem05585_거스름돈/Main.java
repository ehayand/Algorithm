package problem05585_거스름돈;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        n = 1000 - n;

        count += (n/500);
        n %= 500;

        count += (n/100);
        n %= 100;

        count += (n/50);
        n %= 50;

        count += (n/10);
        n %= 10;

        count += (n/5);
        n %= 5;

        count += n;

        System.out.println(count);
    }
}
