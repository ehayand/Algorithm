package problem10707_수도요금;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-26
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = new int[5];

        for (int i = 0; i < 5; i++)
            temp[i] = Integer.parseInt(br.readLine());

        int x, y, add;

        x = temp[0] * temp[4];
        add = temp[4] - temp[2];
        y = temp[1] + ((add > 0 ? add : 0) * temp[3]);

        System.out.println(x > y ? y : x);
    }
}
