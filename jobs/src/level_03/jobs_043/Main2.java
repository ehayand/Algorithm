package level_03.jobs_043;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-06
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[10][10];

        for(int k = 0; k<n; k++) {
            for(int i=0; i<10; i++){
                arr[k][i] = !arr[k][i];
                arr[i][k] = !arr[i][k];
            }
            arr[k][k] = !arr[k][k];
        }

        for(boolean[] i : arr) {
            for(boolean j : i)
                sb.append(j?1:0).append(" ");
            sb.replace(sb.length()-1, sb.length(), "\n");
        }

        System.out.print(sb.toString());
    }
}
