public class binarySearch {
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={-3,-2,-1,1,2,3,4,5,6};
        System.out.println(search(arr, 5));
    }
}
