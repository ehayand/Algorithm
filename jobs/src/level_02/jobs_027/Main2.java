package level_02.jobs_027;

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

        int max = 0;
        int pointer = 0;

        for (int i = 0; i < N; i++)
            if (max < arr[i]) max = arr[pointer = i];

        System.out.println(max + "\n" + ++pointer);
    }
}
