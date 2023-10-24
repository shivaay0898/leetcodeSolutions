import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        // if(nums[i-1]==nums[i]) return true;
        // }
        // return false;
        // naive approach
        Set<Integer> numsnew = new HashSet<Integer>();
        for (int num : nums) {
            if (numsnew.contains(num)) {
                return true;
            }
            numsnew.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(arr));
    }
}
