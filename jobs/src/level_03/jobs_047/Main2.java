package level_03.jobs_047;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        int x = Integer.parseInt(temp[0]) - 1;
        int y = Integer.parseInt(temp[1]) - 1;
        int dist = Integer.parseInt(temp[2]);

        int value, valueX;

        for (int i = 0; i < n; i++) {
            valueX = Math.abs(i - x);
            for (int j = 0; j < n; j++) {
                value = valueX + Math.abs(j - y);

                if (value == 0) sb.append("x");
                else if (value <= dist) sb.append(value);
                else sb.append(0);

                sb.append(" ");
            }

            sb.replace(sb.length() - 1, sb.length(), "\n");
        }

        System.out.print(sb.toString());
    }
}
