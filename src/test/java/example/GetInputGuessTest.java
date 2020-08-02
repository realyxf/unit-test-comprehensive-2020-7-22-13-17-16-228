package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GetInputGuessTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void should_return_1234_when_checkout_given_inputguess_1234() {
        //given
        int[] inputguess = {1, 2, 3, 4};
        GetInputGuess getInputGuess = Mockito.mock(GetInputGuess.class);
        when(getInputGuess.getInput()).thenReturn(inputguess);

        //when
        String result = Arrays.toString(getInputGuess.getInput());

        //then
        assertEquals("[1, 2, 3, 4]", result);

    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    void should_return_wrong_input_input_again_when_getInput_given_1_1_2_3() {
        //given
        int[] inputguess = {1, 1, 2, 3};
        InputNumberValid inputNumberValid = new InputNumberValid();

        //when
        inputNumberValid.isValidInput(inputguess);

        //then
        assertEquals("Wrong Input，Input again", systemOut());
    }

    @Test
    void should_return_wrong_input_input_again_when_getInput_given_1_2() {
        //given
        int[] inputguess = {1, 2};
        InputNumberValid inputNumberValid = new InputNumberValid();

        //when
        inputNumberValid.isValidInput(inputguess);

        //then
        assertEquals("Wrong Input，Input again", systemOut());
    }
}
