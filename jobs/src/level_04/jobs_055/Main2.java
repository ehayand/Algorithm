package level_04.jobs_055;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] input = new int[n][5];

        String[] temp;
        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            input[i][0] = Integer.parseInt(temp[0]);
            input[i][3] = Integer.parseInt(temp[1]);
            input[i][4] = Integer.parseInt(temp[2]);

            input[i][2] = input[i][0] % 10;
            input[i][1] = input[i][0] / 10 % 10;
            input[i][0] /= 100;
        }

        boolean flag;
        int strike, ball;
        int count = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == i) continue;
                for (int k = 1; k < 10; k++) {
                    if (k == i || k == j) continue;
                    flag = true;

                    for (int l = 0; l < n; l++) {
                        strike = ball = 0;

                        if (input[l][0] == i) strike++;
                        if (input[l][1] == j) strike++;
                        if (input[l][2] == k) strike++;
                        if (input[l][0] == j || input[l][0] == k) ball++;
                        if (input[l][1] == i || input[l][1] == k) ball++;
                        if (input[l][2] == i || input[l][2] == j) ball++;
                        if (input[l][3] != strike || input[l][4] != ball) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) count++;
                }
            }
        }

        System.out.println(count);
    }
}