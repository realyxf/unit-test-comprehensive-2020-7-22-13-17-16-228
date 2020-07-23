package example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GuessNumber {
    private int[] answerGenerator;
    int countA=0;
    int countB=0;
    Set<Integer> answerSet = new HashSet<>();
    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        for(int answerIndex = 0; answerIndex<answerGenerator.length; answerIndex++){
            answerSet.add(answerGenerator[answerIndex]);
        }
        for(int inputGuessindex = 0; inputGuessindex < inputGuess.length; inputGuessindex++){
            if(inputGuess[inputGuessindex] == answerGenerator[inputGuessindex]){
                countA++;
            }
            if(answerSet.contains(inputGuess[inputGuessindex])){
                countB++;
            }
        }
        return String.format("%sA%sB",countA,countB);
    }
}
