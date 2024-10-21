package Exercise2;

import java.util.HashSet;

/**
 * Here I use HashSet and add in hashSet 6 books
 * and made duplicate books
 */
public class Main {
    /**
     * In method, I create HashSet books, and add from hashset 6 books
     * and made duplicate books
     * @param args no used
     */
    public static void main(String[] args) {
        // Create hashset books
        HashSet<String> books = new HashSet<>();

        // Add in hashset 6 books, and make duplicate
        books.add("Ruslan and Ludmila");
        books.add("Harry Potter");
        books.add("Doctor Statham");
        books.add("Ruslan and Ludmila");
        books.add("Harry Potter");
        books.add("Raskolnicov");

        // Print my HashSet and see result: [Harry Potter, Ruslan and Ludmila, Doctor Statham]
        System.out.println(books);
    }
}
