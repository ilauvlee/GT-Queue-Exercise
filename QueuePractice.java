import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {
        
        // Create a Queue of Strings using a LinkedList
        Queue<String> nameQueue = new LinkedList<>();

        // Enqueue: Add names
        nameQueue.add("Alice");
        nameQueue.add("Bob");
        nameQueue.add("Charlie");
        nameQueue.add("David");

        // Print the queue
        System.out.println("The queue is: " + nameQueue);

        // Peek: See who is at the front
        String front = nameQueue.peek();
        System.out.println("The person at the front is: " + front);

        // Dequeue: Remove the person at the front
        nameQueue.remove();
        System.out.println("After removing one person, the queue is: " + nameQueue);

        // Dequeue Again
        nameQueue.remove();
        System.out.println("After removing another person, the queue is: " + nameQueue);

        // Check Size
        int size = nameQueue.size();
        System.out.println("The current size of the queue is: " + size);

        // Check if Empty
        boolean isEmpty = nameQueue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}