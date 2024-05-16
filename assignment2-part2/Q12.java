
import java.util.PriorityQueue;

public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};

        // Create a min heap (PriorityQueue) from the array
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }

        // Dequeue elements from the min heap
        System.out.println("Dequeued elements (in ascending order):");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}