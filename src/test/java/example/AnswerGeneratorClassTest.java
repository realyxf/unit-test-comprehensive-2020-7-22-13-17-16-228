package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerGeneratorClassTest {

    AnswerGeneratorClass answerGeneratorClass;



    @Test
    void should_return_the_length_is_4__when_generate_answer() {
        //given
        answerGeneratorClass = new AnswerGeneratorClass();
        int[] answer = answerGeneratorClass.generate();

        //when
        int result = answer.length;

        //then
        assertEquals(4, result);
    }

}
