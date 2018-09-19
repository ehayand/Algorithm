package problem10866_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[] q = new int[20001];
    static int head = 10000, tail = 9999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String[] temp;

        while (t-- > 0) {
            temp = br.readLine().split(" ");

            if ("push_front".equals(temp[0])) {
                push_front(Integer.parseInt(temp[1]));
            } else if ("push_back".equals(temp[0])) {
                push_back(Integer.parseInt(temp[1]));
            } else if ("pop_front".equals(temp[0])) {
                sb.append(pop_front()).append("\n");
            } else if ("pop_back".equals(temp[0])) {
                sb.append(pop_back()).append("\n");
            } else if ("front".equals(temp[0])) {
                sb.append(front()).append("\n");
            } else if ("back".equals(temp[0])) {
                sb.append(back()).append("\n");
            } else if ("size".equals(temp[0])) {
                sb.append(size()).append("\n");
            } else {
                sb.append(empty()).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

    static void push_front(int value) {
        q[--head] = value;
    }

    static void push_back(int value) {
        q[++tail] = value;
    }

    static int pop_front() {
        return empty() == 0 ? q[head++] : -1;
    }

    static int pop_back() {
        return empty() == 0 ? q[tail--] : -1;
    }

    static int front() {
        return empty() == 0 ? q[head] : -1;
    }

    static int back() {
        return empty() == 0 ? q[tail] : -1;
    }

    static int size() {
        return empty() == 0 ? tail - head + 1 : 0;
    }

    static int empty() {
        return head > tail ? 1 : 0;
    }
}
