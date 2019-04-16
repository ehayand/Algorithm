package problem100021_Merge_Two_Sorted_Lists;

/**
 * Created by ehay@naver.com on 2019-04-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = null;
        ListNode cur = null;

        while (l1 != null || l2 != null) {
            if (l2 == null || (l1 != null && l1.val < l2.val)) {
                if (ret == null) {
                    ret = l1;
                    cur = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l1;
                    cur = cur.next;
                    l1 = l1.next;
                }
            } else {
                if (ret == null) {
                    ret = l2;
                    cur = l2;
                    l2 = l2.next;
                } else {
                    cur.next = l2;
                    cur = cur.next;
                    l2 = l2.next;
                }
            }
        }

        return ret;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}