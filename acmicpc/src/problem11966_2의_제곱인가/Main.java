package problem11966_2의_제곱인가;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-04-23
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(isSquare(n) ? 1 : 0);
    }

    public static boolean isSquare(int n) {
        return Integer.bitCount(n) == 1 ? true : false;
    }
}
