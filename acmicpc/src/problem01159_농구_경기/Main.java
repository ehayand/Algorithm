package problem01159_농구_경기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-28
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] alpha = new int[26];

        int temp;

        while (n-- > 0) {
            temp = (int)br.readLine().charAt(0);
            temp -= 97;
            alpha[temp]++;
        }

        for(int i=0; i<26; i++)
            if(alpha[i] > 4) sb.append((char)(i+97));

        if(sb.length() == 0) sb.append("PREDAJA");

        System.out.println(sb);
    }
}
