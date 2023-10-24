import java.util.Arrays;

public class missingNum {
    public static int missingNumber(int[] nums) {
        // int ans=0;
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i]-nums[i-1]!=1){
        //         ans=nums[i-1]+1;
        //     }
        // }
        //  if(nums.length>nums[nums.length-1]) ans=nums.length;
        // return ans;
        // int ans = nums.length;
        // for(int i=0; i<nums.length; i++)    ans^=i^nums[i];
        // return ans;
        int n=nums.length;
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0; i<nums.length; i++){
            sum2+=nums[i];
        }
        return sum-sum2;
    }
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
