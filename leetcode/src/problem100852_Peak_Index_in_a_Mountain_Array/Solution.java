package problem100852_Peak_Index_in_a_Mountain_Array;

/**
 * Created by ehay@naver.com on 2018-09-10
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] inputA = {0, 1, 0};
        int[] inputB = {0, 2, 1, 0};

        System.out.println(solution.peakIndexInMountainArray(inputA) == 1);
        System.out.println(solution.peakIndexInMountainArray(inputB) == 1);
    }

    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return i - 1;
            }
        }
        return -1;
    }
}
