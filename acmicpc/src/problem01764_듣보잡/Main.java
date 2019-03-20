package problem01764_듣보잡;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by ehay@naver.com on 2019-03-20
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        Set<String> set = new LinkedHashSet<>();
        List<String> list = new LinkedList<>();

        String name;
        for(int i=0; i<n; i++) {
            name = br.readLine();
            set.add(name);
        }

        for(int i=0; i<m; i++){
            name = br.readLine();
            if(set.contains(name)) list.add(name);
        }

        list.sort(String::compareTo);

        sb.append(list.size()).append("\n");

        for(String str : list)
            sb.append(str).append("\n");

        System.out.print(sb.toString());
    }
}
