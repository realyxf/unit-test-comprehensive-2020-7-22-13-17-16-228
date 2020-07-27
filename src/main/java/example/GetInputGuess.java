package example;

import java.util.HashSet;
import java.util.Scanner;

public class GetInputGuess {
    public int[] getInput() {
        System.out.println("please input four number from 0 to 9");
        Scanner scanner = new Scanner(System.in);
        int[] inputGuess = new int[4];
        for (int i = 0; i < inputGuess.length; i++) {
            inputGuess[i] = scanner.nextInt();
        }
        return inputGuess;
    }

    public boolean isValidInput(int[] input) {
        HashSet<Integer> inputSet = new HashSet<>();
        if (input.length != 4) {
            System.out.print("Wrong Input，Input again");
            return false;
        }
        for (int inputItem : input) {
            if (inputSet.contains(inputItem)) {
                System.out.print("Wrong Input，Input again");
                return false;
            }
            inputSet.add(inputItem);
        }
        return true;
    }
}
