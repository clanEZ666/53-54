package dz5354;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int number : numbers) {

            uniqueSet.add(number);
        }

        return uniqueSet;

    }

}
