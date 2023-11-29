class insertIntoABinarySearchTree {
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp=new TreeNode(val);
        TreeNode curr=root;
        TreeNode parent=root;
        while(curr!=null){
            parent=curr;
            if(curr.val>val){
                curr=curr.left;
            }
            else if(curr.val<val){
                curr=curr.right;
            }
        }
        if(parent==null){
            return temp;
        }
        else if(parent.val>val){
            parent.left=temp;
        }
        else if(parent.val<val){
            parent.right=temp;
        }
        return root;
    }
}