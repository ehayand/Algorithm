package problem100657_Judge_Route_Circle;

/**
 * Created by ehay@naver.com on 2018-09-02
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.judgeCircle("UD") == true);
        System.out.println(solution.judgeCircle("LL") == false);
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(char move : moves.toCharArray()){
            switch (move){
                case 'U': y++;
                    break;
                case 'D': y--;
                    break;
                case 'L': x--;
                    break;
                case 'R': x++;
                    break;
            }
        }

        return x==0 && y==0;
    }
}
