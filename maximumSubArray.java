public class maximumSubArray {
    public static int maxSubArray(int[] nums) {
        // int ans = 0, maxAns = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     ans += nums[i];
        //     maxAns=Math.max(ans,maxAns);
        //     if (ans < 0)
        //         ans = 0;

        // }
        // return maxAns;
    int ans = Integer.MIN_VALUE;
    int sum = 0;

    for (final int num : nums) {
      sum = Math.max(num, sum + num);
      ans = Math.max(ans, sum);
    }

    return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -1};
        System.out.println(maxSubArray(arr));
    }
}
