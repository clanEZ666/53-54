package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

import static LinkedHashSet.getOrdered.getOrderedUniqueElements;


public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};

        LinkedHashSet<String> result = getOrderedUniqueElements(words);

        System.out.println("Unique words: " + result);
    }
}

