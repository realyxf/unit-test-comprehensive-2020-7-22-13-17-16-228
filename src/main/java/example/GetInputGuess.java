package example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class GetInputGuess {
    public int[] getInput() {
        System.out.println("please input four number from 0 to 9");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        return Arrays.stream(inputStr.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
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
