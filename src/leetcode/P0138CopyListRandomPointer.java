package leetcode;

import java.util.HashMap;

public class P0138CopyListRandomPointer {
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
        HashMap<Node, Node> map = new HashMap<>();
        if (head == null) return null;
        Node headCopy = new Node(head.val);
        Node dummy = new Node(0);
        dummy.next = headCopy;
        map.put(head, headCopy);
        while (head != null) {
            if (map.containsKey(head.next)) {
                headCopy.next = map.get(head.next);
            }
            else {
                Node newNode = null;
                if (head.next != null) newNode = new Node(head.next.val);
                headCopy.next = newNode;
                map.put(head.next, newNode);
            }
            if (map.containsKey(head.random)) {
                headCopy.random = map.get(head.random);
            }
            else {
                Node newNode = null;
                if (head.random != null) newNode = new Node(head.random.val);
                headCopy.random = newNode;
                map.put(head.random, newNode);
            }
            
            head = head.next;
            headCopy = headCopy.next;
        }

        return dummy.next;
    }

}
