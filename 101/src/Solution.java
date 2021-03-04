import sun.reflect.generics.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<Integer>();

    }
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList();
        StringBuilder sb = new StringBuilder();
        deque.add(root);
        while (deque != null) {
            deque.poll();
            deque.add(root.left);
            deque.add(root.right);
            
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}