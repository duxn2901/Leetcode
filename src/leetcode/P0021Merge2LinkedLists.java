package leetcode;

public class P0021Merge2LinkedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode now1 = list1;
        
        ListNode now2 = list2;
        
        ListNode head;
        ListNode now;
        if (list1 == null) {
            if (list2 == null) return null;
            head = new ListNode(list2.val);
            now2 = now2.next;
        }
        else if (list2 == null) {
            head = new ListNode(list1.val);
            now1 = now1.next;
        }
        else if (list1.val <= list2.val) {
            head = new ListNode(list1.val);
            
            now1 = now1.next;
        }
        else {
            head = new ListNode(list2.val);
            
            now2 = now2.next;
        }
        now = head;

        while (now1 != null || now2!= null) {
            if (now2 == null) {
                now.next = now1;
                now = now.next;
                now1 = now1.next;
            }
            else if (now1 == null) {
                now.next = now2;
                now = now.next;
                now2 = now2.next;
            }
            else if (now1.val <= now2.val) {
                now.next = now1;
                now = now.next;
                now1 = now1.next;
            }
            else {
                now.next = now2;
                now = now.next;
                now2 = now2.next;
            }
        }
        return head;
    }
}
