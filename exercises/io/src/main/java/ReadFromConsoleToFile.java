import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFromConsoleToFile {
    public static void main(String[] args) {
        example3();
    }

    private static void example1() {
        File f = new File("output.txt");
        Scanner s = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            String line = null;
            boolean done = false;
            do {
                line = s.nextLine();
                if ("end".equals(line)) {
                    done = true;
                } else {
                    writer.println(line);
                }
            } while (!done);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void example3() {
        File f = new File("output.txt");
        Scanner s = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            String line = null;
            while (s.hasNextLine() && !"end".equals((line = s.nextLine()))) {
                writer.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void example2() {
        File f = new File("output.txt");
        Scanner s = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            String line = null;
            while ((line = s.nextLine()) != null && !"end".equals(line)) {;
                writer.println(line);
            };
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
