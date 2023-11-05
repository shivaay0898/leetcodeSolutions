import java.util.ArrayDeque;
import java.util.Deque;

public class largestRectangleHistogram {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer> stack= new ArrayDeque<>();
        // int area = 0;
        // for (int i = 0; i < heights.length; i++) {
        //     area = heights[i];
        //     for (int j = i - 1; j >= 0; j--) {
        //         if (heights[i] <= heights[j]) {
        //             area += heights[i];
        //         }
        //         else break;
        //     }
        //     for (int j = i + 1; j < heights.length; j++) {
        //         if (heights[j] >= heights[i]) {
        //             area += heights[i];
        //         }
        //          else break;
        //     }
        //     maxArea = Math.max(maxArea, area);
        // }
        for(int i=0;i<=heights.length;i++){
            while(!stack.isEmpty()&&((i==heights.length)||(heights[stack.peek()]>heights[i]))){
                int h=heights[stack.pop()];
                int w=stack.isEmpty()?i:i-stack.peek()-1;
                maxArea=Math.max(maxArea, h*w);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(arr));
    }
}
