import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = args[0];
        boolean readFromConsole = false;


        if (args.length >= 2) {

            File inputArgumentFile = new File(args[0]);
            File outputArgumentFile = new File(args[1]);


            try {

                BufferedReader br1 = new BufferedReader(new FileReader(inputArgumentFile));
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputArgumentFile));

                String[] numbersString;
                String line1 = br1.readLine();
                numbersString = line1.split(",");
                int numberOfValues = numbersString.length;
                for (int i = 0; i < numberOfValues; i++) {
                    numbers.add(Integer.parseInt(numbersString[i]));
                }

                if (numbers.size() % 2 == 0) {
                    outputArgumentFile.getParentFile().mkdirs();
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0) {
                            System.out.print(numbers.get(i) + ",");
                            bw.write(numbers.get(i) + ",");
                            bw.flush();
                        }
                    }
                    bw.close();

                } else if (numbers.size() % 2 != 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0) {
                            System.out.print(numbers.get(i) + ",");
                            bw.write(numbers.get(i) + ",");
                            bw.flush();
                        }
                    }
                    bw.close();

                }

            } catch (IOException f) {
                throw new RuntimeException(f);
            }
        } else if (args.length == 1) {
            try {
                int num = Integer.parseInt(args[0]);
                System.out.println("Reading input from console...");
                readFromConsole = true;

                Scanner sc = new Scanner(System.in);
                System.out.println("zadejte cisla oddelene carkou");
                String consoleInput1 = sc.nextLine();
                System.out.println("Kam chcete čísla vypsat \n 1: do konzole \n 2: do souboru");
                String consoleInput2 = sc.nextLine();
                String[] consoleNumbers = consoleInput1.split(",");

                if (consoleInput2.equals("1")) {
                    if (consoleNumbers.length % 2 == 0) {
                        for (int i = 0; i < consoleNumbers.length; i++) {
                            if (Integer.parseInt(consoleNumbers[i]) % 2 == 0) {
                                System.out.print(consoleNumbers[i] + ",");
                            }

                        }
                    } else {
                        for (int i = 0; i < consoleNumbers.length; i++) {
                            if (Integer.parseInt(consoleNumbers[i]) % 2 == 0) {
                                System.out.print(consoleNumbers[i] + ",");
                            }
                        }
                    }
                } else if (consoleInput2.equals("2")) {
                    System.out.println("Zadejte cestu do vystupniho souboru");
                    String pathName = sc.nextLine();
                    File outputConsoleFile = new File(pathName);
                    BufferedWriter bw1 = new BufferedWriter(new FileWriter(outputConsoleFile));
                    outputConsoleFile.getParentFile().mkdirs();

                    if (consoleNumbers.length % 2 == 0) {
                        for (int i = 0; i < consoleNumbers.length; i++) {
                            if (Integer.parseInt(consoleNumbers[i]) % 2 == 0) {
                                System.out.println(consoleNumbers[i]);
                                bw1.write(consoleNumbers[i] + " ");
                            }
                        }
                        bw1.flush();

                    }
                } else {
                    for (int i = 0; i < consoleNumbers.length; i++) {
                        if (Integer.parseInt(consoleNumbers[i]) % 2 == 0) {
                            System.out.println(consoleNumbers[i]);
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                File inputfile1 = new File(inputFile);
                BufferedReader br2 = new BufferedReader(new FileReader(inputfile1));
                ArrayList<Integer> numbers = new ArrayList<Integer>();

                String[] numbersString2;
                String line1 = br2.readLine();
                numbersString2 = line1.split(",");
                int numberOfValues = numbersString2.length;
                for (int i = 0; i < numberOfValues; i++) {
                    numbers.add(Integer.parseInt(numbersString2[i]));
                }

                if (numbers.size() % 2 == 0) {

                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0) {
                            System.out.print(numbers.get(i) + " ");

                        }
                    }

                } else if (numbers.size() % 2 != 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }
            }
        }
    }
}

