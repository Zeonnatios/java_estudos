import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        String lines[] = new String[]{"Boris", "Sid", "Princess", "Beauty", "Little Beauty"};
        String path = "d:\\output.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException err) {
            err.printStackTrace();
        }

    }
}
