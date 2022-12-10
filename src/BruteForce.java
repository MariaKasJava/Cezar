public class BruteForce {
    public static StringBuilder decoder1 (char a, int count ) {
        StringBuilder result1 = new StringBuilder();


            if (Cezar111.alfavit.indexOf(a)!= -1) {

                char newPosition = Cezar111.alfavit.charAt((Cezar111.alfavit.indexOf(a)-count + Cezar111.alfavit.length())% Cezar111.alfavit.length());

                result1.append(newPosition);
            } else {
                result1.append(a);
            }return result1;
        }

        public static void decoder2(){
            for (int i = 0; i <= Cezar111.alfavit.length();i++){
                for (int j =0; j< Cezar111.line.length();j++){

                    System.out.print( decoder1((Cezar111.line.charAt(j)),i));
                }
            System.out.println();
        }

}}


