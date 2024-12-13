public class App {

    static int findElement(int[] array, int numToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numToFind) {
                return i;
            }
        }
        return -1;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Original Array:");
        printArray(array);

        System.out.println(25 + " is at index " + findElement(array, 25)); // hard code input to print
    }
}