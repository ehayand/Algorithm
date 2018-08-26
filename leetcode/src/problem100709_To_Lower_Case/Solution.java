package problem100709_To_Lower_Case;

/**
 * Created by ehay@naver.com on 2018-08-25
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "Hello";
        System.out.println("hello".equals(solution.toLowerCase(str)));
        str = "here";
        System.out.println("here".equals(solution.toLowerCase(str)));
        str = "LOVELY";
        System.out.println("lovely".equals(solution.toLowerCase(str)));
    }


    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
