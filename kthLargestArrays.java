import java.util.PriorityQueue;

public class kthLargestArrays {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }
        while(pq.size()>k){
            pq.poll();
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        System.out.println(findKthLargest(arr, 2));
    }
}
