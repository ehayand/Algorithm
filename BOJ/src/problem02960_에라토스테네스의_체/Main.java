package problem02960_에라토스테네스의_체;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-08-17
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);

        boolean[] isNotPrime = new boolean[n + 1];

        int ans = 0;

        for (int i = 2; i < n + 1; i++) {
            if (!isNotPrime[i]) {
                if(--k == 0){
                    ans = i;
                    break;
                }
                for (int j = i * i; j < n + 1; j += i) {
                    if (!isNotPrime[j]) {
                        if(--k == 0){
                            ans = j;
                            break;
                        }
                        isNotPrime[j] = true;
                    }
                }
            }
            if(k==0) break;
        }

        System.out.println(ans);
    }
}
