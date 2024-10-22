package Exercise6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // create an arraylist of numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // add in list any numbers
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(8);
        numbers.add(9);
        numbers.add(4);
        numbers.add(7);

        // print list before works
        System.out.println("Array Original: " + numbers);

        // print list sorted and sorted reverse
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Array Sorted: " + numbers);

        // print shuffle list
        Collections.shuffle(numbers);
        System.out.println("Array Shuffled: " + numbers);

    }
}
