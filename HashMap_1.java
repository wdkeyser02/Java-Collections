import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava HashMap\n");
        System.out.println("Advantages of HashMap:");
        System.out.println("Fast retrieval: HashMaps provide constant time access to elements, which means that retrieval and insertion of elements is very fast.");
        System.out.println("Efficient storage: HashMaps use a hashing function to map keys to indices in an array. This allows for quick lookup of values based on keys, and efficient storage of data.");
        System.out.println("Flexibility: HashMaps allow for null keys and values, and can store key-value pairs of any data type.");
        System.out.println("Easy to use: HashMaps have a simple interface and can be easily implemented in Java.");
        System.out.println("Suitable for large data sets: HashMaps can handle large data sets without slowing down.");
        System.out.println("");
        System.out.println("Disadvantages of HashMap:");
        System.out.println("Unordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved.");
        System.out.println("Not thread-safe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, it can lead to data inconsistencies.");
        System.out.println("Performance can degrade: In some cases, if the hashing function is not properly implemented or if the load factor is too high, the performance of a HashMap can degrade.");
        System.out.println("More complex than arrays or lists: HashMaps can be more complex to understand and use than simple arrays or lists, especially for beginners.");
        System.out.println("Higher memory usage: Since HashMaps use an underlying array, they can use more memory than other data structures like arrays or lists. This can be a disadvantage if memory usage is a concern.");
        System.out.println("");

        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        System.out.println("HashMap Elements: " + myHashMap);
        myHashMap.put(1, 10);
        myHashMap.put(2, 11);
        myHashMap.put(3, 12);
        myHashMap.put(4, 13);
        myHashMap.put(5, 14);
        System.out.println("HashMap Elements: " + myHashMap);
        System.out.println("containsKey: " + myHashMap.containsKey(3));
        System.out.println("containsValue: " + myHashMap.containsValue(12));
        System.out.println("Get value: " + myHashMap.get(1));
        System.out.println("");

        System.out.println("Remove key:");
        myHashMap.remove(2);
        System.out.println("Size: " + myHashMap.size());
        System.out.println("KeySet: " + myHashMap.keySet());
        System.out.println("");

        HashMap<Integer, Integer> myHashMapCopy = new HashMap<>(myHashMap);
        System.out.println("HashMap Copy:");
        myHashMapCopy.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("");
        System.out.println("Put & Change Elements: ");
        myHashMapCopy.put(1, 100);
        myHashMapCopy.put(2, 11);
        myHashMapCopy.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("");
        System.out.println("Remove key:");
        myHashMapCopy.remove(1, 100);
        myHashMapCopy.remove(2, 100);
        myHashMapCopy.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("");



        System.out.println("HashMap with objects: ");
        HashMap<Integer, Person> myHashMapPerson = new HashMap<>();
        System.out.println("HashMap Elements: " + myHashMapPerson);
        myHashMapPerson.put(1, new Person(1, "Bill", "Gates", 50));
        myHashMapPerson.put(2, new Person(2, "David", "Last", 18));
        myHashMapPerson.put(3, new Person(3, "Bill", "Gates", 32));
        myHashMapPerson.put(4, new Person(4, "Frank", "Gates", 40));
        myHashMapPerson.put(5, new Person(5, "David", "Gates", 25));
        System.out.println("HashMap Elements: " + myHashMapPerson);
        myHashMapPerson.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("");

        System.out.println("HashMap with List: ");
        HashMap<Integer, ArrayList<String>> myHashMapArrayList = new HashMap<>();
        System.out.println(myHashMapArrayList);
        System.out.println("");
        myHashMapArrayList.put(1, new ArrayList<String>(Arrays.asList("A", "B", "C")));
        myHashMapArrayList.put(2, new ArrayList<String>(Arrays.asList("X", "Y", "Z")));
        myHashMapArrayList.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("");

        HashMap<ArrayList<String>, Integer> myHashMapArrayListA = new HashMap<>();
        myHashMapArrayListA.put(new ArrayList<String>(Arrays.asList("A", "B", "C")), 1);
        myHashMapArrayListA.put(new ArrayList<String>(Arrays.asList("X", "Y", "Z")), 2);
        myHashMapArrayListA.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("");
    
    }

    private record Person (Integer id, String firstName, String lastName, Integer age) {}
}
