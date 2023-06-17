package Day12_intersection_of_two_linked_list;

class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node first = firstHead;
        Node second = secondHead;
        while (first != second) {
            if (first == null) {
                first = secondHead;
            } else {
                first = first.next;
            }
            if (second == null) {
                second = firstHead;
            } else {
                second = second.next;
            }
        }
        return first.data;
    }
}