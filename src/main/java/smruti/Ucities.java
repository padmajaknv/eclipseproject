package smruti;

import java.util.ArrayList;

public class Ucities {
    ArrayList<String> getUniqueCities(String data) {
        String[] cities = data.split(",");
        ArrayList<String> unique = new ArrayList<>();

        for (String city : cities) {
            city = city.trim();
            boolean exists = false;
            for (String u : unique) {
                if (u.equalsIgnoreCase(city)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) unique.add(city);
        }
        return unique;
    }

    public static void main(String[] args) {
        Ucities obj = new Ucities();
        String input = "Pune,Hyderabad,puNE, Chennai,hyDERabad,mumBAi,cheNNAI";
        ArrayList<String> result = obj.getUniqueCities(input);

        for (String city : result) {
            System.out.println(city);
        }
    }
}

