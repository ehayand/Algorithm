package level_02.jobs_026;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-26
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(temp[i]);
        for (int i = n - 1; i >= 0; i--) sb.append(arr[i]).append(" ");

        System.out.println(sb.toString().trim());
    }
}
