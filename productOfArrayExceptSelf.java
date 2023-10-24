public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        // int ans[] = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        // ans[i] = 1;
        // for (int j = 0; j < nums.length; j++) {
        // if (i != j) {
        // ans[i] *= nums[j];
        // }
        // }
        // }
        // return ans;
        //soln with complexity O(n^2)
        int postProd[] = new int[nums.length];
        int preProd[] = new int[nums.length];
        preProd[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            preProd[i] = preProd[i - 1] * nums[i - 1];
        } // array with previous numbers multiplied
        
        postProd[nums.length-1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            postProd[i] = postProd[i + 1] * nums[i + 1];
        } // array with proceding numbers multiplied
        for(int i=0;i<nums.length;i++){
            nums[i]=postProd[i]*preProd[i];
        }
        return nums;//returning manipulate nums array

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int sol[] = productExceptSelf(arr);
        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i] + " ");
        }
    }
}
