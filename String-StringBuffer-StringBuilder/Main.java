public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");  // str1 remains "Hello", str2 is "Hello World"
        
        System.out.println(str1);
        System.out.println(str2);
        
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");  // buffer now contains "Hello World"
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");  // builder now contains "Hello World"
        System.out.println(builder);

    }
}