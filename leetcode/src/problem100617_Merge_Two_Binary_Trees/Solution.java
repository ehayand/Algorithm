package problem100617_Merge_Two_Binary_Trees;

/**
 * Created by ehay@naver.com on 2018-09-06
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.left.left = new TreeNode(5);
        tree1.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(1);
        tree2.left.right = new TreeNode(4);
        tree2.right = new TreeNode(3);
        tree2.right.right = new TreeNode(7);

        TreeNode answerTree = solution.mergeTrees(tree1, tree2);
        int[] val = new int[6];
        val[0] = answerTree.val;
        val[1] = answerTree.left.val;
        val[2] = answerTree.left.left.val;
        val[3] = answerTree.left.right.val;
        val[4] = answerTree.right.val;
        val[5] = answerTree.right.right.val;

        int[] ans = {3, 4, 5, 4, 5, 7};
        boolean flag = true;

        for (int i = 0; i < 6; i++) {
            if (val[i] != ans[i]) flag = false;
        }

        System.out.println(flag);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2 == null ? null : t2;
        }
        if (t2 == null) return t1;

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
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
