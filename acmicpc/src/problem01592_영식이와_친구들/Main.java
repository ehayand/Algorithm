package problem01592_영식이와_친구들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-10-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[] arr;
    static int n, m, l;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        l = Integer.parseInt(temp[2]);

        arr = new int[n + 1];

        count = 0;
        int index = 1;

        while (index != -1) index = path(index);

        System.out.println(count);
    }

    public static int path(int index) {
        if (++arr[index] == m) return -1;
        else if (arr[index] % 2 == 0) index = (index + l) % n;
        else index = (index - l + n) % n;

        count++;

        return index;
    }
}
