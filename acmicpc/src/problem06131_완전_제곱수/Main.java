package problem06131_완전_제곱수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-05
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[250001];

        for (int i = 1; i < 501; i++)
            arr[i * i] = true;

        int count = 0;

        for (int i = 1; i < 501; i++) {
            int j = (i * i) - n;

            if (j > 0 && arr[j]) count++;
        }

        System.out.println(count);
    }
}
