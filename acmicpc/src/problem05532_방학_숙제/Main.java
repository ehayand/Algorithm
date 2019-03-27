package problem05532_방학_숙제;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = new int[5];

        for (int i = 0; i < 5; i++)
            temp[i] = Integer.parseInt(br.readLine());

        int l, m;

        l = temp[1] / temp[3];
        if (temp[1] % temp[3] != 0) l++;

        m = temp[2] / temp[4];
        if (temp[2] % temp[4] != 0) m++;

        System.out.println(temp[0] - (l > m ? l : m));
    }
}
