import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        makePermutations(nums, 0, ans);
        return ans;
    }

    public static void makePermutations(int[] arr, int i, List<List<Integer>> ans) {
        if (i == arr.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            ans.add(permutation);
        }
        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            makePermutations(arr, i + 1, ans);
            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int test[] = { 1, 2, 3 };
        System.out.println(permute(test));
    }
}
