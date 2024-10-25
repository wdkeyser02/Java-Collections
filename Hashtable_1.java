import java.util.Hashtable;

public class Hashtable_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Hashtable\n");
        System.out.println("Advantages of Hashtable:");
        System.out.println("Thread-safe: The Hashtable class is thread-safe, meaning that multiple threads can access it simultaneously without causing data corruption or other synchronization issues.");
        System.out.println("Simple to use: The Hashtable class is simple to use and provides basic key-value data structure functionality, which can be useful for simple cases.");
        System.out.println("");
        System.out.println("Disadvantages of Hashtable:");
        System.out.println("Obsolete: The Hashtable class is considered obsolete and its use is generally discouraged. This is because it was designed prior to the introduction of the Collections framework and does not implement the Map interface, which makes it difficult to use in conjunction with other parts of the framework.");
        System.out.println("Limited functionality: The Hashtable class provides basic key-value data structure functionality, but does not provide the full range of functionality that is available in the Map interface and its implementations.");
        System.out.println("Poor performance: The Hashtable class is synchronized, which can result in slower performance compared to other implementations of the Map interface, such as HashMap or ConcurrentHashMap.");
        System.out.println("");

        Hashtable<Integer, String> myHashtable = new Hashtable<>();
        myHashtable.put(1, "Bill");
        myHashtable.put(2, "Frank");
        myHashtable.put(3, "David");
        myHashtable.put(1, "Bill");
        System.out.println(myHashtable);
        myHashtable.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println(myHashtable.get(1));
        System.out.println(myHashtable.containsKey(2));
        System.out.println(myHashtable.containsValue("Bill"));
        myHashtable.remove(1);
        System.out.println(myHashtable);
        myHashtable.remove(2, "Peter");
        System.out.println(myHashtable);
        myHashtable.remove(2, "Frank");
        System.out.println(myHashtable);
        System.out.println(myHashtable.size());
        myHashtable.put(1, "Bill");
        myHashtable.put(2, "Frank");
        System.out.println(myHashtable.keySet());
        System.out.println(myHashtable.isEmpty());
        myHashtable.clear();
        System.out.println(myHashtable);


    }
}
