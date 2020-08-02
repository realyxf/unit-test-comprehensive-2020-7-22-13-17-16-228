package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    private GuessNumber guessNumber;

    @BeforeEach
    void setUp() {
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        guessNumber = new GuessNumber(answerGenerator);
    }

    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_inputguess_1234() {
        //given
        int[] inputGuess = {1, 2, 3, 4};

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("4A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_inputguess_4321() {
        //given
        int[] inputGuess = {4, 3, 2, 1};

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_inputguess_5678() {
        //given
        int[] inputGuess = {5, 6, 7, 8};

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_2A2B_when_guess_given_answer_1234_and_inputguess_1243() {
        //given
        int[] inputGuess = {1, 2, 4, 3};

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("2A2B", result);
    }

    @Test
    void should_return_1A1B_when_guess_given_answer_1234_and_inputguess_1456() {
        //given
        int[] inputGuess = {1, 4, 5, 6};

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("1A1B", result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_1234_and_inputguess_2156() {
        //given
        int[] inputGuess = {2, 1, 5, 6};

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("0A2B", result);
    }
}
