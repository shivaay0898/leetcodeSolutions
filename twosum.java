import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        // int ans[]=new int[2];
        // Map<Integer,Integer> numContains= new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(numContains.containsKey(target-nums[i])){
        //         ans[0]=numContains.get(target-nums[i]);
        //         ans[1]=i;
        //     }
        //     else{
        //         numContains.put(nums[i],i);
        //     }
        // }
        // return ans;
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      if (numToIndex.containsKey(target - nums[i]))
        return new int[] {numToIndex.get(target - nums[i]), i};
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException();
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
