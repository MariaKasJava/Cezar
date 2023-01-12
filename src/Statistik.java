import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//code looks better if it is corrected via ctrl alt L combination
public class Statistik {
    public static Map<Character, Double> mapSimbol1 = new HashMap<>();

    public static Object decoder3() {

        Cezar111.line.toLowerCase(); //result of toLowerCase ignored

        for (char char1 : Cezar111.line.toCharArray()) {
            if (Character.isLetter(char1) && Character.isLowerCase(char1)) {
                if (mapSimbol1.containsKey(char1)) {

                    mapSimbol1.put(char1, (mapSimbol1.get(char1) + 1.0 * 100 / Cezar111.line.length()));
                } else {
                    mapSimbol1.put(char1, 1.0 * 100 / Cezar111.line.length());
                }


            }
        }
        return mapSimbol1;
    }


    public static StringBuilder key() {
        decoder3();
        StringBuilder result1 = new StringBuilder();
        Map<Character, Double> mapSimbol = mapSimbol1.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (int key : mapSimbol.keySet()) {
            for (double frec : mapSimbol.values()) {
                if (frec >= 9) {
                    int res = key - 'о';

                    char[] chars = Cezar111.line.toCharArray();


                    for (int j = 0; j < chars.length; j++) {

                        if (Cezar111.alfavit.indexOf(chars[j]) != -1) {

                            char newPosition = Cezar111.alfavit.charAt((Cezar111.alfavit.indexOf(chars[j]) - res + Cezar111.alfavit.length()) % Cezar111.alfavit.length());

                            result1.append(newPosition);
                        } else {
                            result1.append(chars[j]);
                        }
                    }


                }
            }

        }
        return result1;
    }
}

