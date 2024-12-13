public class App {

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // reduce by one every pass as the largest is at right
            for (int j = 0; j < array.length - i - 1; j++) { // length - i - 1 prevents comparing against sorted element
                if (array[j] > array[j + 1]) { // comparing left and left + 1 (right) to swap or not
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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

        bubbleSort(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}