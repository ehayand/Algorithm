package problem01748_수_이어_쓰기_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-04-07
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10];
        int sum = 0;
        int i, j = 1;

        for (i = 1; i < 10; i++, j *= 10)
            arr[i] = j * 10 - j;

        for (i = 1; i < 9 && arr[i] <= n; i++) {
            n -= arr[i];
            sum += arr[i] * i;
        }

        System.out.println(n * i + sum);
    }
}
