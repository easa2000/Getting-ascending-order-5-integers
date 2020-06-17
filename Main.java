import java.util.Scanner;

//Enter 5 Integers number. It's return ascending order of that's 5 Integers Number

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] values = new int[capacity];
        System.out.println("Enter " + capacity + " Integers Value:\r");
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] arrays) {
        for (int i=0; i<arrays.length; i++) {
            System.out.println("Element " + i + " contents " + arrays[i]);
        }
    }

    public static int[] sortIntegers(int [] arrays) {
        int[] sortedArrays = new int[arrays.length];
        for (int i=0; i<sortedArrays.length; i++) {
            sortedArrays[i] = arrays[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for (int i=0; i<sortedArrays.length-1; i++) {
                if (sortedArrays[i] > sortedArrays[i+1]) {
                    temp = sortedArrays[i];
                    sortedArrays[i] = sortedArrays[i+1];
                    sortedArrays[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArrays;
    }
}
