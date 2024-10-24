import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava HashSet\n");
        System.out.println("Duplicates : ArrayList allows duplicate values while HashSet doesn't allow duplicates values.");
        System.out.println("Ordering : ArrayList maintains the order of the object in which they are inserted while HashSet is an unordered collection and doesn't maintain any order.");

        HashSet<String> myStringSet = new HashSet<>();
        // myStringSet.get() (Don't exist!)
        // myStringSet.sort() (Don't exist!)
        myStringSet.add("Bill");
        myStringSet.add("Frank");
        myStringSet.add("Bill");
        System.out.println(myStringSet);
        System.out.println("Size: " + myStringSet.size());
        myStringSet.forEach(System.out::println);

        HashSet<Person> myPersonSet = new HashSet<>();
        myPersonSet.add(new Person(1, "Bill", "Gates", 50));
        myPersonSet.add(new Person(2, "David", "Last", 50));
        myPersonSet.add(new Person(3, "Bill", "Gates", 50));
        System.out.println(myPersonSet);
        myPersonSet.forEach(System.out::println);
        System.out.println("");

        HashSet<Integer> myIntegerHashSet = new HashSet<>();
        myIntegerHashSet.add(100);
        myIntegerHashSet.add(95);
        myIntegerHashSet.add(2);
        myIntegerHashSet.add(65);
        myIntegerHashSet.add(14);
        myIntegerHashSet.add(1568);
        System.out.println(myIntegerHashSet);
        System.out.println("");

        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("A");
        myHashSet.add("B");
        myHashSet.add("C");
        myHashSet.add("D");
        myHashSet.add("E");
        myHashSet.add("F");

        System.out.println(myHashSet);
        System.out.print("Using iterator: ");
        Iterator<String> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println(); 
        System.out.print("Using enhanced for loop: ");
        for (String element : myHashSet) {
            System.out.print(element + ", ");
        }
        System.out.println("\n");

        HashSet<String> myHashSet1 = new HashSet<String>();
        myHashSet1.add("Z");
        myHashSet1.add("D");
        myHashSet1.add("C");
        myHashSet1.add("A");
        myHashSet1.add("B");
        myHashSet1.add("F");
        System.out.println("Initial HashSet " + myHashSet1);
        myHashSet1.remove("B");
        System.out.println("After removing element " + myHashSet1);
        System.out.println("Element Z exists in the Set : " + myHashSet1.contains("Z"));
        System.out.println("Element AC exists in the Set : " + myHashSet1.remove("AC"));
        System.out.println("Is myHashSet1 Empty? " + myHashSet1.isEmpty());
        System.out.println("");
    }

    private record Person (Integer id, String firstName, String lastName, Integer age) {}
}
