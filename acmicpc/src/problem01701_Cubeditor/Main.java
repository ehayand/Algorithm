package problem01701_Cubeditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-04
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        System.out.println(maxSubstringLengthByKmp(string));
    }

    public static int maxSubstringLengthByKmp(String string) {
        char[] charsString = string.toCharArray();
        int n = string.length();
        int max = 0;

        int[] pi = new int[n];

        for (int i = 0; i < n; i++) {
            int k = 0;

            for (int j = 1; j < n - i; j++) {
                while (k > 0 && charsString[i + j] != charsString[i + k]) {
                    k = pi[k - 1];
                }

                if (charsString[i + j] == charsString[i + k]) {
                    pi[j] = ++k;
                } else {
                    pi[j] = 0;
                }

                max = pi[j] > max ? pi[j] : max;
            }
        }

        return max;
    }
}
