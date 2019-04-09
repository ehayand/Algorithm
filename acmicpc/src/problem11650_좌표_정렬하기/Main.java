package problem11650_좌표_정렬하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ehay@naver.com on 2019-04-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<Point> points = new ArrayList<>(n);

        int x, y;
        String[] temp;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            x = Integer.parseInt(temp[0]);
            y = Integer.parseInt(temp[1]);

            points.add(new Point(x, y));
        }

        Collections.sort(points);

        for (Point p : points) {
            sb.append(p.x)
                    .append(" ")
                    .append(p.y)
                    .append("\n");
        }

        System.out.print(sb.toString());
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            if (this.x > p.x) return 1;
            else if (this.x < p.x) return -1;
            else {
                if (this.y > p.y) return 1;
                else return -1;
            }
        }
    }
}
