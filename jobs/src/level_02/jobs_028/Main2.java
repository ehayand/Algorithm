package level_02.jobs_028;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-26
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 9;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        int min = 10000001;
        int next = 10000001;
        int pointer = 0;
        int nextIndex = 0;

        for (int i = 0; i < N; i++)
            if (min > arr[i]) min = arr[pointer = i];

        for (int i = 0; i < N; i++) {
            if (i == pointer) continue;
            if (next > arr[i]) next = arr[nextIndex = i];
        }

        System.out.println(next + "\n" + ++nextIndex);
    }
}
