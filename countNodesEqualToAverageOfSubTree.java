import java.util.ArrayDeque;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import apple.laf.JRSUIUtils.Tree;

public class countNodesEqualToAverageOfSubTree {
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
        public int ans=0;
        public int averageOfSubtree(TreeNode root) {
           
        }
        public boolean tempAverage(TreeNode root){
            int sum = 0;
            int count = 0;
            Queue<TreeNode> bfs = new ArrayDeque<>();
            bfs.offer(root);
            while (!bfs.isEmpty()) {
                TreeNode curr = bfs.poll();
                sum+=curr.val;
                count++;
                if (curr.left != null) {
                    bfs.offer(curr.left);
                }
                if (curr.right != null) {
                    bfs.offer(curr.right);
                }
            }
            int avg=sum/count;
            return avg==root.val;
        }
    }
}