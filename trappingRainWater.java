public class trappingRainWater {
    public static int trap(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        int lMax = height[left];
        int rMax = height[right];
        while (left < right) {
            if (lMax < rMax) {
                ans += lMax - height[left];
                lMax = Math.max(lMax, height[++left]);
            } else {
                ans += rMax - height[right];
                rMax = Math.max(rMax, height[--right]);
            }
        }
        return ans;
        // efficient solution with time complexity o(n) and space o(1)
        // int ans=0;
        // int l[]=new int[height.length];
        // l[0]=height[0];
        // for(int i=1;i<height.length;i++){
        // l[i]=Math.max(height[i], l[i-1]);
        // }
        // int r[]=new int[height.length];
        // r[height.length-1]=height[height.length-1];
        // for(int i=height.length-2;i>=0;i--){
        // r[i]=Math.max(height[i], r[i+1]);
        // }
        // for(int i=0;i<height.length;i++){
        // ans+=Math.min(l[i],r[i])-height[i];
        // }
        // return ans;
        // time and space complexity O(n)
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(arr));
    }
}
