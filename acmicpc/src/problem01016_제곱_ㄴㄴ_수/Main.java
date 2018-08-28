package problem01016_제곱_ㄴㄴ_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-08-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isOO = new boolean[1000002];
        String[] temp = br.readLine().split(" ");
        long min = Long.parseLong(temp[0]);
        long max = Long.parseLong(temp[1]);
        long sqrtMax = (long) Math.sqrt(max);
        int ooCount = 0;

        for (long i = 2; i <= sqrtMax; i++) {
            long square = i * i;
            long start = ((min - 1) / square + 1) * square;
            for (long j = start; j <= max; j += square) {
                if (!isOO[(int) (j - min)]) {
                    isOO[(int) (j - min)] = true;
                    ooCount++;
                }
            }
        }

        System.out.println((int) (max - min - ooCount + 1));
    }
}
