package problem100771_Jewels_and_Stones;

/**
 * Created by ehay@naver.com on 2018-08-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int answer = solution.numJewelsInStones("aA", "aAAbbbb");
        System.out.println(answer == 3);

        answer = solution.numJewelsInStones("z", "ZZ");
        System.out.println(answer == 0);
    }

    public int numJewelsInStones(String J, String S) {
        int count = 0;

        for(char stone : S.toCharArray()){
            if(J.indexOf(stone) != -1) count++;
        }

        return count;
    }
}
