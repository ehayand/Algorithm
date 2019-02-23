package problem01037_약수;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-02-23
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[k];

        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < k; i++)
            arr[i] = Integer.parseInt(temp[i]);

        Arrays.sort(arr);

        System.out.println(arr[0] * arr[k - 1]);
    }
}
