package example;

public class Main {
    public static void main(String[] args) {

//        AnswerGenerator answerGenerator = new AnswerGeneratorClass();
//        GuessNumber guessNumber = new GuessNumber(answerGenerator);
//
//        GetInputGuess inputGuess = new GetInputGuess();
//        int[] input= inputGuess.getInput();
//        for (int inputIndex = 0; inputIndex < 4; inputIndex++) {
//            System.out.print(input[inputIndex]);
//        }
//
//
//        String result = guessNumber.guess(input);
//        System.out.println(result);
        GameProcess gameProcess =new GameProcess();
        gameProcess.playGame();

    }
}
