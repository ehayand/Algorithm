package problem02042_구간_합_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-07-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Fenwick {

    static long[] fenwick, inputArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int select, queryL, queryR, index;
        long ans, value, difference;
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int k = Integer.parseInt(temp[2]);

        fenwick = new long[n + 1];
        inputArray = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            inputArray[i] = Integer.parseInt(br.readLine());
            update(i, inputArray[i]);
        }

        for (int i = 0; i < m + k; i++) {
            temp = br.readLine().split(" ");
            select = Integer.parseInt(temp[0]);
            if (select == 1) {
                index = Integer.parseInt(temp[1]);
                value = Long.parseLong(temp[2]);
                difference = value - inputArray[index];
                inputArray[index] = value;
                update(index, difference);
            } else {
                queryL = Integer.parseInt(temp[1]);
                queryR = Integer.parseInt(temp[2]);
                ans = query(queryL, queryR);
                sb.append(ans + "\n");
            }
        }

        System.out.print(sb.toString());
    }

    public static long query(int index) {
        long sum = 0;
        while (index > 0) {
            sum += fenwick[index];
            index -= (index & (-index));
        }
        return sum;
    }

    public static long query(int queryL, int queryR) {
        return query(queryR) - query(queryL - 1);
    }

    public static void update(int index, long value) {
        while (index < fenwick.length) {
            fenwick[index] += value;
            index += (index & (-index));
        }
    }
}
