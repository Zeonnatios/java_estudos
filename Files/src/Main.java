import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("d:\\input.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException err) {
            System.out.println("Error" + err.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}