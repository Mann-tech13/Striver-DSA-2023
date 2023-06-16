package Day11_merge_two_sorted_list;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Solution {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode res = head;

        while (first != null && second != null) {
            if (first.data < second.data) {
                res.next = first;
                first = first.next;
            } else {
                res.next = second;
                second = second.next;
            }
            res = res.next;
        }
        if (first != null) {
            res.next = first;
            first = first.next;
            res = res.next;
        }
        if (second != null) {
            res.next = second;
            second = second.next;
            res = res.next;
        }
        return head.next;
    }
}
