package problem02565_전깃줄;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-10-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Line[] lines = new Line[n];
        int[] points = new int[n];
        int[] lis = new int[n];

        String[] temp;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            lines[i] = new Line(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }

        Arrays.sort(lines);

        for (int i = 0; i < n; i++) {
            points[i] = lines[i].right;
        }

        int ans = 1;
        lis[0] = points[0];
        for (int i = 1; i < n; i++) {
            if (lis[ans - 1] < points[i]) lis[ans++] = points[i];
            else {
                int index = lowerBound(lis, 0, ans, points[i]);
                lis[index] = points[i];
            }
        }

        System.out.println(n - ans);
    }

    static int lowerBound(int[] arr, int first, int last, int value) {

        while (first < last) {
            int mid = (first + last) / 2;

            int midValue = arr[mid];

            if (midValue < value) {
                first = mid + 1;
            } else {
                last = mid;
            }
        }

        return first;
    }

    static class Line implements Comparable<Line> {

        int left;
        int right;

        public Line(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Line o) {
            return this.left < o.left ? -1 : 1;
        }
    }
}
