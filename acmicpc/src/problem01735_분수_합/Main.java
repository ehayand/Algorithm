package problem01735_분수_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-10-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int firstMolecular = Integer.parseInt(temp[0]);
        int firstDenominator = Integer.parseInt(temp[1]);
        temp = br.readLine().split(" ");
        int secondMolecular = Integer.parseInt(temp[0]);
        int secondDenominator = Integer.parseInt(temp[1]);

        int resultMolecular = (firstMolecular * secondDenominator) + (firstDenominator * secondMolecular);
        int resultDenominator = firstDenominator * secondDenominator;

        int g = gcd(resultMolecular, resultDenominator);

        resultMolecular /= g;
        resultDenominator /= g;

        System.out.println(resultMolecular + " " + resultDenominator);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
