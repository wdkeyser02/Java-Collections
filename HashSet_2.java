import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class HashSet_2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("\nJava Array - ArrayList Speedtest!\n");
        int size = 10000000;
        Integer value;

        HashSet<Integer> myIntegerHashSet = new HashSet<>();
        ArrayList<Integer> myIntegerArrayList = new ArrayList<>(size);

        System.out.println("\nSpeed test Add.");
        long startAdd = System.nanoTime();
        for(int x = 0; x < size; x++) {
            myIntegerHashSet.add(x);
        }
        long stopAdd = System.nanoTime();
        for(int x = 0; x < size; x++) {
            myIntegerArrayList.add(x);
        }
        long endAdd = System.nanoTime();
        long intTimeAdd = TimeUnit.NANOSECONDS.toMillis(stopAdd - startAdd);
        long integerTimeAdd = TimeUnit.NANOSECONDS.toMillis(endAdd - stopAdd);
        System.out.println("Add HashSet Time: " + intTimeAdd + " ms");
        System.out.println("Add ArrayList Time: " + integerTimeAdd + " ms");
        System.out.println("\n");

        System.out.println("\nSpeed test Get.");
        long startGet = System.nanoTime();
        for(Integer element : myIntegerHashSet) {
            value = element;
        }
        long stopGet = System.nanoTime();
        for(int x = 0; x < size; x++) {
            value = myIntegerArrayList.get(x);
        }
        long endGet = System.nanoTime();
        long intTimeGet = TimeUnit.NANOSECONDS.toMillis(stopGet - startGet);
        long integerTimeGet = TimeUnit.NANOSECONDS.toMillis(endGet - stopGet);
        System.out.println("HashSet Get Time: " + intTimeGet + " ms");
        System.out.println("ArrayList Get Time: " + integerTimeGet + " ms");
        System.out.println("\n");

    }
}
