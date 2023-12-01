import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class validateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // public boolean isValidBST(TreeNode root) {
    // return isValidBSTTemp(root, null, null);
    // }

    // public boolean isValidBSTTemp(TreeNode root, TreeNode min, TreeNode max) {
    // if (root == null)
    // return true;
    // if (min != null && root.val <= min.val)
    // return false;
    // if (max != null && root.val >= max.val)
    // return false;
    // return isValidBSTTemp(root.left, min, root) && isValidBSTTemp(root.right,
    // root, max);
    // }
    // public boolean isValidBST(TreeNode root) {
    //     return isValidBSTTemp(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    // }

    // private boolean isValidBSTTemp(TreeNode root, int min, int max) {
    //     if (root == null)
    //         return true;

    //     return (root.val < max) && (root.val > min) && isValidBSTTemp(root.left, min, root.val)
    //             && isValidBSTTemp(root.right, root.val, max);
    // }
    private int prev=Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(isValidBST(root.left)==false){
            return false;
        }
        prev=root.val;
        return isValidBST(root.right);
    }
}
