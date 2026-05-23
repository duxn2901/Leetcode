package leetcode;

public class P0021Merge2LinkedLists2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode current1 = list1;
        ListNode current2 = list2;
        
        ListNode head = new ListNode();
        ListNode current = head;
        

        while (current1 != null || current2 != null) { 
            while (current1 == null && current2 != null) {
                current.next = current2;
                current = current.next;
                current2 = current2.next;
            }

            while (current2 == null && current1 != null) {
                current.next = current1;
                current = current.next;
                current1 = current1.next;
            }

            if (current1 != null && current2 != null && current1.val <= current2.val) {
                current.next = current1;
                current = current.next;
                current1 = current1.next;
            }
            if (current1 != null && current2 != null && current1.val > current2.val) {
                current.next = current2;
                current = current.next;
                current2 = current2.next;
            }
        }
        return head.next;
    }
}
