public class twoSumSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<=right){
            if(numbers[left]+numbers[right]==target){
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }else if(numbers[left]+numbers[right]<target&&numbers[left]<numbers[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int nums[] = twoSum(arr, 9);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
    }
}
