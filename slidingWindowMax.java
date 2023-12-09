import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class slidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            ans.add(pq.peek());
            pq.remove();
            pq.add(nums[i]);
        }
        ans.add(pq.poll());
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int arr[]={7,2,4};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 2)));
    }
}
