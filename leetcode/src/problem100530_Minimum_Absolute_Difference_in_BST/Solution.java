package problem100530_Minimum_Absolute_Difference_in_BST;

/**
 * Created by ehay@naver.com on 2019-04-17
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

class Solution {
    boolean init;
    int min;
    int prev;

    public int getMinimumDifference(TreeNode root) {
        init = false;
        min = Integer.MAX_VALUE;

        inorder(root);

        return min;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        //self 처리
        if (!init) {
            init = true;
        } else {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        inorder(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}