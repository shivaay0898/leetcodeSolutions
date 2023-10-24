import java.util.Arrays;

class medianTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);//always referencing smaller array for binary search
        }
        int l = 0;//left pointer
        int r = n1;//right pointer
        while (l <= r) {
            int partition1 = (l + r) / 2;//dividing part 1 of smaller array from mid
            int partition2 = (n1 + n2 + 1) / 2 - partition1;//taking rest part from array 2
            int leftMax1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int leftMax2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int rightMax1 = (partition1 == n1) ? Integer.MAX_VALUE : nums1[partition1];
            int rightMax2 = (partition2 == n2) ? Integer.MAX_VALUE : nums2[partition2];
            //getting the four mid elements from partition
            if (leftMax1 <= rightMax2 && leftMax2 <= rightMax1) {
                return (n1 + n2) % 2 == 0 ? (Math.max(leftMax1, leftMax2) + Math.min(rightMax1, rightMax2)) * 0.5
                        : Math.max(leftMax1, leftMax2);
                //returning ans if condition satisfies
            } else if (leftMax1 > rightMax2)
                r = partition1 - 1;
                //updating right when leftMax1 exceeds rightMax2 to exclude leftMax1
            else
                l = partition1 + 1;
                //updating left when other case proceeds
        }
        throw new IllegalArgumentException();
        // double ans = 0;
        // int[] res = new int[nums1.length + nums2.length];
        // System.arraycopy(nums1, 0, res, 0, nums1.length);
        // System.arraycopy(nums2, 0, res, nums1.length, nums2.length);
        // Arrays.sort(res);
        // int mid = res.length / 2;
        // if (res.length % 2 == 0) {
        // ans = (double) (res[mid - 1] + res[mid]) / 2;
        // } else {
        // ans = (double) res[mid];
        // }
        // return ans;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 6, 7, 8 };
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}