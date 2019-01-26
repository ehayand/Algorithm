package level_02.jobs_029;

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
        int n = Integer.parseInt(br.readLine());
        boolean[] ox = new boolean[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++)
            if ("1".equals(temp[i])) ox[i] = true;

        int sum = 0;
        int add = 0;

        for (int i=0; i<n; i++){
            if(ox[i]) sum = sum + 1 + add++;
            else add = 0;
        }

        System.out.println(sum);
    }
}
