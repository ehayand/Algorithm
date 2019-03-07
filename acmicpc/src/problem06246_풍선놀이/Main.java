package problem06246_풍선놀이;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-07
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n, q, l, r, count;
        n = Integer.parseInt(temp[0]);
        q = Integer.parseInt(temp[1]);

        boolean[] arr = new boolean[n + 1];
        arr[0] = true;

        while (q-- > 0) {
            temp = br.readLine().split(" ");
            l = Integer.parseInt(temp[0]);
            r = Integer.parseInt(temp[1]);

            for (int i = l; i <= n; i += r)
                if (!arr[i]) arr[i] = true;
        }

        count = 0;

        for (boolean b : arr)
            if (!b) count++;

        System.out.println(count);
    }
}
