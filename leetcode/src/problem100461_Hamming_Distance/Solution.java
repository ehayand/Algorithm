package problem100461_Hamming_Distance;

/**
 * Created by ehay@naver.com on 2018-08-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int answer = solution.hammingDistance(1,4);
        System.out.println(answer == 2);
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
