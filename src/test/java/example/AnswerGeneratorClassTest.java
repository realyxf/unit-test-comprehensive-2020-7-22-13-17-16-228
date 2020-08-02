package example;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerGeneratorClassTest {

    AnswerGeneratorClass answerGeneratorClass;



    @Test
    void should_return_the_length_is_4__when_generate_answer() {
        //given
        answerGeneratorClass = new AnswerGeneratorClass();

        //when
        int[] answer = answerGeneratorClass.generate();
        int result = answer.length;

        //then
        assertEquals(4, result);
    }

    @Test
    void should_return_4_different_number_when_generate_answer() {
        //given
        answerGeneratorClass = new AnswerGeneratorClass();

        //when
        boolean result = true;
        int[] answer = answerGeneratorClass.generate();
        HashSet<Integer> answerSet = new HashSet<>();
        for (int answerItem : answer) {
            if (answerSet.contains(answerItem)) {
                result = false;
            }
            answerSet.add(answerItem);
        }

        //then
        assertEquals(true, result);
    }

}
