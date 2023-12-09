import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class bfsGraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[V + 1];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            ans.add(u);
            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        return ans;
    }
}
