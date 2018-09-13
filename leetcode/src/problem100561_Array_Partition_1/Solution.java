package problem100561_Array_Partition_1;

/**
 * Created by ehay@naver.com on 2018-09-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input = {1, 4, 3, 2};

        System.out.println(solution.arrayPairSum(input) == 4);
    }

    public int arrayPairSum(int[] nums) {
        int[] temp = new int[20001];
        int sum = 0;
        boolean odd = true;

        for (int i = 0; i < nums.length; i++) temp[nums[i] + 10000]++;

        for (int i = 0; i < temp.length; i++) {
            while (temp[i]-- > 0) {
                if (odd) sum += i - 10000;
                odd = !odd;
            }
        }

        return sum;
    }
}
