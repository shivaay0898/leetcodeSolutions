import javax.swing.tree.TreeNode;

public class deleteLeavesWithAGivenValue {
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

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        return isLeaf(root) && (root.val == target) ? null : root;
    }

    private boolean isLeaf(TreeNode root) {
        return (root.left == null) && (root.right == null);
    }
}
