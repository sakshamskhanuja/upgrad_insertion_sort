import java.util.Scanner;

public class Main {

    public static void main(String[] ss) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Scans the size of names arrays.
        int size = scanner.nextInt();

        // Initializing arrays to store first and last names.
        String[] firstNames = new String[size];
        String[] lastNames = new String[size];

        // Fills up arrays with first names.
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }

        // Fills up arrays with last names.
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        // Sorts array having first names in ascending order.
        sortStringArrayInAscendingOrder(firstNames);

        // Sorts array having last names in descending order.
        sortStringArrayInDescendingOrder(lastNames);

        // Prints both first and last name arrays.
        printStringArray(firstNames);
        printStringArray(lastNames);
    }

    /**
     * Prints the contents of a String array.
     */
    private static void printStringArray(String[] array) {
        for (String i : array) {
            System.out.println(i);
        }
    }

    /**
     * Sorts the elements of a String array in ascending order.
     */
    private static void sortStringArrayInAscendingOrder(String[] array) {
        int previousIndex;
        String currentValue;

        for (int i = 1; i < array.length; i++) {
            currentValue = array[i];
            previousIndex = i - 1;

            while (previousIndex >= 0 && array[previousIndex].compareTo(currentValue) > 0) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            array[previousIndex + 1] = currentValue;
        }
    }

    /**
     * Sorts the contents of a String array in descending order.
     */
    private static void sortStringArrayInDescendingOrder(String[] array) {
        int previousIndex;
        String currentValue;

        for (int i = 1; i < array.length; i++) {
            currentValue = array[i];
            previousIndex = i - 1;

            while (previousIndex >= 0 && array[previousIndex].compareTo(currentValue) < 0) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            array[previousIndex + 1] = currentValue;
        }
    }
}
