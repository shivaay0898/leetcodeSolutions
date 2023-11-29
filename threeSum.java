import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> tempAns=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        // Set<Integer> set=new HashSet<>();
        // for(int j=i+1;j<nums.length;j++){
        // if(set.contains(-(nums[i]+nums[j]))){
        // List<Integer> temp=new ArrayList<>();
        // temp.add(nums[i]);
        // temp.add(nums[j]);
        // temp.add(-(nums[i]+nums[j]));
        // temp.sort(null);
        // tempAns.add(temp);
        // }
        // set.add(nums[j]);
        // }
        // }
        // List<List<Integer>> ans=new ArrayList<>(tempAns);
        // return ans;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(arr));
    }
}
