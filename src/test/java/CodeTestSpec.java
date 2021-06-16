import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
        final int expectedCountOfWordTHE = 2;
        final int expectedCountOfWordCAT = 1;
        final String text = "the cat jumped over the mat";

        // act
        final int countOfWordTHE = CodeTest.findWordCount(text, "the");
        final int countOfWordCAT = CodeTest.findWordCount(text, "cat");

        // assert
        assertEquals(expectedCountOfWordTHE, countOfWordTHE);
        assertEquals(expectedCountOfWordCAT, countOfWordCAT);
    }

    @Test
    public void composeU_returnsExpectedResult() {

    }

    @Test
    public void writeContentsToConsole_returnsExpectedResult() {

    }

    @Test
    public void handleInvalidArgument_returnsExpectedResult() {

    }

    @Test
    public void puzzle_returnsExpectedResult() {

    }
}
