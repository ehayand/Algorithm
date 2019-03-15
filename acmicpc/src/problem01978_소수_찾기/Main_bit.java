package problem01978_소수_찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-03-15
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main_bit {
    static final int MAX_N = 1000;
    static char[] sieve = new char[(MAX_N >> 4) + 1];

    static boolean isPrime(int k) {
        if ((sieve[k >> 4] & (1 << (k & 15))) == 0) return false;
        else return true;
    }

    static void setComposition(int k) {
        sieve[k >> 4] &= ~(1 << (k & 15));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        Arrays.fill(sieve, (char) 65535);
        sieve[0] = 65532;

        for (int i = 2; i <= Math.sqrt(MAX_N); i++) {
            if (isPrime(i)) {
                for (int j = i * i; j <= MAX_N; j += i) {
                    setComposition(j);
                }
            }
        }

        String[] temp = br.readLine().split(" ");

        int count = 0;

        for (String str : temp)
            if (isPrime(Integer.parseInt(str))) count++;

        System.out.println(count);
    }
}
