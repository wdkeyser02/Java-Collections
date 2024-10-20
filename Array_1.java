import java.util.Arrays;

public class Array_1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        System.out.println("\nJava Array\n");

        byte mybyteArray[];
        mybyteArray = new byte[3];
        mybyteArray[0] = 1;
        mybyteArray[1] = 2;
        mybyteArray[2] = 3;
        System.out.println("\nmybyteArray size: " + mybyteArray.length);
        for(byte x = 0; x < 3; x++) {
            System.out.println("mybyteArray at index " + x + " : " + mybyteArray[x]);
        }

        mybyteArray[0] = 10;
        mybyteArray[1] = 20;
        mybyteArray[2] = 30;
        System.out.println("\nmybyteArray size: " + mybyteArray.length);
        for(byte x = 0; x < 3; x++) {
            System.out.println("mybyteArray at index " + x + " : " + mybyteArray[x]);
        }

        byte test = 0;
        Arrays.fill(mybyteArray, test);
        System.out.println("\nmybyteArray size: " + mybyteArray.length);
        for(byte x = 0; x < 3; x++) {
            System.out.println("mybyteArray at index " + x + " : " + mybyteArray[x]);
        }

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
        
        int[] myintArray[];
        Integer[] myIntegerArray[];
        String[] myStringArray[];
        Person[] myPersonArray[];
    }

    private record Person (Integer id, String firstName, String lastName, Integer age) {}
}
