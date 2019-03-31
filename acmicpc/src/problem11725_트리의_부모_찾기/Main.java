package problem11725_트리의_부모_찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by ehay@naver.com on 2019-03-31
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static LinkedList<Integer>[] list;
    static boolean[] visit;
    static int[] result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        list = new LinkedList[n];
        visit = new boolean[n];
        result = new int[n];

        for (int i = 0; i < n; i++)
            list[i] = new LinkedList<>();

        String[] temp;
        int s, e;

        for (int i = 0; i < n - 1; i++) {
            temp = br.readLine().split(" ");
            s = Integer.parseInt(temp[0]) - 1;
            e = Integer.parseInt(temp[1]) - 1;

            list[s].add(e);
            list[e].add(s);
        }

        dfs(0, 0);

        for (int i = 1; i < n; i++)
            sb.append(result[i] + 1).append("\n");

        System.out.print(sb.toString());
    }

    public static void dfs(int index, int parents) {
        visit[index] = true;
        result[index] = parents;

        for (int start : list[index]) {
            if (!visit[start])
                dfs(start, index);
        }
    }
}