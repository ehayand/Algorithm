package level_02.jobs_025;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        int logM = 0;
        while (++logM * logM < m) ;

        boolean[] isNotPrime = new boolean[m + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i <= logM; i++)
            for (int j = i * i; j <= m; j += i)
                if (!isNotPrime[j]) isNotPrime[j] = true;

        for (int i = n; i <= m; i++)
            if (!isNotPrime[i]) sb.append(i).append(" ");

        System.out.println(sb.toString().trim());
    }
}
