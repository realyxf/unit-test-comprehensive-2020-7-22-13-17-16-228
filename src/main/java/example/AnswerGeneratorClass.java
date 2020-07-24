package example;

import java.util.HashSet;
import java.util.Random;

public class AnswerGeneratorClass implements AnswerGenerator{
    @Override
    public int[] generate() {
        HashSet<Integer> answerSet = new HashSet<>();
        Random random = new Random();
        int[] answerGenerator = new int[4];
        do {
            int answerSetItem = random.nextInt(9);
            if(!answerSet.contains(answerSetItem)){
                answerSet.add(answerSetItem);
            }
        } while (answerSet.size()<4);

        int answerGeneratorIndex = 0;

        for (int answerSetItem : answerSet) {
            answerGenerator[answerGeneratorIndex] = answerSetItem;
            answerGeneratorIndex++;
        }

        return answerGenerator;
    }
}
