class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        System.out.println(searchInsert(arr, 7));
    }
}