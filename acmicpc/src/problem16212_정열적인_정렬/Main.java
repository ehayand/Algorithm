package problem16212_정열적인_정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-03-03
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(temp[i]);

        Arrays.sort(arr);

        for (int i : arr)
            bw.write(i + " ");

        bw.flush();
    }
}
