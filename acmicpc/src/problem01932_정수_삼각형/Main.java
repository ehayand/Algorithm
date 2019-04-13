package problem01932_정수_삼각형;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-04-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        arr[0][0] = Integer.parseInt(br.readLine());

        int s, left, right, max;
        String[] temp;

        for (int i = 1; i < n; i++) {
            temp = br.readLine().split(" ");

            for (int j = 0; j <= i; j++) {
                left = right = 0;
                s = Integer.parseInt(temp[j]);

                if (j > 0) left = arr[i - 1][j - 1];
                if (j < i) right = arr[i - 1][j];

                arr[i][j] = left > right ? left : right;
                arr[i][j] += s;
            }
        }

        max = 1;

        for (int i : arr[n - 1])
            if (max < i) max = i;

        System.out.println(max);
    }
}
