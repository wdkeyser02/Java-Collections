import java.util.*;
import java.util.concurrent.*;

public class Collections_1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        System.out.println("\nJava Collections\n");

        String[] myStringArray = new String[25];
        
        System.out.println("The Java Collections Framework provides several general-purpose implementations of the core interfaces.");
        System.out.println("The most commonly used implementations.");
        Set<String> myHashSet = new HashSet<>();
        List<String> myList = new ArrayList<>();
        Map<String, String> myHashMap = new HashMap<>();
        Queue<Person> myLinkedListQueue = new LinkedList<>();
        ArrayDeque<String> myArrayDeque = new ArrayDeque<>();
        
        Set<String> myTreeSet = new TreeSet<>();
        SortedSet<String> myTreeSetSorted = new TreeSet<>();
        Set<String> myLinkedHashSet = new LinkedHashSet<>();
        Set<String> myCopyOnWriteArraySet = new CopyOnWriteArraySet<>();
        EnumSet<myEnum> myEnumSet = EnumSet.allOf(myEnum.class);
                
        List<String> myLinkedList = new LinkedList<>();
        List<String> myCopyOnWriteArrayList = new CopyOnWriteArrayList<>();
        List<String> myVector = new Vector<>();
        List<String> myStack = new Stack<>();
        
        Map<String, String> myTreeMap = new TreeMap<>();
        Map<String, String> myLinkedHashMap = new LinkedHashMap<>();
        Map<String, String> myConcurrentHashMap = new ConcurrentHashMap<>();
        Map<String, String> myIdentityHashMap = new IdentityHashMap<>();
        Map<String, String> myWeakHashMap = new WeakHashMap<>();
        Map<myEnum, String> myEnumMap = new EnumMap<>(myEnum.class);

        Queue<Person> myPriorityQueue = new PriorityQueue<>();
        Queue<Person> myLinkedBlockingQueue = new LinkedBlockingQueue<>();
        Queue<Person> myArrayBlockingQueue = new ArrayBlockingQueue<>(5);
        Queue<Person> myPriorityBlockingQueue = new PriorityBlockingQueue<>();
        Queue<Person> mySynchronousQueue = new SynchronousQueue<>();
        Queue<Person> myLinkedTransferQueue = new LinkedTransferQueue<>();
        Queue<DelayObject> myDelayQueue = new DelayQueue<DelayObject>();

        Deque<String> myLinkedListDeque = new LinkedList<>();
        Deque<String> myLinkedBlockingDeque = new LinkedBlockingDeque<>();
                
    }

    private enum myEnum {ALICE, DAVID, CHARLIE, EVA, FRANK};
    
    private record Person (Integer id, String firstName, String lastName, Integer age) implements Comparable<Person> {

        @Override
        public int compareTo(Person person) {
            return Integer.compare(person.age, age);
        }

    }

    class DelayObject implements Delayed {

        private String name;
        private Long time;

        public DelayObject(String name, long delayTime) {
            this.name = name;
            this.time = System.currentTimeMillis()
                    + delayTime;
        }

        @Override
        public int compareTo(Delayed object) {
            if (this.time < ((DelayObject)object).time) {
                return -1;
            }
            if (this.time > ((DelayObject)object).time) {
                return 1;
            }
            return 0;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long diff = time - System.currentTimeMillis();
            return unit.convert(diff, TimeUnit.MILLISECONDS);
        }

        @Override
        public String toString() {
            return "\n{"
                + "name=" + name
                + ", time=" + time
                + "}";
        }

    }    
}
