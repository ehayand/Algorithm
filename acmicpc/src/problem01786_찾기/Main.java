package problem01786_찾기;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-09-02
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t = br.readLine();
        String p = br.readLine();

        List<Integer> ans = kmp(t, p);
        bw.write(ans.size() + "\n");

        for (Integer i : ans) {
            bw.write((i + 1) + "\n");
        }

        bw.flush();
    }

    public static int[] getPi(String pattern) {
        char[] charsPattern = pattern.toCharArray();
        int m = pattern.length();
        int j = 0;

        int[] pi = new int[m];

        for (int i = 1; i < m; i++) {
            while (j > 0 && charsPattern[i] != charsPattern[j]) {
                j = pi[j - 1];
            }

            if (charsPattern[i] == charsPattern[j]) {
                pi[i] = ++j;
            }
        }

        return pi;
    }

    public static List<Integer> kmp(String string, String pattern) {
        List<Integer> ans = new ArrayList();
        char[] charsString = string.toCharArray();
        char[] charsPattern = pattern.toCharArray();
        int[] pi = getPi(pattern);
        int n = string.length();
        int m = pattern.length();
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j > 0 && charsString[i] != charsPattern[j]) {
                j = pi[j - 1];
            }

            if (charsString[i] == charsPattern[j]) {
                if (j == m - 1) {
                    ans.add(i - m + 1);
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }

        return ans;
    }
}
