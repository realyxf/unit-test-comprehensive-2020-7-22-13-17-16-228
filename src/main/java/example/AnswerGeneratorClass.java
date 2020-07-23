package example;

import java.util.Random;

public class AnswerGeneratorClass implements AnswerGenerator{
    @Override
    public int[] generate() {
        int[] answerGenerator = new int[4];
        Random random = new Random();
        for (int answerIndex = 0; answerIndex < 4; answerIndex++) {
            int answerItem = random.nextInt(9); // 生成[0,9]区间的整数
            answerGenerator[answerIndex] = answerItem;
        }
        return answerGenerator;
    }
}
