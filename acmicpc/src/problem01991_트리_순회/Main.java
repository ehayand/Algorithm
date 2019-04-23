package problem01991_트리_순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-10-06
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static List<Node> tree;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList<>(n);

        for (int i = 0; i < n; i++) tree.add(null);

        while (n-- > 0) {
            String[] temp = br.readLine().split(" ");
            Node node = new Node(temp[0], temp[1], temp[2]);

            int index = temp[0].charAt(0) - 65;

            tree.set(index, node);
        }

        preorder("A");
        sb.append("\n");
        inorder("A");
        sb.append("\n");
        postorder("A");

        System.out.println(sb.toString());
    }

    //전위 순회
    static void preorder(String str) {
        if (".".equals(str)) return;
        if (str == null) return;

        int node = str.charAt(0) - 65;
        String left = tree.get(node).left;
        String right = tree.get(node).right;

        sb.append(str);
        preorder(left);
        preorder(right);
    }

    //중위 순회
    static void inorder(String str) {
        if (".".equals(str)) return;
        if (str == null) return;

        int node = str.charAt(0) - 65;
        String left = tree.get(node).left;
        String right = tree.get(node).right;

        inorder(left);
        sb.append(str);
        inorder(right);
    }

    //후위 순회
    static void postorder(String str) {
        if (".".equals(str)) return;
        if (str == null) return;

        int node = str.charAt(0) - 65;
        String left = tree.get(node).left;
        String right = tree.get(node).right;

        postorder(left);
        postorder(right);
        sb.append(str);
    }

    static class Node {
        String parent;
        String left;
        String right;

        public Node(String parent, String left, String right) {
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }
}
