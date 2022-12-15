import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cezar111 {
    public static  String alfavit = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ,-.? :!";



    public static String line;
    public static int key;


    public static void main(String[] args) throws IOException {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name");
        String fileName = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("encrypt, decrypt or brute force");
        String otvet = scanner.nextLine();
        if (otvet.equalsIgnoreCase("encrypt")) {
            System.out.println("Enter the encryption key");
            key = scanner.nextInt();

            while ((line = reader.readLine()) != null) {

                stringBuilder.append(Contracenia.contrasenia(line, key));


           }
        } else if (otvet.equalsIgnoreCase("decrypt")) {
            System.out.println("Enter the decryption key");
            int decod = scanner.nextInt();
            while ((line = reader.readLine()) != null) {

                stringBuilder.append(Decoder.decoder(line, decod));

            }

        } else if (otvet.equalsIgnoreCase("brute force")) {

            while ((line = reader.readLine()) != null) {

                stringBuilder.append(BruteForce.decoder2());

            }
   }


        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter(new File("text2")));

            writer.write(stringBuilder.toString());
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}






