package problem16170_오늘의_날짜는;

import java.time.Clock;
import java.time.LocalDateTime;

/**
 * Created by ehay@naver.com on 2019-03-05
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        LocalDateTime localDate = LocalDateTime.now(Clock.systemUTC());

        sb.append(localDate.getYear()).append("\n")
                .append(localDate.getMonthValue()).append("\n")
                .append(localDate.getDayOfMonth());

        System.out.println(sb.toString());
    }
}
