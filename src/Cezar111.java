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
        System.out.println("Введте имя файла");
        String fileName = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("шифровать , разшифровать или brute force");
        String otvet = scanner.nextLine();
        if (otvet.equalsIgnoreCase("шифровать")) {
            System.out.println("Введте ключ щифра");
            key = scanner.nextInt();

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder = Contracenia.contrasenia(line, key);

           }
        } else if (otvet.equalsIgnoreCase("разшифровать")) {
            System.out.println("Введте ключ дещифровки");
            int decod = scanner.nextInt();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder = Decoder.decoder(line, decod);

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






