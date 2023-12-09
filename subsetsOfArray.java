import java.util.ArrayList;
import java.util.List;

public class subsetsOfArray {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    public static void dfs(int[] arr, List<List<Integer>> ans, int temp, List<Integer> tempAns) {
        ans.add(new ArrayList<>(tempAns));
        for (int i = temp; i < arr.length; i++) {
            tempAns.add(arr[i]);
            dfs(arr, ans, i + 1, tempAns);
            tempAns.remove(tempAns.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(subsets(arr));
    }
}
