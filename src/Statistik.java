import java.util.HashMap;
import java.util.Map;

public class Statistik {
    public  static Map<Character, Double> mapSimbol1 = new HashMap<>();

 public  static Object decoder3 () {

     Cezar111.line.toLowerCase();

     for (char char1 : Cezar111.line.toCharArray()) {
         if (Character.isLetter(char1) && Character.isLowerCase(char1)) {
             if (mapSimbol1.containsKey(char1)) {

                 mapSimbol1.put(char1, (mapSimbol1.get(char1) + 1.0 * 100 / Cezar111.line.length()));
             } else {
                 mapSimbol1.put(char1, 1.0 * 100 / Cezar111.line.length());
             }
             mapSimbol1.entrySet().stream()
                     .sorted(Map.Entry.<Character, Double>comparingByValue().reversed());

         }
     } return mapSimbol1;
 }



 public  static int key (){
     decoder3();

     for(int key: mapSimbol1.keySet()){
          for (double frec: mapSimbol1.values()){
              if (frec>=9) {
                  int res = key - 'о';
                  return res;
              }
          }
     }
     return 0;
 }

    public static StringBuilder decoder4 () {

    key();

        char[] chars = Cezar111.line.toCharArray();

            StringBuilder result1 = new StringBuilder();

            for (int j = 0; j <chars.length;j++){

                if (Cezar111.alfavit.indexOf(chars[j])!=-1) {

                    char newPosition = Cezar111.alfavit.charAt((Cezar111.alfavit.indexOf(chars[j])-key() + Cezar111.alfavit.length())% Cezar111.alfavit.length());

                    result1.append(newPosition);
                } else {
                    result1.append(chars[j]);
                }
            }
           return result1;

        }
       }
