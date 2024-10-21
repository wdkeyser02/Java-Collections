import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        System.out.println("\nJava ArrayList\n");
        System.out.println("Advantages of Java ArrayList");
        System.out.println("Dynamic size: ArrayList can dynamically grow and shrink in size, making it easy to add or remove elements as needed.");
        System.out.println("Easy to use: ArrayList is simple to use, making it a popular choice for many Java developers.");
        System.out.println("Fast access: ArrayList provides fast access to elements, as it is implemented as an array under the hood.");
        System.out.println("Ordered collection: ArrayList preserves the order of elements, allowing you to access elements in the order they were added.");
        System.out.println("Supports null values: ArrayList can store null values, making it useful in cases where the absence of a value needs to be represented.");
        System.out.println("");
        System.out.println("Disadvantages of Java ArrayList");
        System.out.println("Slower than arrays: ArrayList is slower than arrays for certain operations, such as inserting elements in the middle of the list.");
        System.out.println("Increased memory usage: ArrayList requires more memory than arrays, as it needs to maintain its dynamic size and handle resizing.");
        System.out.println("Not thread-safe: ArrayList is not thread-safe, meaning that multiple threads may access and modify the list concurrently, leading to potential race conditions and data corruption.");
        System.out.println("Performance degradation: ArrayList’s performance may degrade as the number of elements in the list increases, especially for operations such as searching for elements or inserting elements in the middle of the list.");
        System.out.println("");
        
        // ArrayList<int> myintArrayList = new ArrayList<>();
        ArrayList<String> myStringArrayList = new ArrayList<String>();
        ArrayList<Person> myPersonArrayList = new ArrayList<>();
        myPersonArrayList.add(new Person(1, "Frank", "Gates", 51));
        System.out.println(myStringArrayList);
        System.out.println(myPersonArrayList);
        System.out.println("");

        int n = 5;
        ArrayList<Integer> myIntegerArrayList1 = new ArrayList<Integer>(n);
        ArrayList<Integer> myIntegerArrayList2 = new ArrayList<Integer>();
        System.out.println("Array 1:" + myIntegerArrayList1);
        System.out.println("Array 2:" + myIntegerArrayList2);
        for (int i = 1; i <= n; i++) {
            myIntegerArrayList1.add(i);
            myIntegerArrayList2.add(i);
        }
        System.out.println("Array 1:" + myIntegerArrayList1);
        System.out.println("Array 2:" + myIntegerArrayList2);
        System.out.println("");

        System.out.println("Adding Elements");
        ArrayList<String> al = new ArrayList<>();
        al.add("Willy");
        al.add("Keyser");
        al.add(1, "De");
        System.out.println(al);
        System.out.println("");

        System.out.println("Changing Elements");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("Willy");
        a2.add("Keyser");
        a2.add(1, "-");
        System.out.println("Initial ArrayList " + a2);
        a2.set(1, "De");
        System.out.println("Updated ArrayList " + a2);
        System.out.println("");

        System.out.println("Removing Elements");
        ArrayList<String> a3 = new ArrayList<>();
        a3.add("Willy");
        a3.add("De Keyser");
        a3.add(1, "-");
        System.out.println("Initial ArrayList " + a3);
        a3.remove(1);
        System.out.println("After the Index Removal " + a3);
        a3.remove("De Keyser");
        System.out.println("After the Object Removal " + a3);
        System.out.println("");

        
        System.out.println("Iterating the ArrayList");
        ArrayList<String> a4 = new ArrayList<>();
        a4.add("Willy");
        a4.add("Keyser");
        a4.add(1, "De");
        for (int i = 0; i < a4.size(); i++) {
            System.out.print(a4.get(i) + " ");
        }
        System.out.println();
        for (String str : a4) {
            System.out.print(str + " ");
        }
        System.out.println("");

        System.out.println("Get Elements");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);
        Integer number= list1.get(1);
        System.out.println("at indext 1 number is:" + number);
        System.out.println("");

        System.out.println("Add Elements Between Two Numbers");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(4);
        System.out.println(list2);
        list2.add(2, 3);
        System.out.println(list2);
        System.out.println("");

        System.out.println("ArrayList Sort");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(4);
        list3.add(3);
        list3.add(1);
        System.out.println("Before sorting list:");
        System.out.println(list3);
        Collections.sort(list3);
        System.out.println("after sorting list:");
        System.out.println(list3);
        System.out.println("");

        System.out.println("Size of Elements");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        int b = list4.size();
        System.out.println("The size is :" + b);

        System.out.println("");
    }

    private record Person (Integer id, String firstName, String lastName, Integer age) {}
}
