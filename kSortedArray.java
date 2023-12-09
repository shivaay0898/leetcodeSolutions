import java.util.PriorityQueue;

public class kSortedArray {
    public static int[] nearlySorted(int[] array, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i <= k; i++) {
            pq.add(array[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            array[index++] = pq.poll();
            pq.add(array[i]);
        }
        while (pq.isEmpty() == false) {
            array[index++] = pq.poll();
        }
        return array;
    }
}