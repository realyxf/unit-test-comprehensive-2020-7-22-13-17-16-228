package example;

import java.util.HashSet;

class InputNumberValid {
    boolean isValidInput(int[] input) {
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
