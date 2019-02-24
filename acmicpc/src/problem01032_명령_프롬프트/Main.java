package problem01032_명령_프롬프트;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String temp = br.readLine();
        if (n == 1) {
            System.out.println(temp);
            return;
        }

        boolean flag;
        char c;
        int size = temp.length();

        char[][] arr = new char[n][size + 1];
        arr[0] = temp.toCharArray();

        for (int i = 1; i < n; i++)
            arr[i] = br.readLine().toCharArray();

        for (int i = 0; i < size; i++) {
            flag = true;
            c = arr[0][i];
            for (int j = 0; j < n; j++) {
                if (arr[j][i] != c) {
                    flag = false;
                    break;
                }
            }

            if (flag) sb.append(c);
            else sb.append('?');
        }

        System.out.print(sb.toString());
    }
}
