import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class firstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        // int ans=0;
        // int count=0;
        // for(int i=1; i<=nums.length+1; i++) {
        //     count=0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[j]!=i){
        //             count++;
        //         }
        //         if(count==nums.length){
        //             return i;
        //         }
        //     }
        // }
        // return ans;
        //inefficient solution of time complexity O(n^2)


        // Set<Integer> set = new HashSet();
        // for(int i:nums){
        //     set.add(i);
        // }
        // int i=1;
        // while(set.contains(i)){
        //     i++;
        // }return i;
        //We need extra space for this
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=0 || nums[i]>nums.length) nums[i]=nums.length+1;//removing nonzero and negative numbers
        }
        for(int i=0;i<nums.length;i++){
            int numaddress=Math.abs(nums[i]);//that number may be present in array and just marked negative
            if (numaddress>nums.length) continue;//beyond limit 
            numaddress--;//getting address of the block to mark number as negative
            if(nums[numaddress]>0) nums[numaddress]*=-1;//making the address of element present negative
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) return i+1;
        }
        return nums.length+1;//Min positive integer ranges from 0 to nums.length

    }
    public static void main(String[] args) {
        int arr[]={1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
}
