package problem01929_소수_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-08-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static char[] sieve;

    static boolean isPrime(int k) {
        if ((sieve[k >> 4] & (1 << (k & 15))) == 0) return false;
        else return true;
    }

    static void setComposition(int k) {
        sieve[k >> 4] &= ~(1 << (k & 15));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int m = Integer.parseInt(temp[0]);
        int n = Integer.parseInt(temp[1]);

        sieve = new char[(n >> 4) + 1];
        int sqrtN = (int) Math.sqrt(n);

        Arrays.fill(sieve, (char) 65535);
        sieve[0] = 65532;

        for (int i = 2; i <= sqrtN; i++) {
            if (isPrime(i)) {
                for (int j = i * i; j < n + 1; j += i) {
                    setComposition(j);
                }
            }
        }

        for (int i = m; i < n + 1; i++) {
            if (isPrime(i)) sb.append(i + "\n");
        }

        System.out.print(sb.toString());
    }
}
