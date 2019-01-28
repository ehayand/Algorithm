package level_02.jobs_032;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-28
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int logN = 0;
        while ((1 << ++logN) < n) ;

        for (--logN; logN >= 0; n &= ~(1 << logN), logN--)
            sb.append(n >> logN);

        System.out.println(sb.toString());
    }
}
