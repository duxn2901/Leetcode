package leetcode;

public class P0143ReorderList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode prevSlow = new ListNode();
        prevSlow.next = slow;
        ListNode fast = head;

        //find middle. treat slow as always in the right array
        while (fast != null && fast.next != null) {
            slow = slow.next;
            prevSlow = prevSlow.next;
            fast = fast.next.next;
        }
        prevSlow.next = null;

        ListNode reversePrev = null;
        ListNode reverseCurrent = slow;
        
        while (reverseCurrent != null) {
            ListNode reverseNext = reverseCurrent.next;
            reverseCurrent.next = reversePrev;
            reversePrev = reverseCurrent;
            reverseCurrent = reverseNext;
        }
        ListNode currentRight = reversePrev;
        ListNode currentLeft = head;
        
        ListNode start = new ListNode();
        ListNode current = start;
        
        while (!(currentLeft == null && currentRight == null)) {
            if (currentLeft != null) {
                current.next = currentLeft;
                current = current.next;
                currentLeft = currentLeft.next;
            }

            if (currentRight != null) {
                current.next = currentRight;
                current = current.next;
                currentRight = currentRight.next;
            }
            
            
        }

    }
}
