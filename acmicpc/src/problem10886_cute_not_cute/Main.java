package problem10886_cute_not_cute;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-17
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cute, notCute;

        cute = notCute = 0;

        while (n-- > 0) {
            if (br.readLine().charAt(0) == '0') notCute++;
            else cute++;
        }

        System.out.println(cute > notCute ? "Junhee is cute!" : "Junhee is not cute!");
    }
}
