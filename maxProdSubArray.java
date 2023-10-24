import java.util.Arrays;

public class maxProdSubArray {
    public static int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        // int prod = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i; j < nums.length; j++) {
        //         for (int k = i; k <= j; k++) {
        //             prod *= nums[k];
        //         }
        //         ans = Math.max(ans, prod);
        //         prod=1;
        //     }
        // }
        //naive approach of o(n^3)
        //  for (int i = 0; i < nums.length; i++) {
        //     for (int j = i; j < nums.length; j++) {
        //         prod *= nums[j];
        //         ans = Math.max(ans, prod);
        //     }
        //     prod=1;
        // }
        //naive approach of o(n^2)
        int suffix=1;
        int prefix=1;
        for(int i=0;i<nums.length;i++){
            if(suffix==0)   suffix=1;
            if(prefix==0)   prefix=1;
            suffix*=nums[i];
            prefix*=nums[nums.length-1-i];
            ans = Math.max(ans, Math.max(suffix, prefix));
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -2, 4 };
        System.out.println(maxProduct(arr));
    }
}
