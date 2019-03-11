package problem14920_3nPLUS1_수열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;

        while (n != 1) {
            n = functionC(n);
            count++;
        }

        System.out.println(count);
    }

    public static int functionC(int i) {
        if (i % 2 == 0)
            i /= 2;
        else
            i = (i * 3) + 1;

        return i;
    }
}
