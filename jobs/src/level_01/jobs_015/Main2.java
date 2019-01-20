package level_01.jobs_015;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-20
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

        for (int i = n, line = 0; i <= m; i++, line++) {
            sb.append(i).append(" ");
            if (line > 6) {
                sb.replace(sb.length() - 1, sb.length(), "\n");
                line = -1;
            }
        }

        System.out.println(sb.toString().trim());
    }
}
