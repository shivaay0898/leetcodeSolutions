import java.util.Arrays;

public class searchInRotatedArray {
    public static int search(int[] nums, int target) {
      int ans=-1;
      int left=0,right=nums.length-1;//initialising left and right pointers
      while (left <= right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid]>=nums[left]){//left half is sorted
            if(target>=nums[left]&&target<=nums[mid]){//number in left half
                right=mid-1;
            }
            else{//number in right half
                left=mid+1;
            }
        }
        if(nums[mid]<=nums[right]){//right half is sorted
            if(target<=nums[right]&&target>=nums[mid]){//number in right half
                left=mid+1;
            }
            else{//number in left half
                right=mid-1;
            }
        }
      }
      return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 0));
    }
}
