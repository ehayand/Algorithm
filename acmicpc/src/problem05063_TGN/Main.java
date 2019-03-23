package problem05063_TGN;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-23
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static String a = "advertise";
    static String dna = "do not advertise";
    static String dnm = "does not matter";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int r, e, c;
        String[] temp;

        while (n-- > 0) {
            temp = br.readLine().split(" ");
            r = Integer.parseInt(temp[0]);
            e = Integer.parseInt(temp[1]);
            c = Integer.parseInt(temp[2]);

            r -= (e - c);

            if (r < 0) sb.append(a);
            else if (r > 0) sb.append(dna);
            else sb.append(dnm);

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
