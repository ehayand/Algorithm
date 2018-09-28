package problem100905_Sort_Array_By_Parity;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = {3, 1, 2, 4};
        int[] result = {4, 2, 1, 3};
        int[] ans = solution.sortArrayByParity(A);
        boolean flag = true;

        for(int i=0; i<result.length; i++){
            if(ans[i] != result[i]) {
                flag =false;
                break;
            }
        }

        System.out.println(flag);
    }

    public int[] sortArrayByParity(int[] A) {

        boolean flag = true;
        int i = 0;
        int j = A.length - 1;

        while (flag) {
            while (flag && A[i] == 0) {
                i++;
                if (i >= j) flag = false;
            }

            while (flag && A[j] != 0) {
                j--;
                if (i >= j) flag = false;
            }

            if (flag) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        flag = true;
        i = 0;
        j = A.length - 1;

        while (flag) {
            while (flag && A[i] % 2 == 0) {
                i++;
                if (i >= j) flag = false;
            }

            while (flag && A[j] % 2 != 0) {
                j--;
                if (i >= j) flag = false;
            }

            if (flag) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        return A;
    }
}
