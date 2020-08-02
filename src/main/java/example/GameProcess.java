package example;

public class GameProcess {
    public void playGame() {
        int times = 6;
        AnswerGenerator answerGenerator = new AnswerGeneratorClass();
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        GetInputGuess inputGuess = new GetInputGuess();
        InputNumberValid inputNumberValid = new InputNumberValid();

        int[] input;
        for (int indexTimes = 1; indexTimes <= times; indexTimes++) {
            input = inputGuess.getInput();
            if (!inputNumberValid.isValidInput(input)) {
                indexTimes--;
                continue;
            }
            System.out.println(guessNumber.guess(input));
            if (guessNumber.guess(input).equals("4A0B")) {
                getGameStatus("4A0B");
                return;
            }
            if(indexTimes != 6){
                getGameStatus("wronginput");
            }
        }
        getGameStatus("failed");
        printAnswer(guessNumber);
    }

    void getGameStatus(String status){
        if(status.equals("4A0B")){
            System.out.print("Succeed\n");
        }
        if(status.equals("wronginput")){
            System.out.print("In-process\n");
        }
        if(status.equals("failed")){
            System.out.print("Failed\n");
        }
    }

    private void printAnswer(GuessNumber guessNumber) {
        int[] answer = guessNumber.getAnswerGenerator();
        System.out.print("the answer is ");
        for(int answerItem : answer){
            System.out.print(answerItem);
        }
    }
}
