import java.util.ArrayList;
import java.util.List;

//code looks better if it is corrected via ctrl alt L combination
public class BruteForce {
    public static String[] words = {" пока ", " где ", " когда ", " зачем ", " поэтому ", " на ", " через ", " пока ", " как ", " иногда ", " много ", " почему ", " что ", " и ", " она ", " он "};//more java way

    public static void decoder1() {

        char[] chars = Cezar111.line.toCharArray();//incorrect way, right would be to Cezar111.someMethod() in which line.toCharArray();
        for (int i = 0; i < Cezar111.alfavit.length(); i++) {//same as previous
            StringBuilder result1 = new StringBuilder();

            for (int j = 0; j < chars.length; j++) {

                if (Cezar111.alfavit.indexOf(chars[j]) != -1) {
                    char newPosition = Cezar111.alfavit.charAt((Cezar111.alfavit.indexOf(chars[j]) - i + Cezar111.alfavit.length()) % Cezar111.alfavit.length());

                    result1.append(newPosition);
                } else {
                    result1.append(chars[j]);
                }
            }
            list.add(result1.toString());

        }

    }

    private static List<String> list = new ArrayList<>();

    public static String decoder2() {
        decoder1();

        for (String text : list) {
            for (String word : words) {
                if (text.contains(word)) {

                    return text;

                }
            }
        }
        return null;


    }
}
