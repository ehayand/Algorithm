package level_01.jobs_020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-22
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        int logN = 1;
        while (logN * logN++ < n) ;
        logN--;

        for (int i = 2; i <= logN; i++)
            for (int j = i * i; j <= n; j += i)
                if (!isNotPrime[j]) isNotPrime[j] = true;

        System.out.println(isNotPrime[n] ? "NO" : "YES");
    }
}
