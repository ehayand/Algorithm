package problem09020_골드바흐의_추측;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-08-12
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int MAX_N = 10000;
    static char[] sieve = new char[(MAX_N >> 4) + 1];

    static boolean isPrime(int k) {
        if ((sieve[k >> 4] & (1 << (k & 15))) == 0) return false;
        else return true;
    }

    static void setComposition(int k) {
        sieve[k >> 4] &= ~(1 << (k & 15));
    }

    static void eratosthenes() {
        int sqrtN = (int) Math.sqrt(MAX_N);

        Arrays.fill(sieve, (char) 43690);
        sieve[0] = 43692;

        for (int i = 3; i <= sqrtN; i++) {
            if (isPrime(i)) {
                for (int j = i * i; j < MAX_N + 1; j += i) {
                    setComposition(j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        eratosthenes();

        int n, mid;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            mid = n >> 1;

            for (int i = mid; i >= 2; i--) {
                if (isPrime(i) && isPrime(n - i)) {
                    sb.append(i + " " + (n - i) + "\n");
                    break;
                }
            }
        }

        System.out.print(sb.toString());
    }
}