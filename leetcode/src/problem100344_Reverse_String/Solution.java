package problem100344_Reverse_String;

/**
 * Created by ehay@naver.com on 2019-04-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {
    public void reverseString(char[] s) {
        for (int left = 0; left < s.length / 2; left++) {
            int right = s.length - 1 - left;
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
