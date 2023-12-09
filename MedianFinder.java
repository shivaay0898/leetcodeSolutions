import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> smaller;
    private PriorityQueue<Integer> greater;

    public MedianFinder() {
        smaller = new PriorityQueue<>(Collections.reverseOrder());
        greater = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (smaller.isEmpty() || smaller.peek() >= num) {
            smaller.add(num);
        } else {
            greater.add(num);
        }
        if (smaller.size() < greater.size()) {
            smaller.add(greater.poll());
        } else if (smaller.size() - greater.size() > 1) {
            greater.add(smaller.poll());
        }
    }

    public double findMedian() {
        if (smaller.size() == greater.size()) {
            return (double)(smaller.peek() + greater.peek()) / 2.0;
        }
        return (double)smaller.peek();
    }
}
