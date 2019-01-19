package level_01.jobs_011;

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
        int value = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++)
            sb.append(value).append("*").append(i).append("=").append(value * i).append("\n");

        System.out.print(sb.toString());
    }
}
