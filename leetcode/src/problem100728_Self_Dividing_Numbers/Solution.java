package problem100728_Self_Dividing_Numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-09-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        Integer[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22};

        int i = -1;
        boolean flag = true;
        for (Integer num : solution.selfDividingNumbers(1, 22)) {
            if (!num.equals(result[++i])) flag = false;
        }

        System.out.println(flag);
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();

        for (int i = left; i <= right; i++) {
            if (isSelfDivingNumber(i)) list.add(i);
        }

        return list;
    }

    public boolean isSelfDivingNumber(int number) {
        int result = number;
        int remainder;

        while (result != 0) {
            remainder = result % 10;
            if (remainder == 0 || number % remainder != 0) return false;
            result /= 10;
        }

        return true;
    }
}