package problem02309_일곱_난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-09-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] heights = new int[9];
        boolean breakFlag = false;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }

        Arrays.sort(heights);

        int i = 0, j = 0;
        for (i = 0; i < 9; i++) {
            sum -= heights[i];

            for (j = 0; j < 9; j++) {
                if (i != j) {
                    if (sum - heights[j] == 100) {
                        breakFlag = true;
                        break;
                    }
                }
            }

            if (breakFlag) break;

            sum += heights[i];
        }

        for (int k = 0; k < 9; k++) {
            if (k != i && k != j) sb.append(heights[k] + "\n");
        }

        System.out.print(sb.toString());
    }
}
