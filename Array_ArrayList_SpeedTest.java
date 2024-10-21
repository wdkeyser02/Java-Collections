import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Array_ArrayList_SpeedTest {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        System.out.println("\nJava Array - ArrayList Speedtest!\n");
        int size = 100000000;
        Integer value;

        Integer[] myIntegerarray = new Integer[size];
        ArrayList<Integer> myIntegerArrayList = new ArrayList<>(size);

        System.out.println("\nSpeed test Add.");
        long startAdd = System.nanoTime();
        for(int x = 0; x < size; x++) {
            myIntegerarray[x] = x;
        }
        long stopAdd = System.nanoTime();
        for(int x = 0; x < size; x++) {
            myIntegerArrayList.add(x, x);
        }
        long endAdd = System.nanoTime();
        long intTimeAdd = TimeUnit.NANOSECONDS.toMillis(stopAdd - startAdd);
        long integerTimeAdd = TimeUnit.NANOSECONDS.toMillis(endAdd - stopAdd);
        System.out.println("Add Array Time: " + intTimeAdd + " ms");
        System.out.println("Add ArrayList Time: " + integerTimeAdd + " ms");
        System.out.println("\n");

        System.out.println("\nSpeed test Get.");
        long startGet = System.nanoTime();
        for(int x = 0; x < size; x++) {
            value = myIntegerarray[x];
        }
        long stopGet = System.nanoTime();
        for(int x = 0; x < size; x++) {
            value = myIntegerArrayList.get(x);
        }
        long endGet = System.nanoTime();
        long intTimeGet = TimeUnit.NANOSECONDS.toMillis(stopGet - startGet);
        long integerTimeGet = TimeUnit.NANOSECONDS.toMillis(endGet - stopGet);
        System.out.println("Array Get Time: " + intTimeGet + " ms");
        System.out.println("ArrayList Get Time: " + integerTimeGet + " ms");
        System.out.println("\n");

    }
}
