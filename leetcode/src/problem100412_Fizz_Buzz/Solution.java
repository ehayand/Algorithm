package problem100412_Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2019-04-18
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> ret = new ArrayList(n);

        for(int i=1; i<=n; i++) {
            boolean multiplesOfThree = (i%3 == 0);
            boolean multiplesOfFive = (i%5 == 0);

            if(multiplesOfThree && multiplesOfFive) {
                ret.add("FizzBuzz");
            }
            else if(multiplesOfThree) {
                ret.add("Fizz");
            }
            else if(multiplesOfFive) {
                ret.add("Buzz");
            } else {
                ret.add(Integer.toString(i));
            }
        }

        return ret;
    }
}
