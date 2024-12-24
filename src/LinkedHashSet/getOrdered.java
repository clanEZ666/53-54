package LinkedHashSet;

import java.util.LinkedHashSet;

public class getOrdered {

    public static LinkedHashSet<String> getOrderedUniqueElements(String[] words) {
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>();


        for (String word : words) {
            uniqueSet.add(word);
        }

        return uniqueSet;
    }

}

