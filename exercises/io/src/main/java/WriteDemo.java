import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDemo {
    public static void main(String[] args) {
        File f = new File("output.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            writer.println("hello, world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
