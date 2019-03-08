package problem05543_상근날드;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b, d, temp;
        b = d = 2001;

        for (int i = 0; i < 3; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp < b) b = temp;
        }

        for (int i = 0; i < 2; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp < d) d = temp;
        }

        System.out.println(b + d - 50);
    }
}
