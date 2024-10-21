package Exercise3;

import java.util.HashMap;

/**
 * In the class I create a HashMap where I write a key and value
 * then I print all student who have grades >= 90
 */
public class Main {
    /**
     * In method, I made a hashmap where I write some student
     * then I print all student who have grades >= 90
     * @param args no used in method
     */
    public static void main(String[] args) {
        // create HashMap school with type string from name, integer from grades
        HashMap<String, Integer> school = new HashMap<>();
        // made put in hashmap some student
        school.put("Ivan", 90);
        school.put("Anna", 85);
        school.put("Valera", 90);
        school.put("Igor", 190);
        school.put("Maxim", 2);
        school.put("Genadi", 6);

        // print all student who have grades >= 90 in format: name: grades
        for (String student : school.keySet()) {
            if (school.get(student) >= 90) {
                System.out.println(student + " " + school.get(student));
            }
        }
    }
}
