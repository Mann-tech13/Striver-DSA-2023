package Day19_pair_sum_in_bst;

import java.util.*;

class BinaryTreeNode {

    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {
    public static boolean pairSumBst(BinaryTreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode curr = root;

        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            arr.add(curr.data);
            curr = curr.right;
        }

        int low = 0, high = arr.size() - 1;
        while (low < high) {
            int sum = arr.get(low) + arr.get(high);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                low++;
            } else {
                high--;
            }
        }

        return false;
    }
}
