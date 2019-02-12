package problem02592_대표값;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-02-12
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int avg, count, value, max, most;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        avg = count = max = 0;
        value = most = arr[0];
        for (int i : arr) {
            avg += i;
            if (i == value) {
                count++;
            } else {
                if (max < count) {
                    most = value;
                    max = count;
                }
                value = i;
                count = 1;
            }
        }

        if (max < count) most = value;

        System.out.println((avg / 10) + "\n" + most);
    }
}
