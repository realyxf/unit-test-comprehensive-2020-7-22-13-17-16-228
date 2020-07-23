package example;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.tools.javac.util.StringUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GetInputGuessTest {
    @Test
    void should_return_1234_when_checkout_given_inputguess_1234() {
        //given
        int[] inputguess = {1,2,3,4};
        GetInputGuess getInputGuess = Mockito.mock(GetInputGuess.class);
        when(getInputGuess.getInput()).thenReturn(inputguess);

        //when
        String result = Arrays.toString(getInputGuess.getInput());

        //then
        assertEquals("[1, 2, 3, 4]",result);

    }
}
