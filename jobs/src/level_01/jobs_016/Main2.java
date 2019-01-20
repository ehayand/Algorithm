package level_01.jobs_016;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-20
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int sum = 0;

        n--;

        while (n++ < m)
            sum += ((n % 2) == 0 ? -n : n);

        System.out.println(sum);
    }
}
