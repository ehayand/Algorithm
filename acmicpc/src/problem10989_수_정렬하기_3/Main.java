package problem10989_수_정렬하기_3;

import java.io.*;

/**
 * Created by ehay@naver.com on 2018-08-31
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = new int[10001];
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) list[Integer.parseInt(br.readLine())]++;

        for (int i = 1; i < 10001; i++) {
            while (list[i]-- > 0) bw.write(i+"\n");
        }

        bw.flush();
    }
}
