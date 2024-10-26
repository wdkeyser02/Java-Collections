import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Queue - FIFO (first-in, first-out)\n");
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
        System.out.println("add: " + myQueue.add(1)); // Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
        System.out.println("offer: " + myQueue.offer(2)); // Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
        System.out.println("offer: " + myQueue.offer(3));
        System.out.println("offer: " + myQueue.offer(4));
        System.out.println("offer: " + myQueue.offer(5));
        System.out.println("offer: " + myQueue.offer(6));
        System.out.println("");
        myQueue.forEach(System.out::println);
        System.out.println("peek: " + myQueue.peek()); // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("element: " + myQueue.element()); // Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        System.out.println("poll: " + myQueue.poll()); // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("remove: " + myQueue.remove()); // Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.

        myQueue.forEach(System.out::println);
        System.out.println("size: " + myQueue.size());
        System.out.println("");
        myQueue.clear();
        System.out.println("myQueue: " + myQueue);
        System.out.println("");

        Queue<Person> myPersonQueue = new LinkedList<>();
        myPersonQueue.offer(new Person(1, "Bill", "Gates", 50));
        myPersonQueue.offer(new Person(2, "David", "Last", 50));
        myPersonQueue.offer(new Person(3, "Bill", "Gates", 50));
        myPersonQueue.forEach(System.out::println);
        System.out.println("");
        System.out.println("poll:" + myPersonQueue.poll());
        System.out.println("poll:" + myPersonQueue.poll());
        System.out.println("poll:" + myPersonQueue.poll());
        System.out.println("isEmpty:" + myPersonQueue.isEmpty());
        System.out.println("poll:" + myPersonQueue.poll()); // return null when empty
        System.out.println("element:" + myPersonQueue.element()); // return ERROR - NoSuchElementException
        System.out.println("");

    }

    private record Person (Integer id, String firstName, String lastName, Integer age) {}
}
