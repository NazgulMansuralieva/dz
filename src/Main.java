import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder stringBuilder=new StringBuilder();
        int a=97;
        int b=1;
        for (int i = 65; i <=90 ; i++) {
            stringBuilder.append(b+ " : ").append((char)i+" ").append((char)a).append("\n");
        b++;
        }

        for (int i = 48; i <=57 ; i++) {
            stringBuilder.append(b+" : ").append((char)i).append("\n");
        b++;}
//         System.out.println(stringBuilder);

        try (FileWriter fileWriter = new FileWriter("java.txt")) {
            fileWriter.write(String.valueOf(stringBuilder));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileReader fileReader=new FileReader("java.txt");
        Scanner scanner=new Scanner(fileReader);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }

}