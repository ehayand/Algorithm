package problem01181_단어_정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2019-04-06
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<String> list = new LinkedList<>();

        for (int i = 0; i < n; i++)
            list.add(br.readLine());

        Collections.sort(list, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return o1.compareTo(o2);
            }
        });

        Iterator<String> iterator = list.iterator();

        String pre = "";
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (!pre.equals(temp)) {
                sb.append(temp).append("\n");
                pre = temp;
            }
        }

        System.out.print(sb.toString());
    }
}
