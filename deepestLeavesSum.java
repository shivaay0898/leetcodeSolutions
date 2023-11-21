import java.util.ArrayDeque;
import java.util.Queue;

public class deepestLeavesSum {
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

    public int deepestLeavesSum(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> bfs = new ArrayDeque<>();
        bfs.add(root);
        while (!bfs.isEmpty()) {
            ans = 0;
            int size = bfs.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = bfs.poll();
                ans += temp.val;
                if (temp.left != null) {
                    bfs.offer(temp.left);
                }
                if (temp.right != null) {
                    bfs.offer(temp.right);
                }
            }
        }
        return ans;
    }
}
