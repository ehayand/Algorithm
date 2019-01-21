package level_01.jobs_017;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int value = 1;

        while (value * value++ < n) ;

        System.out.println(--value);
    }
}
