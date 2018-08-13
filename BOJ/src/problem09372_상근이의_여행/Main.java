package problem09372_상근이의_여행;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-08-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;
        int n, m;
        int t = Integer.parseInt(br.readLine());

        for (int test = 0; test < t; test++) {
            temp = br.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);

            while(m-->0) br.readLine();

            sb.append(n-1+"\n");
        }

        System.out.print(sb.toString());
    }
}
