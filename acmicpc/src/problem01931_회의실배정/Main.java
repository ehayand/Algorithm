package problem01931_회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-10-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Time[] times = new Time[n];

        String[] temp;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            times[i] = new Time(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }

        Arrays.sort(times);

        System.out.println(counting(times));
    }

    public static int counting(final Time[] times) {
        int count = 0;
        int end = 0;

        for (final Time time : times) {
            if (time.start >= end) {
                end = time.end;
                count++;
            }
        }

        return count;
    }


    static class Time implements Comparable<Time> {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.end < o.end) return -1;
            else if (this.end == o.end) {
                if (this.start < o.start) return -1;
            }
            return 1;
        }
    }
}
