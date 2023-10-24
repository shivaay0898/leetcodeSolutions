import java.util.Arrays;

public class squaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        // nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int ans[] = new int[nums.length];
        int i = nums.length-1, left = 0, right = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[i] = nums[left] * nums[left];
                 left++;
                 i--;
            }
            else{
                ans[i]=nums[right]*nums[right];
                 right--;
                 i--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
