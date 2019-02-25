package problem01085_직사각형에서_탈출;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-25
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int x, y, w, h;

        x = Integer.parseInt(temp[0]);
        y = Integer.parseInt(temp[1]);
        w = Integer.parseInt(temp[2]);
        h = Integer.parseInt(temp[3]);

        if (x > w - x) x = w - x;
        if (y > h - y) y = h - y;

        System.out.println(x < y ? x : y);
    }
}
