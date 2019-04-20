package problem100136_Single_Number;

/**
 * Created by ehay@naver.com on 2019-04-20
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ret = 0;

        for (int i = 0; i < nums.length; i++) {
            ret ^= nums[i];
        }

        return ret;
    }
}
