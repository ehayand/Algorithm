package problem01475_방_번호;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-04-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();

        int max = 0;
        double sixNine;
        int[] count = new int[10];

        for (char c : temp.toCharArray())
            count[(int) c - 48]++;

        for (int i = 0; i <= 9; i++) {
            if (i == 6 || i == 9) continue;
            if (count[i] > max) max = count[i];
        }

        sixNine = count[6] + count[9];

        if (sixNine >= max) sixNine = Math.ceil(sixNine / 2);

        System.out.println((int) (max > sixNine ? max : sixNine));
    }
}
