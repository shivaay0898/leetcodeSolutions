import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import javax.swing.tree.TreeNode;

public class verticalOrderTraversalOfBinaryTree {
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

    public class Pair {
        int hd;
        TreeNode node;

        Pair(TreeNode n, int h) {
            node = n;
            hd = h;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
            List<List<Integer>> ans=new ArrayList<>();
            Queue<Pair> q=new ArrayDeque<>();
            TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
            q.offer(new Pair(root,0));
            while(!q.isEmpty()){
                Pair p=q.poll();
                int hd=p.hd;
                TreeNode curr=p.node;
                if(map.containsKey(hd)){
                    map.get(hd).add(curr.val);
                }
                else{
                    ArrayList<Integer> al=new ArrayList<>();
                    al.add(curr.val);
                    map.put(hd, al);
                }
                if(curr.left!=null){
                    q.offer(new Pair(curr.left,hd-1));
                }
                else if(curr.right!=null){
                    q.offer(new Pair(curr.right, hd+1));
                }
            }
        for(Map.Entry<Integer,ArrayList<Integer>> p:map.entrySet()){
            ArrayList<Integer> al=p.getValue();
            ans.add(al);
        }
        return ans;
    }
}
