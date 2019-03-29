package problem02810_컵홀더;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int holder = 0;

        String temp = br.readLine();
        for (int i = 0; i < n; i++) {
            holder++;
            if (temp.charAt(i) == 'L') i++;
        }

        System.out.println(holder == n ? n : ++holder);
    }
}
