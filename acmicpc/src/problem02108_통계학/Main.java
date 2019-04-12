package problem02108_통계학;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-04-12
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[] counts = new int[8001];
    static int[] arr;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        int num;

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            arr[i] = num;

            num += 4000;
            counts[num]++;
        }

        Arrays.sort(arr);

        System.out.println(arithmeticMean() + "\n" + median() + "\n" + mode() + "\n" + range());
    }

    public static int arithmeticMean() {
        int sum = 0;

        for (int i : arr)
            sum += i;

        return Math.round(sum / (float) N);
    }

    public static int median() {
        return arr[N >> 1];
    }

    public static int mode() {
        boolean flag = false;
        int result, max;
        result = max = 0;

        for (int i = 0; i < 8001; i++) {
            if (max < counts[i]) max = counts[i];
        }

        for (int i = 0; i < 8001; i++) {
            if (max == counts[i]) {
                result = i;
                if (flag) {
                    break;
                } else {
                    flag = true;
                }
            }
        }

        return result < 4000 ? -(4000 - result) : (result - 4000);
    }

    public static int range() {
        return arr[N - 1] - arr[0];
    }
}
