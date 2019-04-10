package problem10814_나이순_정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ehay@naver.com on 2019-04-10
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<User> users = new ArrayList<>(n);

        String[] temp;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            users.add(new User(i, Integer.parseInt(temp[0]), temp[1]));
        }

        Collections.sort(users);

        for (User u : users) {
            sb.append(u.age)
                    .append(" ")
                    .append(u.name)
                    .append("\n");
        }

        System.out.print(sb.toString());
    }

    static class User implements Comparable<User> {
        int num;
        int age;
        String name;

        public User(int num, int age, String name) {
            this.num = num;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            if (this.age > o.age) return 1;
            else if (this.age < o.age) return -1;
            else {
                if (this.num > o.num) return 1;
                else return -1;
            }
        }
    }
}
