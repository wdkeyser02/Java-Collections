public class HashMap_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava HashMap\n");
        System.out.println("Advantages of Java HashMap");
        System.out.println("Fast retrieval: HashMaps provide constant time access to elements, which means that retrieval and insertion of elements is very fast.");
        System.out.println("Efficient storage: HashMaps use a hashing function to map keys to indices in an array. This allows for quick lookup of values based on keys, and efficient storage of data.");
        System.out.println("Flexibility: HashMaps allow for null keys and values, and can store key-value pairs of any data type.");
        System.out.println("Easy to use: HashMaps have a simple interface and can be easily implemented in Java.");
        System.out.println("Suitable for large data sets: HashMaps can handle large data sets without slowing down.");
        System.out.println("");
        System.out.println("Disadvantages of Java HashMap");
        System.out.println("Unordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved.");
        System.out.println("Not thread-safe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, it can lead to data inconsistencies.");
        System.out.println("Performance can degrade: In some cases, if the hashing function is not properly implemented or if the load factor is too high, the performance of a HashMap can degrade.");
        System.out.println("More complex than arrays or lists: HashMaps can be more complex to understand and use than simple arrays or lists, especially for beginners.");
        System.out.println("Higher memory usage: Since HashMaps use an underlying array, they can use more memory than other data structures like arrays or lists. This can be a disadvantage if memory usage is a concern.");
        System.out.println("");
    }
}
