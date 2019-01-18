package level_01.jobs_008;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-18
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int result = 0;

        for(String str : temp)
            result = result > Integer.parseInt(str) ? result : Integer.parseInt(str);

        System.out.println(result);
    }
}
