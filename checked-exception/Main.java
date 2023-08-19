import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            readFile("somefile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}

