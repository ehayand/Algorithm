package problem03653_영화_수집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-07-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);

            int[] inputArray = new int[n + 1];
            int[] fenwick = new int[n + m + 1];

            for (int i = 1; i <= n; i++) {
                inputArray[i] = i + m;
                update(fenwick, inputArray[i], 1);
            }

            temp = br.readLine().split(" ");

            for (int i = 0; i < m; i++) {
                int index = Integer.parseInt(temp[i]);
                sb.append(query(fenwick, inputArray[index]) - 1 + " ");
                update(fenwick, inputArray[index], -1);
                inputArray[index] = m - i;
                update(fenwick, inputArray[index], 1);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    public static int query(int[] fenwick, int index) {
        int sum = 0;
        while (index > 0) {
            sum += fenwick[index];
            index -= (index & (-index));
        }
        return sum;
    }

    public static void update(int[] fenwick, int index, int value) {
        while (index < fenwick.length) {
            fenwick[index] += value;
            index += (index & (-index));
        }
    }
}