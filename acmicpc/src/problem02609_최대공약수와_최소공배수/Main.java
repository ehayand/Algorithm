package problem02609_최대공약수와_최소공배수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-05
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");

        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        sb.append(gcd(a, b)).append("\n").append(lcm(a, b));

        System.out.println(sb.toString());
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}
