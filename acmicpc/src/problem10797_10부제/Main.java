package problem10797_10부제;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        String[] temp = br.readLine().split(" ");
        for (String str : temp)
            if (Integer.parseInt(str) % 10 == n) count++;

        System.out.println(count);
    }
}