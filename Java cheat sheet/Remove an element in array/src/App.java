public class App {
    private int[] array;

    public void removeElement(int numToRemove) {
        int[] newArray = new int[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != numToRemove) {
                newArray[j] = array[i];
                j++;
            }
        }
        this.array = newArray;
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

        removeElement(25);

        System.out.println("Array after removing 25:");
        printArray(array);
    }
}