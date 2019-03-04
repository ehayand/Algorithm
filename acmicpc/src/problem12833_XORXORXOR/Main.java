package problem12833_XORXORXOR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int a, b, c;
        a = Integer.parseInt(temp[0]);
        b = Integer.parseInt(temp[1]);
        c = Integer.parseInt(temp[2]);

        for (int i = 0; i < c; i++)
            a ^= b;

        System.out.println(a);
    }
}
