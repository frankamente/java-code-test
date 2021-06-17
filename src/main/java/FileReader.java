import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class FileReader {

    public String getText(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(path))) {
            return bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Error reading file.");
        }
        return "";
    }
}
