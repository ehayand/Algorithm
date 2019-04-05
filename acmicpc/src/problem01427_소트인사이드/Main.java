package problem01427_소트인사이드;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by ehay@naver.com on 2019-04-05
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String temp = br.readLine();

        int size = temp.length();
        Long[] arr = new Long[size];

        long n = Long.parseLong(temp);

        for (int i = 0; i < size; i++) {
            if (n != 0) {
                arr[i] = n % 10;
                n /= 10;
            } else {
                arr[i] = Long.valueOf(0);
            }
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (long l : arr)
            sb.append(l);

        System.out.println(sb.toString());
    }
}
