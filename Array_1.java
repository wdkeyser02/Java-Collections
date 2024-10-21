import java.util.Arrays;

public class Array_1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        System.out.println("\nJava Array\n");
        System.out.println("Advantages of Java Arrays");
        System.out.println("Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).");
        System.out.println("Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.");
        System.out.println("Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.");
        System.out.println("");
        System.out.println("Disadvantages of Java Arrays");
        System.out.println("Fixed Size: Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.");
        System.out.println("Type Homogeneity: Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.");
        System.out.println("Insertion and Deletion: Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.");
        System.out.println("");

        byte mybyteArray[];
        mybyteArray = new byte[3];
        mybyteArray[0] = 1;
        mybyteArray[1] = 2;
        mybyteArray[2] = 3;
        System.out.println("\nmybyteArray size: " + mybyteArray.length);
        for(byte x = 0; x < 3; x++) {
            System.out.println("mybyteArray at index " + x + " : " + mybyteArray[x]);
        }
        System.out.println("");

        mybyteArray[0] = 10;
        mybyteArray[1] = 20;
        mybyteArray[2] = 30;
        System.out.println("\nmybyteArray size: " + mybyteArray.length);
        for(byte x = 0; x < 3; x++) {
            System.out.println("mybyteArray at index " + x + " : " + mybyteArray[x]);
        }
        System.out.println("");

        byte test = 0;
        Arrays.fill(mybyteArray, test);
        System.out.println("\nmybyteArray size: " + mybyteArray.length);
        for(byte x = 0; x < 3; x++) {
            System.out.println("mybyteArray at index " + x + " : " + mybyteArray[x]);
        }
        System.out.println("");

        byte[] mybyteArray1 = new byte[3];
        byte[][] mybyteArray2 = new byte[3][3];
        byte[][][] mybyteArray3 = new byte[3][3][3];
        
        byte[] mybyteArray11 = {1, 2, 3};
        byte[][] mybyteArray12 = {{1, 2, 3}, {4, 5, 6}};
        byte[][][] mybyteArray13 = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}}, {{21, 22, 23}, {24, 25, 26}, {27, 28, 29}}};
        for(byte x = 0; x < 3; x++) {
            for(byte y = 0; y < 3; y++) {
                for(byte z = 0; z < 3; z++) {
                    System.out.println("mybyteArray at index " + x + " " + y + " " + z + " : " + mybyteArray13[x][y][z]);
                }
            }
        }
        System.out.println("");
        
        System.out.println("Clone Array: ");
        int myintArray[] = { 1, 2, 3 };
        int mycloneArray[] = myintArray.clone();

        System.out.println(myintArray == mycloneArray);
        for (int i = 0; i < mycloneArray.length; i++) {
            System.out.print(mycloneArray[i] + " ");
        }
        System.out.println("");

        Integer[] myIntegerArray[];
        String[] myStringArray[];
        Person[] myPersonArray[];
        System.out.println("");
    }

    private record Person (Integer id, String firstName, String lastName, Integer age) {}
}
