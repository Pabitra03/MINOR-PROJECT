public class Problem1_RotateRight {
    public static void main(String[] args) {
        int[] myArray = {10, 11, 12, 13};

        System.out.println("Array is:- ");
        printArray(myArray);

        rotateRightBy2Bits(myArray);

        System.out.println("\nAfter rotation array:- ");
        printArray(myArray);
    }

    public static void rotateRightBy2Bits(int s[]) {
        for (int i = 0; i < s.length; i++) {
            s[i] = (s[i] >>> 2) | (s[i] << (32 - 2));
        }
    }

    public static void printArray(int s[]) {
        for (int i : s) {
            System.out.print(i + " ");
        }

        System.out.println("\nOriginal array showing 32 bit binary value:- ");
        for (int i : s) {
            System.out.print(String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0') + " ");
        }
    }
}