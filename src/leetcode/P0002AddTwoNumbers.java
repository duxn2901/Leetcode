package leetcode;

public class P0002AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode head = new ListNode();
        dummy.next = head;
        int digitSum;
        boolean carry = false;

        while (!(l1 == null && l2 == null)) {
            
            
            if (l1 == null) digitSum = l2.val;
            else if (l2 == null) digitSum = l1.val;
            else digitSum = l1.val + l2.val;
            if (carry) {
                digitSum++;
                carry = false;
            }
            if (digitSum > 9) {
                digitSum = digitSum % 10;
                carry = true;
            }
            head.val = digitSum;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 != null || l2 != null) {
                head.next = new ListNode();
                head = head.next;
            }
        }
        if (carry) head.next = new ListNode(1);
        return dummy.next;
    }
}
