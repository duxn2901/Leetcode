package leetcode;

public class P0023MergeKSortedLists2 {
    public static void main(String[] args) {
        
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        
    }

    public ListNode merge2Lists(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;

        ListNode dummy = new ListNode(-1);
        ListNode head;
        if (node1.val > node2.val) {
            head = node2;
            node2 = node2.next;
        }
        else {
            head = node1;
            node1 = node1.next;
        }
        dummy.next = head;

        while (!(node1 == null && node2 == null)) {
            if (node1 == null) {
                head.next = node2;
                head = head.next;
                node2 = node2.next;
            }

            else if (node2 == null) {
                head.next = node1;
                head = head.next;
                node1 = node1.next;
            }

            else if (node1.val > node2.val) {
                head.next = node2;
                head = head.next;
                node2 = node2.next;
            }
            
            else {
                head.next = node1;
                head = head.next;
                node1 = node1.next;
            }
        }
        return dummy.next;
    }

}
