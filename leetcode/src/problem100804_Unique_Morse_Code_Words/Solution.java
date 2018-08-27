package problem100804_Unique_Morse_Code_Words;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ehay@naver.com on 2018-08-25
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(solution.uniqueMorseRepresentations(words) == 2);
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();
        for(String word : words){
            StringBuilder code = new StringBuilder();
            for(char c : word.toCharArray()) code.append(morse[c-'a']);
            set.add(code.toString());
        }

        return set.size();
    }
}
