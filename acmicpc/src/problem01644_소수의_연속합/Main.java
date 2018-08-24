package problem01644_소수의_연속합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-08-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static List<Integer> list;
    static char[] sieve;

    static boolean isPrime(int k) {
        if ((sieve[k >> 4] & (1 << (k & 15))) == 0) return false;
        else return true;
    }

    static void setComposition(int k) {
        sieve[k >> 4] &= ~(1 << (k & 15));
    }

    static void eratosthenes(int n) {
        int sqrtN = (int) Math.sqrt(n);

        sieve = new char[(n >> 4) + 1];
        Arrays.fill(sieve, (char) 43690);
        sieve[0] = 43692;

        for (int i = 3; i <= sqrtN; i++) {
            if (isPrime(i)) {
                for (int j = i * i; j < n + 1; j += i) {
                    setComposition(j);
                }
            }
        }

        list = new ArrayList();
        for(int i=2; i<=n; i++){
            if(isPrime(i)) list.add(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        eratosthenes(n);

        int sum;
        int ans = 0;

        for(int i=0; i<list.size(); i++){
            sum = n - list.get(i);
            for(int j=i; j<list.size(); j++){
                if(sum==0){
                    ans++;
                    break;
                }
                else if(sum<0) break;

                if(i!=j) sum -= list.get(j);
            }
        }

        System.out.println(ans);
    }
}
