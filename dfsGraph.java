import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

public class dfsGraph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[V + 1];
        visited[0] = true;
        dfsTraverse(0, visited, ans, adj);
        return ans;
    }

    public void dfsTraverse(int source, boolean[] visited, ArrayList<Integer> ans,
            ArrayList<ArrayList<Integer>> adj) {
        visited[source] = true;
        ans.add(source);
        for (int v : adj.get(source)) {
            if (visited[v] == false) {
                dfsTraverse(v, visited, ans, adj);
            }
        }
    }
    public static void main(String args[]) {

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        
        dfsGraph df = new dfsGraph(); 
        ArrayList < Integer > ans = df.dfsOfGraph(5, adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }
}
