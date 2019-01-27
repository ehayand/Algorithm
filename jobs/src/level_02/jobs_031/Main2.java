package level_02.jobs_031;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = 0;
        String[] temp;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            int money = games(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
            if (max < money) max = money;
        }

        System.out.println(max);
    }

    private static int games(int a, int b, int c) {
        int money;

        if (a == b && b == c) money = 10000 + (a * 1000);
        else {
            if(a==b || a==c) money = 1000 + (a * 100);
            else if(b==c) money = 1000 + (b * 100);
            else money = getMaxPoint(a, b, c) * 100;
        }

        return money;
    }

    private static int getMaxPoint(int a, int b, int c) {
        int max = 0;

        if(max < a) max = a;
        if(max < b) max = b;
        if(max < c) max = c;

        return max;
    }
}
