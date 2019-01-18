package level_01.jobs_009;

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
        int year = Integer.parseInt(br.readLine());

        System.out.println(check(year) ? "YES" : "NO");
    }

    private static boolean check(int year) {
        if (year % 400 == 0) return true;
        else if (year % 4 == 0)
            if (year % 100 != 0) return true;
        return false;
    }
}
