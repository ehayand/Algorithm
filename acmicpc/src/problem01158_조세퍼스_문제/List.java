package problem01158_조세퍼스_문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ehay@naver.com on 2018-09-18
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 * List
 */

public class List {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]) - 1;
        //List<Integer> q = new ArrayList();
        ArrayList<Integer> q = new ArrayList();

        for (int i = 1; i < n + 1; i++) q.add(i);

        sb.append("<");

        int index = 0;

        while (!q.isEmpty()) {
            index += m;
            index %= q.size();
            sb.append(q.remove(index)).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.print(sb.toString());
    }
}
