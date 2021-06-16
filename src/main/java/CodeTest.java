import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class CodeTest {
    public static void main(String[] args) {
        System.out.println("Please replace this with calls to all completed tests.");
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

    public static void writeContentsToConsole() {
        // add code here
    }

    public static void handleInvalidArgument(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input should be positive");
        }
    }

    public static void puzzle() {
        // add code here
    }
}