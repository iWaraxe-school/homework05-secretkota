package Exercise1;

import java.util.ArrayList;

/**
 * The class demonstrate the generation of random number
 * and add them in an ArrayList, printing only even numbers
 */
public class Main {
    /**
     * In main method generate 10 random numbers, and add them to ArrayList
     * and print all only even numbers from the list
     *
     * @param args no used in the method
     */
    public static void main(String[] args) {
        // Create an integer ArrayList
        ArrayList<Integer> number = new ArrayList<Integer>();

        // It's for generate 10 random number between 0 and 100 and add them in ArrayList
        for (int i = 0; i < 10; i++) {
            var rnum = (int) (Math.random()*100);
            number.add(rnum);
        }

        // It's for print all even number from ArrayList
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 == 0) {
                System.out.println(number.get(i));
            }
        }
    }
}