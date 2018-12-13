package problem01316_그룹_단어_체커;

import java.io.*;

/**
 * Created by ehay@naver.com on 2018-12-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static boolean check(char[] a) {
        boolean bool = true;
        int visit[] = new int[26];

        for (int i = 0; i < 26; i++) visit[i] = -1;

        visit[(int) a[0] - 97] = 1;

        for (int i = 1; i < a.length; i++) {
            if (visit[(int) a[i] - 97] == -1 || a[i] == a[i - 1]) visit[(int) a[i] - 97] = 1;
            else {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        char spell[];
        String str = br.readLine();
        int N = Integer.parseInt(str);

        for (int i = 0; i < N; i++) {
            str = new String(br.readLine());
            spell = str.toCharArray();

            if (check(spell)) count++;
        }

        bw.write(count + "\n");
        bw.flush();
    }
}
