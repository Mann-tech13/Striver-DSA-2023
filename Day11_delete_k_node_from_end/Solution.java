package Day11_delete_k_node_from_end;

class Node {
    public int data;
    public Node next;
    public Node prev;

    Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
};

public class Solution {
    public static Node removeKthNode(Node head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        Node res = head;
        int len = 0;
        while (res != null) {
            len++;
            res = res.next;
        }
        if (k == len) {
            return head.next;
        }
        res = head;
        int target = len - k;
        int index = 1;
        while (index < target) {
            res = res.next;
            index++;
        }
        res.next = res.next.next;
        return head;
    }
}