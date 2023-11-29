import java.util.ArrayDeque;
import java.util.Queue;

class countNodesEqualToAverageofSubTree {
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

    private int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        averageOfSubtreeTemp(root);
        // dfs(root);
        return ans;
    }
    // public Pair<Integer,Integer> dfs(TreeNode root){
    //     if(root==null){
    //         return new Pair<>(0,0);
    //     }
    //     Pair<Integer,Integer> left=dfs(root.left);
    //     Pair<Integer,Integer> right=dfs(root.right);
    //     int count= 1+left.getKey()+right.getKey();
    //     int sum=root.val+left.getValue()+right.getValue();
    //     if(sum/count==root.val){
    //         ans++;
    //     }
    //     return new Pair<>(count,sum);
    // }

    private void averageOfSubtreeTemp(TreeNode root) {
        if (root == null)
            return;
        if (tempAverage(root)) {
            ans++;
        }
        averageOfSubtreeTemp(root.left);
        averageOfSubtreeTemp(root.right);
    }

    private boolean tempAverage(TreeNode root) {
        int sum = 0;
        int count = 0;
        Queue<TreeNode> bfs = new ArrayDeque<>();
        bfs.offer(root);
        while (!bfs.isEmpty()) {
            TreeNode curr = bfs.poll();
            sum += curr.val;
            count++;
            if (curr.left != null) {
                bfs.offer(curr.left);
            }
            if (curr.right != null) {
                bfs.offer(curr.right);
            }
        }
        int avg = sum / count;
        return avg == root.val;
    }
}