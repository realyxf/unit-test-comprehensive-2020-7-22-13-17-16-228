package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumber {
    private int[] answerGenerator;

    Set<Integer> answerSet = new HashSet<>();

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator.generate();
    }

    public int[] getAnswerGenerator() {
        for (int i = 0; i < this.answerGenerator.length; i++) {
            System.out.print(this.answerGenerator[i]);
        }
        return answerGenerator;
    }

    public String guess(int[] inputGuess) {
        int countA = 0;
        int countB = 0;

        for (int answerIndex = 0; answerIndex < answerGenerator.length; answerIndex++) {
            answerSet.add(answerGenerator[answerIndex]);
        }

        for (int inputGuessindex = 0; inputGuessindex < inputGuess.length; inputGuessindex++) {
            if (inputGuess[inputGuessindex] == answerGenerator[inputGuessindex]) {
                countA++;
            }
            if (answerSet.contains(inputGuess[inputGuessindex])) {
                countB++;
            }
        }

        if (countA != 0 && countB != 0) {
            countB = countB - countA;
        }

        return String.format("%sA%sB", countA, countB);
    }
}
