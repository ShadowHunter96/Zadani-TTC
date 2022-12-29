import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cisla = new ArrayList<Integer>();
        File file1 = new File("data\\licha.txt");
        File file2 = new File("data\\suda.txt");
        File file3 = new File("data\\output.txt");

        if (!file1.exists() || !file2.exists()||!file3.exists()) {
            System.out.println("Nepodarilo se najit prislusne soubory, try harder next time bitch");
            System.exit(0);
        }

//        Scanner sd = new Scanner(file1);
//        System.out.println(sd.nextLine());
//
//
//        int cislo = Integer.parseInt(sc.nextLine());
//
//        int volba = 0;
//
//        while (volba != 4) {
//            System.out.println("1 - Přidat nove číslo");
//            System.out.println("2 - Vypis cisla dle souctu hodnot");
//            System.out.println("3 - Přidej čísla do listu čísel");
//            System.out.println("4 - konec");
//
//            System.out.println("Zadej volbu: ");
//
//
//        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        try {
            String[] numbersString;
            BufferedWriter Br = new BufferedWriter(new FileWriter(file3));
            String line = bufferedReader.readLine();
            numbersString = line.split(",");

            int numberOfValues = numbersString.length;
            for (int i = 0; i < numberOfValues; i++) {
                numbers.add(Integer.parseInt(numbersString[i]));
            }

            boolean printOddNumbers = isOdd(numberOfValues);

            Iterator<Integer> iterator = numbers.iterator();

            String outputNumbers = "";
            while (iterator.hasNext()) {
                int value = iterator.next();

                if (printOddNumbers) {
                    if (isOdd(value)) {
                        outputNumbers += Integer.toString(value) + ", ";
                    }
                } else {
                    if (!isOdd(value)) {
                        outputNumbers += Integer.toString(value) + ", ";
                    }
                }
            }

            System.out.println(outputNumbers);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}