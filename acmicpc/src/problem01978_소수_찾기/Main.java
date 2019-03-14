package problem01978_소수_찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-03-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int MAX = 1000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        boolean[] isPrime = new boolean[MAX + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i=2; i<= (int)Math.sqrt(MAX); i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<=MAX; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        String[] temp = br.readLine().split(" ");

        int count = 0;

        for(String str : temp)
            if(isPrime[Integer.parseInt(str)]) count++;

        System.out.println(count);
    }
}
