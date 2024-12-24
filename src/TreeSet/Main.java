package TreeSet;

import java.util.Arrays;

import static TreeSet.Set.findClosetNumbers;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;


        int[] result = findClosetNumbers(numbers, target);

        System.out.println("Ближаший меньший и больший: " + Arrays.toString(result));


    }
}
