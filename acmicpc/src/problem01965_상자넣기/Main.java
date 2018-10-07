package problem01965_상자넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ehay@naver.com on 2018-10-07
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] boxes = new int[n];
        int[] lis = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) boxes[i] = Integer.parseInt(st.nextToken());

        int ans = 1;
        lis[0] = boxes[0];
        for (int i = 1; i < n; i++) {
            if (lis[ans - 1] < boxes[i]) lis[ans++] = boxes[i];
            else {
                int index = lowerBound(lis, 0, ans, boxes[i]);
                lis[index] = boxes[i];
            }
        }

        System.out.println(ans);
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
}
