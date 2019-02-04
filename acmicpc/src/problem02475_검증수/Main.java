package problem02475_검증수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int n = 5;
        int[] arr = new int[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(temp[i]);

        int sum = 0;

        for (int i : arr)
            sum += i * i;

        System.out.println(sum % 10);
    }
}
