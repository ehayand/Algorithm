package problem04948_베르트랑_공준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-08-05
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int MAX = 123456 << 1;
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
        int sqrtMax, n, count;
        sieve = new char[(MAX >> 4) + 1];
        sqrtMax = (int) Math.sqrt(MAX);

        Arrays.fill(sieve, (char) 65535);
        sieve[0] = 65532;

        for (int i = 2; i <= sqrtMax; i++) {
            if (isPrime(i)) {
                for (int j = i * i; j <= MAX; j += i) {
                    setComposition(j);
                }
            }
        }

        n = Integer.parseInt(br.readLine());

        while (n != 0) {
            count = 0;
            for (int i = n + 1; i <= n << 1; i++) {
                if (isPrime(i)) count++;
            }
            sb.append(count + "\n");
            n = Integer.parseInt(br.readLine());
        }

        System.out.print(sb.toString());
    }
}
