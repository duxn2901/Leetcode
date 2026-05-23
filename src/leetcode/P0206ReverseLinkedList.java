package leetcode;

public class P0206ReverseLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode prev = null;
        ListNode now = head;
        ListNode next = head.next;
        while (true) {
            now.next = prev;
            prev = now;
            now = next;
            if (next == null) break;
            next = next.next;
        }
        return prev;
    }

    
}
