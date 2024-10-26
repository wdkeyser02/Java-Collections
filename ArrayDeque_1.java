import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava ArrayDeque\n");
        System.out.println("Advantages of using ArrayDeque.");
        System.out.println("Efficient: The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue, making it a good choice for scenarios where you need to perform many add and remove operations.");
        System.out.println("Resizable: The ArrayDeque class uses a resizable array to store its elements, which means that it can grow and shrink dynamically to accommodate the number of elements in the queue.");
        System.out.println("Lightweight: The ArrayDeque class is a lightweight data structure that does not require additional overhead, such as linked list nodes, making it a good choice for scenarios where memory is limited.");
        System.out.println("Thread-safe: The ArrayDeque class is not thread-safe, but you can use the Collections.synchronizedDeque method to create a thread-safe version of the ArrayDeque class.");
        System.out.println("");
        System.out.println("Disadvantages of using ArrayDeque.");
        System.out.println("Not synchronized: By default, the ArrayDeque class is not synchronized, which means that multiple threads can access it simultaneously, leading to potential data corruption.");
        System.out.println("Limited capacity: Although the ArrayDeque class uses a resizable array to store its elements, it still has a limited capacity, which means that you may need to create a new ArrayDeque when the old one reaches its maximum size.");
        System.out.println("");

        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.add(0); // Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available. When using a capacity-restricted deque, it is generally preferable to use offer.
        myDeque.addFirst(1); // Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available. When using a capacity-restricted deque, it is generally preferable to use method offerFirst.
        myDeque.addLast(2); // Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available. When using a capacity-restricted deque, it is generally preferable to use method offerLast.
        myDeque.offer(3); // Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available. When using a capacity-restricted deque, this method is generally preferable to the add method, which can fail to insert an element only by throwing an exception.
        myDeque.offerFirst(4); // Inserts the specified element at the front of this deque unless it would violate capacity restrictions. When using a capacity-restricted deque, this method is generally preferable to the addFirst method, which can fail to insert an element only by throwing an exception.
        myDeque.offerLast(5); // Inserts the specified element at the end of this deque unless it would violate capacity restrictions. When using a capacity-restricted deque, this method is generally preferable to the addLast method, which can fail to insert an element only by throwing an exception.
        myDeque.forEach(System.out::println);
        System.out.println("");
        System.out.println("size: " + myDeque.size());
        int first = myDeque.removeFirst(); // Retrieves and removes the first element of this deque. This method differs from pollFirst only in that it throws an exception if this deque is empty.
        int last = myDeque.removeLast(); // Retrieves and removes the last element of this deque. This method differs from pollLast only in that it throws an exception if this deque is empty.
        System.out.println("First: " + first + ", Last: " + last);
        System.out.println("size: " + myDeque.size()); // Returns the number of elements in this deque.
        myDeque.forEach(System.out::println);
        System.out.println("");
        System.out.println("element: " + myDeque.element()); // Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque). This method differs from peek only in that it throws an exception if this deque is empty.
        System.out.println("peek: " + myDeque.peek());
        System.out.println("peek first: " + myDeque.peekFirst());
        System.out.println("peek last: " + myDeque.peekLast());
        System.out.println("poll: " + myDeque.poll());
        System.out.println("poll first: " + myDeque.pollFirst());
        System.out.println("poll last: " + myDeque.pollLast());
        myDeque.forEach(System.out::println);
        System.out.println("");

    }
}
