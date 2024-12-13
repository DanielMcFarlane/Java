public class App {

    static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) { // Loop runs only until the middle of the array
            int j = array.length - 1 - i; // j is right
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
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

        reverseArray(array);

        System.out.println("Reversed Array:");
        printArray(array);
    }
}