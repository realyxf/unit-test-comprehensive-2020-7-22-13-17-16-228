package example;

public class GameProcess {
    public void playGame() {
        int times = 6;
        AnswerGenerator answerGenerator = new AnswerGeneratorClass();
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        GetInputGuess inputGuess = new GetInputGuess();

        int[] input;
        for (int indexTimes = 1; indexTimes <= times; indexTimes++) {
            input = inputGuess.getInput();
            if (!inputGuess.isValidInput(input)) {
                indexTimes--;
                continue;
            }
            System.out.println(guessNumber.guess(input));
            if (guessNumber.guess(input).equals("4A0B")) {
                System.out.println("Succeed");
                return;
            }
        }
        System.out.print("the answer is ");
        guessNumber.getAnswerGenerator();

    }
}
