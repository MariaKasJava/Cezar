//code looks better if it is corrected via ctrl alt L combination
public class Contracenia {


    public static StringBuilder contrasenia(String a, int count) {
        StringBuilder result = new StringBuilder();
        for (char char1 : a.toCharArray()) {
            if (Cezar111.alfavit.indexOf(char1) != -1) {

                char newPosition = Cezar111.alfavit.charAt((Cezar111.alfavit.indexOf(char1) + count) % Cezar111.alfavit.length());

                result.append(newPosition);
            } else {
                result.append(char1);
            }
        }
        return result;
    }
}
