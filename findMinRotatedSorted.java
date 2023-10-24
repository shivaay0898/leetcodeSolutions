public class findMinRotatedSorted {
    public static int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) {
                ans = Math.min(nums[left], ans);
                left = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);// as right will be greater than mid if right half is sorted
                right = mid - 1;
            }

        }
        return ans;

        // int left = 0;
        // int right = nums.length - 1;
        // while (left < right) {
        //     int mid = left + (right - left) / 2;
        //     if (nums[mid] < nums[right]) {
        //         right = mid ;
        //     } else
        //         left = mid + 1;

        // }
        // return nums[left];
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(findMin(arr));
    }
}
