import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(4);
        pq.add(2);
        pq.add(5);
        pq.add(1);
        pq.add(3);
        System.out.println("PriorityQueue after additions: " + pq);

        // Peek at the head element without removing it
        Integer headElement = pq.peek();
        System.out.println("Head element (peek): " + headElement);

        // Poll the head element (removes it)
        Integer polledElement = pq.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("PriorityQueue after polling: " + pq);

        // Check the size of the PriorityQueue
        System.out.println("Size of PriorityQueue: " + pq.size());

        // Remove a specific element
        pq.remove(3);
        System.out.println("PriorityQueue after removing 3: " + pq);

        // Clear the PriorityQueue
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq);
    }
}