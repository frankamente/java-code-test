import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class CodeTest {
    private static final String FILE_PATH = "src/test/resources/fileTest.txt";

    public static void main(String[] args) {
        reverseArray(new String[]{"x", "y", "z"});
        uppercaseArray(new String[]{"x", "y", "z"});
        findWordCount("the cat jumped over the mat", "the");
        writeContentsToConsole(FILE_PATH, new FileReader(), new Console());
        puzzle(new Console());
    }

    public static String[] reverseArray(String[] input) {
        final String[] inputArrayCopy = Arrays.copyOf(input, input.length);
        Collections.reverse(Arrays.asList(inputArrayCopy));
        return inputArrayCopy;
    }

    public static String[] uppercaseArray(String[] input) {
        return Arrays.stream(input)
                .map(String::toUpperCase)
                .toArray(String[]::new);
    }

    public static int findWordCount(String text, String wordToFind) {
        final String[] words = text.split(" ");
        return (int) Arrays.stream(words)
                .filter(word -> word.equalsIgnoreCase(wordToFind))
                .count();
    }

    public static Function<Integer, Integer> composeU(Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return f1.compose(f2);
    }

    public static void writeContentsToConsole(String path, FileReader fileReader, Console console) {
        String text = fileReader.getText(path);
        console.writeln(text);
    }

    public static void handleInvalidArgument(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input should be positive");
        }
    }

    public static void puzzle(Console console) {
        final ArrayList<Integer> inputNumbers = new ArrayList<>();
        while (!shouldEnd(inputNumbers)) {
            int numberRead = console.readInt("Enter next number: ");
            inputNumbers.add(numberRead);
            if (!shouldEnd(inputNumbers)) {
                console.writeln(numberRead);
            }
        }
        console.writeln("Snap");
    }

    private static boolean shouldEnd(ArrayList<Integer> inputNumbers) {
        if (cantHaveConsecutiveNumbers(inputNumbers)) {
            return false;
        }
        return areLastTwoNumbersConsecutive(inputNumbers);
    }

    private static boolean areLastTwoNumbersConsecutive(ArrayList<Integer> inputNumbers) {
        return getLastNumber(inputNumbers).equals(getPenultimateNumber(inputNumbers));
    }

    private static Integer getLastNumber(ArrayList<Integer> inputNumbers) {
        return inputNumbers.get(inputNumbers.size() - 1);
    }

    private static Integer getPenultimateNumber(ArrayList<Integer> inputNumbers) {
        return inputNumbers.get(inputNumbers.size() - 2);
    }

    private static boolean cantHaveConsecutiveNumbers(ArrayList<Integer> inputNumbers) {
        return inputNumbers.size() < 2;
    }
}