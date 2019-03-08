package problem05565_영수증;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());

        for (int i = 0; i < 9; i++)
            sum -= Integer.parseInt(br.readLine());

        System.out.println(sum);
    }
}
