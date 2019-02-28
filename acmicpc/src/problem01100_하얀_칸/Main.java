package problem01100_하얀_칸;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-28
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr;
        int j, count = 0;

        for (int i = 1; i <= 8; i++) {
            if ((i % 2) == 0) j = 1;
            else j = 0;

            arr = br.readLine().toCharArray();
            for (; j < 8; j += 2) if (arr[j] == 'F') count++;
        }

        System.out.println(count);
    }
}
