public class Decoder {



    public static StringBuilder decoder(String a, int count) {
        StringBuilder result1 = new StringBuilder();
        for (char char1 : a.toCharArray()) {

            if (Cezar111.alfavit.indexOf(char1) != -1) {

                char newPosition = Cezar111.alfavit.charAt((Cezar111.alfavit.indexOf(char1) - count + Cezar111.alfavit.length()) % Cezar111.alfavit.length());

                result1.append(newPosition);
            } else {
                result1.append(char1);
            }
        }
        return result1;
    }

}