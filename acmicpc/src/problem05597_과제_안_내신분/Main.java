package problem05597_과제_안_내신분;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] report = new boolean[31];

        int n;

        for(int i=0; i<28; i++){
            n = Integer.parseInt(br.readLine());
            report[n] = true;
        }

        for(int i=1; i<31; i++)
            if(!report[i]) sb.append(i).append("\n");

        System.out.print(sb);
    }
}
