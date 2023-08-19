public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        // Trying to access an index that doesn't exist
        int number = getNumberAtIndex(numbers, 5);
        System.out.println(number);
    }

    public static int getNumberAtIndex(int[] array, int index) {
        return array[index];
    }
}
