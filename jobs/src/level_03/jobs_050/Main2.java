package level_03.jobs_050;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-02-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] students = new int[n][5];
        boolean[] visit = new boolean[n];

        String[] temp;
        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                students[i][j] = Integer.parseInt(temp[j]) - 1;
            }
        }

        int count, max, student;
        max = student = 0;
        for (int i = 0; i < n; i++) {
            Arrays.fill(visit, false);
            visit[i] = true;
            count = 0;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (!visit[k]) {
                        if (students[i][j] == students[k][j]) {
                            visit[k] = true;
                            count++;
                        }
                    }
                }
            }

            if (max < count) {
                max = count;
                student = i;
            }
        }

        System.out.println(student + 1);
    }
}
