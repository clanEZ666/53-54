package TreeSet;


public class Set {

    public static int[] findClosetNumbers(int[] numbers, int target) {

        int closetSmaller = Integer.MIN_VALUE;
        int closetLarger = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < target) {
                closetSmaller = number;
            } else if (number > target && closetLarger == Integer.MAX_VALUE) {
                closetLarger = number; //
                break;
            }
        }

        return new int[]{
                closetSmaller == Integer.MIN_VALUE ? -1 : closetSmaller,
                closetLarger == Integer.MAX_VALUE ? -1 : closetLarger

        };
    }
}



