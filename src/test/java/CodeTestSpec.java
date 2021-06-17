import org.junit.Test;
import org.mockito.Mockito;

import java.util.function.Function;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/*
 *   Please code the tests in the format of reverseArray_returnsExpectedResult. This is an example of how we write our tests at Cardano.
 *
 *   Test 1-4 tests are easy as the function returns a result that can be asserted. Tests 5-7 are more difficult to assert as they are
 *   void, use your knowledge to write a meaningful test.
 *
 *   Feel free to use the internet to help you with you answers but make sure you understand the answer as we will ask you questions.
 */

public class CodeTestSpec {

    @Test
    public void reverseArray_returnsExpectedResult() {
        // arrange
        final String[] EXPECTED = {"x", "y", "z"};

        // act
        final String[] actual = CodeTest.reverseArray(new String[]{"z", "y", "x"});

        // assert
        assertArrayEquals(EXPECTED, actual);
    }

    @Test
    public void uppercaseArray_returnsExpectedResult() {
        // arrange
        final String[] EXPECTED = {"X", "Y", "Z"};

        // act
        final String[] actual = CodeTest.uppercaseArray(new String[]{"x", "y", "z"});

        // assert
        assertArrayEquals(EXPECTED, actual);
    }

    @Test
    public void findWordCount_returnsExpectedResult() {
        // arrange
        final int EXPECTED_COUNT_OF_WORD_THE = 2;
        final int EXPECTED_COUNT_OF_WORD_CAT = 1;
        final String text = "the cat jumped over the mat";

        // act
        final int countOfWordTHE = CodeTest.findWordCount(text, "the");
        final int countOfWordCAT = CodeTest.findWordCount(text, "cat");

        // assert
        assertEquals(EXPECTED_COUNT_OF_WORD_THE, countOfWordTHE);
        assertEquals(EXPECTED_COUNT_OF_WORD_CAT, countOfWordCAT);
    }

    @Test
    public void composeU_returnsExpectedResult() {
        // arrange
        final int testNumber = 4;

        final Function<Integer, Integer> multiply = (value) -> value * 2;
        final Function<Integer, Integer> add = (value) -> value + 4;
        final Function<Integer, Integer> EXPECTED_MULTIPLY_COMPOSE_ADD = (value) -> (value + 4) * 2;
        final Function<Integer, Integer> EXPECTED_ADD_COMPOSE_MULTIPLY = (value) -> (value * 2) + 4;

        // act
        Function<Integer, Integer> resultMultiplyComposeAdd = CodeTest.composeU(multiply, add);
        Function<Integer, Integer> resultAddComposeMultiply = CodeTest.composeU(add, multiply);

        // assert
        assertEquals(EXPECTED_MULTIPLY_COMPOSE_ADD.apply(testNumber), resultMultiplyComposeAdd.apply(testNumber));
        assertEquals(EXPECTED_ADD_COMPOSE_MULTIPLY.apply(testNumber), resultAddComposeMultiply.apply(testNumber));
    }

    @Test
    public void writeContentsToConsole_returnsExpectedResult() {
        final FileReader fileReader = Mockito.mock(FileReader.class);
        final String pathToFile = "pathToFile";
        final String sampleText = "This is a sample text";

        when(fileReader.getText(pathToFile))
                .thenReturn(sampleText);

        final Console consoleMock = Mockito.mock(Console.class);

        CodeTest.writeContentsToConsole(pathToFile, fileReader, consoleMock);
        verify(consoleMock).writeln(sampleText);
    }

    @Test(expected = IllegalArgumentException.class)
    public void handleInvalidArgument_returnsExpectedResult() {
        // arrange
        final int negativeNumber = -1;

        // act
        CodeTest.handleInvalidArgument(negativeNumber);
    }

    @Test
    public void puzzle_returnsExpectedResult() {
        final Console consoleMock = Mockito.mock(Console.class);
        when(consoleMock.readInt("Enter next number: "))
                .thenReturn(1)
                .thenReturn(2)
                .thenReturn(2);

        CodeTest.puzzle(consoleMock);
        verify(consoleMock).writeln(1);
        verify(consoleMock).writeln(2);
        verify(consoleMock).writeln("Snap");
    }
}
