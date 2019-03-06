package problem05988_홀수일까_짝수일까;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-06
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String temp;

        while (n-- > 0) {
            temp = br.readLine().trim();

            if (temp.charAt(temp.length() - 1) % 2 == 0)
                sb.append("even\n");
            else
                sb.append("odd\n");
        }

        System.out.print(sb.toString());
    }
}
