package level_03.jobs_045;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-07
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;

        int[][] arr = new int[9][9];

        int row = 0;
        int col = 0;
        int max = 0;

        for (int i = 0; i < 9; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        sb.append(max).append("\n").append(++row).append(" ").append(++col);

        System.out.println(sb.toString());
    }
}
