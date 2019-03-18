package problem10798_세로_읽기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-18
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] words = new char[5][15];
        String temp;

        for (int i = 0; i < 5; i++) {
            temp = br.readLine();

            for (int j = 0; j < temp.length(); j++)
                words[i][j] = temp.charAt(j);
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++)
                if (words[j][i] != 0) sb.append(words[j][i]);
        }

        System.out.println(sb.toString());
    }
}
