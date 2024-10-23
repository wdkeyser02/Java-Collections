import java.util.*;
import java.util.concurrent.TimeUnit;

public class ArrayList_2 {
    public static void main(String[] args) {
        
        System.out.println("\nJava ArrayList & HashSet are not thread-safe\n");

        int size = 1000000;
        
        List<Integer> myMultiThreadedArrayList = new ArrayList<>();
        Set<Integer> myMultiThreadedHashSet = new HashSet<>();

        // List<Integer> myMultiThreadedArrayList = Collections.synchronizedList(new ArrayList<>());
        // Set<Integer> myMultiThreadedHashSet = Collections.synchronizedSet(new HashSet<>());

        System.out.println("\nSpeed and Thread test.");
        long startAdd = System.nanoTime();
        
        Thread thread1 = new Thread(() -> {
            for(int x = 0; x < size; x++) {
                myMultiThreadedArrayList.add(x);
                myMultiThreadedHashSet.add(x);
             }
        });

        Thread thread2 = new Thread(() -> {
            for(int x = 0; x < size ; x++) {
                //myMultiThreadedArrayList.add(x);
                //myMultiThreadedHashSet.add(size + x);
             }
        });

        Thread thread3 = new Thread(() -> {
            for(int x = 0; x < size; x++) {
                //myMultiThreadedArrayList.add(x);
                //myMultiThreadedHashSet.add(size * 2 + x);
             }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread error: " + e.getLocalizedMessage());
        }
        long stopAdd = System.nanoTime();
        long arrayListTimeAdd = TimeUnit.NANOSECONDS.toMillis(stopAdd - startAdd);
        System.out.println("Add ArrayList Time: " + arrayListTimeAdd + " ms");
        System.out.println("ArrayList Size: " + myMultiThreadedArrayList.size());
        System.out.println("HashSet Size: " + myMultiThreadedHashSet.size());
        System.out.println("\n");




        

    }
}
