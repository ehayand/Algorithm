package level_01.jobs_007;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-18
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;

        int testCase = 3;

        while (testCase-- > 0) {
            int sum = 0;
            temp = br.readLine().split(" ");

            for (String str : temp)
                sum += Integer.parseInt(str);

            switch (sum) {
                case 0:
                    sb.append("D\n");
                    break;
                case 1:
                    sb.append("C\n");
                    break;
                case 2:
                    sb.append("B\n");
                    break;
                case 3:
                    sb.append("A\n");
                    break;
                default:
                    sb.append("E\n");
            }
        }

        System.out.print(sb.toString());
    }
}
