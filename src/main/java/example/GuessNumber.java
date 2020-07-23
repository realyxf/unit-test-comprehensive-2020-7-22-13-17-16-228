package example;

public class GuessNumber {
    private int[] answerGenerator;
    int countA=0;
    int countB=0;
    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        for(int index = 0; index < inputGuess.length; index++){
            if(inputGuess[index] == answerGenerator[index]){
                countA++;
            }
        }
        return String.format("%sA%sB",countA,countB);
    }
}
