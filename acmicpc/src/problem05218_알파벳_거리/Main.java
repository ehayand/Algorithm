package problem05218_알파벳_거리;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int dist;
        String[] temp;
        while (t-- > 0) {
            temp = br.readLine().split(" ");

            sb.append("Distances: ");

            for (int i = 0; i < temp[0].length(); i++) {
                dist = temp[1].charAt(i) - temp[0].charAt(i);

                if (dist < 0) dist += 26;

                sb.append(dist).append(" ");
            }

            sb.replace(sb.length() - 1, sb.length(), "\n");
        }

        System.out.print(sb.toString());
    }
}
