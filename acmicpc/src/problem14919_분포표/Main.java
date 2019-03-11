package problem14919_분포표;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-11
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        int[] count = new int[m];

        double bar = 10000000 / (double) m;

        for (int i = 1; i < m; i++)
            arr[i] = (int) (bar * i);

        String[] temp = br.readLine().split(" ");
        int num;

        for (String s : temp) {
            num = (int) Math.ceil(Double.parseDouble(s) * 10000000);

            for (int i = m - 1; i >= 0; i--) {
                if (arr[i] <= num) {
                    count[i]++;
                    break;
                }
            }
        }

        for (int i : count)
            sb.append(i).append(" ");

        System.out.println(sb.toString());
    }
}