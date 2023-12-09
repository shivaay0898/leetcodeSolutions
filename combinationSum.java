import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> anstemp = new ArrayList<>();
        Arrays.sort(candidates);
        traverse(anstemp, new ArrayList<>(), candidates, target, 0, 0);
        return anstemp;
    }

    private static void traverse(List<List<Integer>> ans, List<Integer> temp, int[] arr, int target, int sum,
            int start) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            sum += arr[i];
            temp.add(arr[i]);
            traverse(ans, temp, arr, target, sum, i);
            sum-=arr[i];
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };
        System.out.println(combinationSum(arr, 7));
    }

}
