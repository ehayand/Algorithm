package problem100104_Maximum_Depth_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ehay@naver.com on 2019-04-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Solution {
    public static int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    public static int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        if (node.left == null && node.right == null) {
            return depth + 1;
        }

        return Math.max(dfs(node.left, depth + 1), dfs(node.right, depth + 1));
    }

    public static int bfs(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList();

        q.offer(root);

        int depth = 0;

        while (!q.isEmpty()) {
            depth++;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }

        return depth;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
