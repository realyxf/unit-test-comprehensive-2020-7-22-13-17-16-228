package example;

public class Main {
    public static void main(String[] args) {

        AnswerGeneratorClass a = new AnswerGeneratorClass();
        int[] arr = a.generate();
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        GuessNumber g = new GuessNumber(a);
        int[] input = {1,2,3,4};
        String str = g.guess(input);
        System.out.println(str);

    }
}
