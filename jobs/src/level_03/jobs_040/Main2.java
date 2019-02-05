package level_03.jobs_040;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2019-02-05
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");

        System.out.println(solution(n, temp));
    }

    public static String solution(int n, String[] temp) {
        if (n < 6) return "NO";

        int[] arr = new int[1001];
        List<Integer> colors = new LinkedList<>();

        for (int i = 0; i < n; i++)
            arr[Integer.parseInt(temp[i])]++;

        for (int i = 0; i < 1001; i++)
            if (arr[i] > 0) colors.add(i);

        int size = colors.size();

        if (size < 3) return "NO";
        else if (size > 4) return "YES";

        int count = 0;

        for (int i : colors)
            if (arr[i] > 1) count++;

        if (size == 4 && count > 1) return "YES";
        else if (size == 3 && count > 2) return "YES";
        else return "NO";
    }
}
