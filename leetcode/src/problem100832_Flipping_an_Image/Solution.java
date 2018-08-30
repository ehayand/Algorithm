package problem100832_Flipping_an_Image;

/**
 * Created by ehay@naver.com on 2018-08-30
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] input = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] output = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        int[][] answer = solution.flipAndInvertImage(input);
        boolean isSame = true;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (output[i][j] != answer[i][j]) isSame = false;
            }
        }

        System.out.println(isSame);
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            for (int i = 0, j = row.length - 1; i < j; i++, j--) swap(row, i, j);
            invert(row);
        }
        return A;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }
}
