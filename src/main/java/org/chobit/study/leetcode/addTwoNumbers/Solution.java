package org.chobit.study.leetcode.addTwoNumbers;

public class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        ListNode tmp = result;
        int carry = 0;
        while (null != l1 || null != l2 || carry > 0) {
            int val = (null == l1 ? 0 : l1.val) + (null == l2 ? 0 : l2.val);
            tmp.val = (val + carry) % 10;

            carry = (val + carry) / 10;

            l1 = null == l1 ? null : l1.next;
            l2 = null == l2 ? null : l2.next;

            tmp.next = (null != l1 || null != l2 || carry > 0) ? new ListNode() : null;
            tmp = tmp.next;
        }
        return result;
    }


}
