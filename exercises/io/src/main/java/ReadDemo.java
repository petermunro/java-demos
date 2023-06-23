import java.io.*;

public class ReadDemo {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line = reader.readLine();
            System.out.println("read line: " + line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
