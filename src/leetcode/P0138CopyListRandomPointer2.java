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
        Node dummyHead = new Node(0);
        dummyHead.next = head;

        Node dummyCopyHead = new Node(0);
        Node copyHead = dummyHead.next.next;
        dummyCopyHead.next = copyHead;
        while (head != null) {
            Node newNode = new Node(head.val);
            newNode.next = head.next;
            head.next = newNode;
            head = newNode.next;
        }
        dummyHead = copyHead.next;
        while (dummyHead != null) {
            copyHead.next = dummyHead.next;
            if (dummyHead.random == null) copyHead.random = null;
            else copyHead.random = dummyHead.random.next;
            copyHead = copyHead.next;
            dummyHead = dummyHead.next.next;
        }

        return dummyCopyHead.next;
    }
}
