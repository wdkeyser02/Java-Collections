import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Collections_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Collections\n");

        String[] myStringArray = new String[25];
        myStringArray[1] = "Test";
        System.out.println(myStringArray.length);
        
        List<String> myList = new ArrayList<String>();
        

        Collection<String> myStringTreeSet = new TreeSet<>();
        Collection<String> stringArrayList = new ArrayList<>();
        Collection<String> temp2 = new LinkedList<>();
        Collection<String> temp3 = new Vector<>();
        Collection<String> temp4 = new Stack<>();
        Collection<String> temp5 = new PriorityQueue<>();
        Collection<String> temp6 = new ArrayDeque<>();
        Collection<String> test = new LinkedHashSet<>();
        Collection<String> test1 = new ArrayDeque<>();
        
        Map<String, String> myHashMap = new HashMap<>();
        Map<String, String> myTreeMap = new TreeMap<>();
        Map<String, String> myLinkedHashMap = new LinkedHashMap<>();
        Map<String, String> myConcurrentHashMap = new ConcurrentHashMap<>();

        Queue<Person> myLinkedListQueue = new LinkedList<>();
        Queue<Person> myPriorityQueue = new PriorityQueue<>();
        myPriorityQueue.add(new Person(1, "Jan", "Peetsers", 25));
        myPriorityQueue.add(new Person(2, "Jan", "Peetsers", 20));
        myPriorityQueue.add(new Person(3, "Jan", "Peetsers", 50));
        myPriorityQueue.add(new Person(4, "Jan", "Peetsers", 5));
        myPriorityQueue.add(new Person(5, "Jan", "Peetsers", 80));
        while (!myPriorityQueue.isEmpty()) {
            System.out.println(myPriorityQueue.poll());
        }
        Queue<Person> myLinkedBlockingQueue = new LinkedBlockingQueue<>();
        
        Queue<Person> myArrayBlockingQueue = new ArrayBlockingQueue<>(5);
        myArrayBlockingQueue.add(new Person(1, "Jan", "Peetsers", 25));
        myArrayBlockingQueue.add(new Person(1, "Jan", "Peetsers", 5));
        myArrayBlockingQueue.add(new Person(1, "Jan", "Peetsers", 50));
        while (!myArrayBlockingQueue.isEmpty()) {
            System.out.println(myArrayBlockingQueue.poll());
        }
        Queue<Person> myPriorityBlockingQueue = new PriorityBlockingQueue<>();
        SynchronousQueue<Person> mySynchronousQueue = new SynchronousQueue<>();

        Queue<Person> myArrayDeque = new ArrayDeque<>();
        Queue<Person> myLinkedBlockingDeque = new LinkedBlockingDeque<>();
        
        Collection<String> test3 = new HashSet<>();
        List<String> lijst1 = new ArrayList<>();
        List<String> lijst2 = new CopyOnWriteArrayList<>();
        List<String> lijst3 = new LinkedList<>();
        List<String> lijst4 = new Vector<>();
        Set<String> set1 = new HashSet<>();
        
        myStringTreeSet.add("Test");
        System.out.println(myStringArray.length);
        System.out.println(myStringTreeSet.stream().toList());
        
    }

    private record Person (Integer id, String firstName, String lastName, Integer age) implements Comparable<Person> {

        @Override
        public int compareTo(Person person) {
            return Integer.compare(person.age, age);
        }}

    }
}
