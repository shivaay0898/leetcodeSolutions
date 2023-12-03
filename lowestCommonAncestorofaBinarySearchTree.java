import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class lowestCommonAncestorofaBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // if (root == null || root == p || root == q) {
    // return root;
    // }
    // TreeNode lca1 = lowestCommonAncestor(root.left, p, q);
    // TreeNode lca2 = lowestCommonAncestor(root.right, p, q);
    // if (lca1 != null && lca2 != null) {
    // return root;
    // }
    // return lca1 == null ? lca2 : lca1;
    // }
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // while(root!=null){
    // if(root.val>Math.max(p.val,q.val)){
    // root=root.left;
    // }
    // else if(root.val<Math.min(p.val,q.val)){
    // root=root.right;
    // }
    // else{
    // return root;
    // }
    // }
    // return null;
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > Math.max(p.val, q.val)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < Math.min(p.val, q.val)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
