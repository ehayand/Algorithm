package problem01158_조세퍼스_문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-17
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 * Circular Queue
 */

public class Main {

    static final int size = 5001;
    static int[] q = new int[size+1];
    static int head = 0, tail;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        for (int i = 1; i < n+1; i++) q[i] = i;

        tail = n;

        sb.append("<");
        while(!isEmpty()){
            for(int i=1; i<m; i++) push(pop());
            sb.append(pop()).append(", ");
        }

        sb.delete(sb.length()-2, sb.length()).append(">");
        System.out.print(sb.toString());
    }

    static void push(int value) {
        tail = (++tail) % size;
        q[tail] = value;
    }

    static int pop() {
        if(!isEmpty()){
            head = (++head) % size;
            return q[head];
        } else return -1;
    }

    static boolean isEmpty() {
        return head == tail ? true : false;
    }
}
