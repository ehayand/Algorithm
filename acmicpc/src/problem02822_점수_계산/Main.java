package problem02822_점수_계산;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-25
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[151];
        int[] num = new int[5];

        int n;
        for (int i = 1; i <= 8; i++) {
            n = Integer.parseInt(br.readLine());
            arr[n] = i;
        }

        int sum, count;
        sum = count = 0;

        for (int i = 150; i > 0; i--) {
            if (arr[i] > 0) {
                sum += i;
                num[count++] = arr[i];
            }

            if (count > 4) break;
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }

        sb.append(sum).append("\n");

        for (int i = 0; i < 5; i++)
            sb.append(num[i]).append(" ");

        System.out.println(sb.toString().trim());
    }
}
