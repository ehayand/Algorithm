package level_01.jobs_018;

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
        String[] temp = br.readLine().split(" ");
        int A = Integer.parseInt(temp[0]);
        int B = Integer.parseInt(temp[1]);
        int C = Integer.parseInt(temp[2]);

        if (A > B) {
            int i = A;
            A = B;
            B = i;
        }

        int count = 0;
        A--;

        while (A++ < B)
            count += (A % C) == 0 ? 1 : 0;

        System.out.println(count);
    }
}
