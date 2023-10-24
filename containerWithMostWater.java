public class containerWithMostWater {
    public static int maxArea(int[] height) {
        int ans=0;
        int left=0;
        int right=height.length-1;
        while (left<right) {
          int minHeight=Math.min(height[left], height[right]);
          ans=Math.max(ans,minHeight*(right-left));
          if(height[left]<height[right]) left++;
          else right--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(maxArea(arr));
    }
}
