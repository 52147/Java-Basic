public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            int[] array = new int[5];
            array[10] = 30;  // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}