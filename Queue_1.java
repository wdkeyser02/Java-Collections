import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Queue\n");
        System.out.println("Advantages of using the Queue Interface in Java.");
        System.out.println("Order preservation: The Queue interface provides a way to store and retrieve elements in a specific order, following the first-in, first-out (FIFO) principle.");
        System.out.println("Flexibility: The Queue interface is a subtype of the Collection interface, which means that it can be used with many different data structures and algorithms, depending on the requirements of the application.");
        System.out.println("Thread–safety: Some implementations of the Queue interface, such as the java.util.concurrent.ConcurrentLinkedQueue class, are thread-safe, which means that they can be accessed by multiple threads simultaneously without causing conflicts.");
        System.out.println("Performance: The Queue interface provides efficient implementations for adding, removing, and inspecting elements, making it a useful tool for managing collections of elements in performance-critical applications.");
        System.out.println("");
        System.out.println("Disadvantages of using the Queue Interface in Java.");
        System.out.println("Limited functionality: The Queue interface is designed specifically for managing collections of elements in a specific order, which means that it may not be suitable for more complex data structures or algorithms.");
        System.out.println("Size restrictions: Some implementations of the Queue interface, such as the ArrayDeque class, have a fixed size, which means that they cannot grow beyond a certain number of elements.");
        System.out.println("Memory usage: Depending on the implementation, the Queue interface may require more memory than other data structures, especially if it needs to store additional information about the order of the elements.");
        System.out.println("Complexity: The Queue interface can be difficult to use and understand for novice programmers, especially if they are not familiar with the principles of data structures and algorithms.");
        System.out.println("");

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.

    }
}
