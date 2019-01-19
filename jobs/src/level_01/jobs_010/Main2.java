package level_01.jobs_010;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-19
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

        n--;

        while (n++ < m)
            sb.append(n).append(" ");

        System.out.println(sb.toString().trim());
    }
}
