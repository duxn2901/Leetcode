package leetcode;

public class P0138CopyListRandomPointer2 {
    class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node dummyHead = new Node(0);
        dummyHead.next = head;
        
        while (head != null) {
            Node newNode = new Node(head.val);
            newNode.next = head.next;
            head.next = newNode;
            head = newNode.next;
        }
        
        head = dummyHead.next;
        Node copyHead = head.next;
        Node dummyCopyHead = new Node(0);
        dummyCopyHead.next = copyHead;
        while (head != null) {
            if (head.random != null) copyHead.random = head.random.next;
            else copyHead.random = null;

            head = copyHead.next;
            if (head != null) copyHead = head.next;
        }

        head = dummyHead.next;
        copyHead = head.next;
        while (head != null) {
            head.next = copyHead.next;
            if (copyHead.next != null) copyHead.next = copyHead.next.next;
            else copyHead.next = null;
            head = head.next;
            copyHead = copyHead.next;
        }

        return dummyCopyHead.next;
    }
}
