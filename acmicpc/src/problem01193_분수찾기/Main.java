package problem01193_분수찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean reverse = false;
        int x, y, count;
        x = y = count = 1;

        while (count < n) {
            if (x == 1) {
                y++;
                count++;
                reverse = false;
            } else if (y == 1) {
                x++;
                count++;
                reverse = true;
            }

            if(count == n) break;

            if (reverse) {
                x--;
                y++;
            } else {
                x++;
                y--;
            }

            count++;
        }

        System.out.println(x + "/" + y);
    }
}
