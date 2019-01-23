package level_02.jobs_024;

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
            int star = ((i << 1) - 1);
            int temp = (((n << 1) - 1) - star) >> 1;
            for (int j = 0; j < temp; j++) sb.append(" ");
            for (int j = 0; j < star; j++) sb.append("*");
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
