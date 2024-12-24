package dz5354;

import java.util.HashSet;
import java.util.Set;

import static dz5354.UniqueElements.getUniqueElements;

public class SetI {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4};

        Set<Integer> uniqueNumbers = getUniqueElements(numbers);

        System.out.println("Unique numbers: " + uniqueNumbers);


    }
}
