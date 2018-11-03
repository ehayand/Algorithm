package problem11758_CCW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-11-03
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        Point P1 = new Point(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        temp = br.readLine().split(" ");
        Point P2 = new Point(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        temp = br.readLine().split(" ");
        Point P3 = new Point(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));

        int d = ccw(P1, P2, P3);

        if (d > 0) System.out.println(1); // 반시계
        else if (d < 0) System.out.println(-1); // 시계
        else System.out.println(0); // 일직선
    }

    public static int ccw(Point A, Point B, Point C) {
        return (B.x - A.x) * (C.y - A.y) - (C.x - A.x) * (B.y - A.y);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}