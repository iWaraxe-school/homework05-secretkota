package Exercise5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create hashmap with key in type String value in type hasmap
        HashMap<String, HashMap<String, String>> country = new HashMap<>();

        // create hashmap about countries
        HashMap<String, String> moscow = new HashMap<>();
        moscow.put("Capital", "Moscow");
        moscow.put("Population", "14.000.000");
        HashMap<String, String> washington = new HashMap<>();
        washington.put("Capital", "Washington");
        washington.put("Population", "34.000.000");
        HashMap<String, String> berlin = new HashMap<>();
        berlin.put("Capital", "Berlin");
        berlin.put("Population", "23.000.000");

        // made put in my head hashmap Country
        country.put("Russia", moscow);
        country.put("USA", washington);
        country.put("Germany", berlin);

        // print all my hashmap in format: country country capital country population
        for(String countryName : country.keySet()) {
            System.out.println("Country name: " + countryName);
            HashMap<String, String> countryData = country.get(countryName);
            System.out.println("Country Capital: " + countryData.get("Capital"));
            System.out.println("Country Population: " + countryData.get("Population") + " mil. People");
        };


    }
}
