package problem02884_알람_시계;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-22
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");

        int h = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        m -= 45;

        if (m < 0) {
            h -= 1;
            m += 60;
        }

        System.out.println((h < 0 ? 23 : h) + " " + m);
    }
}
