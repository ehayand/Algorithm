package level_02.jobs_023;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-23
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) sb.append(" ");
            for (int j = 0; j < i; j++) sb.append("*");
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
