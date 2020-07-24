package example;

public class Main {
    public static void main(String[] args) {
//         test generate answer
        AnswerGeneratorClass a = new AnswerGeneratorClass();
        int[] arr = a.generate(); //TODO arr
        for(int i=0;i<4;i++){
            System.out.print(arr[i]);
        }
        GetInputGuess inputGuess = new GetInputGuess();
        int[] input= inputGuess.getInput();
        for(int inputIndex=0;inputIndex<4;inputIndex++){
            System.out.print(input[inputIndex]);
        }

        GuessNumber guessNumber = new GuessNumber(a);
        String result = guessNumber.guess(input);
        System.out.println(result);

    }
}
