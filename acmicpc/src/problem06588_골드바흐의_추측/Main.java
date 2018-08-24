package problem06588_골드바흐의_추측;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-08-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int MAX_N = 1000000;
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

        Arrays.fill(sieve, (char) 65535);
        sieve[0] = 65532;

        for (int i = 2; i <= sqrtN; i++) {
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

        int mid;
        boolean isWrong;

        int n = Integer.parseInt(br.readLine());

        while (n != 0) {
            isWrong = true;
            mid = n >> 1;

            for (int i = 3, j = n - 3; i <= mid; i++, j--) {
                if (isPrime(i) && isPrime(j)) {
                    sb.append(n + " = " + i + " + " + j + "\n");
                    isWrong = false;
                    break;
                }
            }

            if (isWrong) sb.append("Goldbach's conjecture is wrong.\n");

            n = Integer.parseInt(br.readLine());
        }

        System.out.print(sb.toString());
    }
}
