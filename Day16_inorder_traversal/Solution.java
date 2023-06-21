package Day16_inorder_traversal;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.data = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public static List<Integer> getInOrderTraversal(TreeNode root) {
        return treeTraversal(root, new ArrayList<Integer>());
    }

    public static List<Integer> treeTraversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return res;
        }
        res = treeTraversal(root.left, res);
        res.add(root.data);
        return treeTraversal(root.right, res);
    }
}