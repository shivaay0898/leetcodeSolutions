public class singleNumberXor {
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            ans=temp^ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,2,2,3,1};
        System.out.println(singleNumber(arr));
    }
}