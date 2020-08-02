package example;

import java.util.Arrays;
import java.util.Scanner;

public class GetInputGuess {
    public int[] getInput() {
        System.out.println("please input four number from 0 to 9");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine().trim();
        return Arrays.stream(inputStr.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
