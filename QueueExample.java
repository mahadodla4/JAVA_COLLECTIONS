import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        System.out.println("Queue after additions: " + queue);

        // Remove an element from the Queue
        queue.remove("three");
        System.out.println("Queue after removing 'three': " + queue);

        // Get the size of the Queue
        System.out.println("Queue Size: " + queue.size());

        // Check if the Queue contains a specific element
        System.out.println("Queue contains 'two'? " + queue.contains("two"));

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);

        // Poll the front element (removes it)
        String polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after polling: " + queue);

        // Clear the Queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}