package problem14719_빗물;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-04-22
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int h = Integer.parseInt(temp[0]);
        int w = Integer.parseInt(temp[1]);

        int[] bricks = new int[w];

        temp = br.readLine().split(" ");

        for (int i = 0; i < w; i++)
            bricks[i] = Integer.parseInt(temp[i]);

        int[] left = new int[w];
        int[] right = new int[w];

        left[0] = bricks[0];
        right[w - 1] = bricks[w - 1];

        for (int i = 1; i < w; i++) {
            left[i] = Math.max(left[i - 1], bricks[i]);
            right[w - 1 - i] = Math.max(right[w - i], bricks[w - 1 - i]);
        }

        int answer = 0;

        for (int i = 1; i < w - 1; i++)
            answer += (Math.min(left[i], right[i]) - bricks[i]);

        System.out.println(answer);
    }
}
