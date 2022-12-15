import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vyberte akci:");
        System.out.println("1. nacteni souboru");
        System.out.println("2. nacteni ze vstupu");


        int volba = Integer.parseInt(sc.nextLine());
        switch (volba) {
            case 1:
                System.out.println("which file do you want to read ?");
                System.out.println("1 - odd");
                System.out.println("2 - even");
                int choice = sc.nextInt();
                if (choice == 1) {


                    File file1 = new File("data\\licha.txt");
                    File file2 = new File("data\\suda.txt");
                    File file3 = new File("data\\output.txt");

                    if (!file1.exists() || !file2.exists() || !file3.exists()) {
                        System.out.println("nelze nacist soubory");
                        System.exit(0);
                    }

                    try {
                        BufferedReader br1 = new BufferedReader(new FileReader(file1));
                        ArrayList<Integer> numbers = new ArrayList<Integer>();
                        BufferedWriter bw = new BufferedWriter(new FileWriter(file3));

                        String[] numbersString;
                        String line1 = br1.readLine();
                        numbersString = line1.split(",");
                        int numberOfValues = numbersString.length;
                        for (int i = 0; i < numberOfValues; i++) {
                            numbers.add(Integer.parseInt(numbersString[i]));
                        }

                        if (numbers.size() % 2 == 0) {
                            file3.getParentFile().mkdirs();
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 0) {
                                    System.out.print(numbers.get(i) + " ");
                                    bw.newLine();
                                    bw.write(numbers.get(i) + " ");
                                    bw.flush();
                                }
                            }


                        } else if (numbers.size() % 2 != 0) {
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 != 0) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }

                        }


                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                if (choice == 2) {
                    try {
                        File file2 = new File("data\\suda.txt");
                        BufferedReader br2 = new BufferedReader(new FileReader(file2));
                        ArrayList<Integer> numbers = new ArrayList<Integer>();

                        String[] numbersString;
                        String line1 = br2.readLine();
                        numbersString = line1.split(",");
                        int numberOfValues = numbersString.length;
                        for (int i = 0; i < numberOfValues; i++) {
                            numbers.add(Integer.parseInt(numbersString[i]));
                        }

                        if (numbers.size() % 2 == 0) {
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 0) {
                                    System.out.print(numbers.get(i));
                                }
                            }


                        } else if (numbers.size() % 2 != 0) {
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 != 0) {
                                    System.out.print(numbers.get(i));
                                }
                            }

                        }


                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;


                }
            case 2:
                try {
                    File file3 = new File("data\\output.txt");
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(file3));
                    System.out.println("zadejte cisla oddelene carkou");
                    String vstup = sc.nextLine();
                    String[] znamky = vstup.split(",");


                    if (znamky.length % 2 == 0) {
                        file3.getParentFile().mkdirs();
                        for (int i = 0; i < znamky.length; i++) {
                            if (Integer.parseInt(znamky[i]) % 2 == 0) {
                                System.out.println(znamky[i]);
                                bw2.write(znamky[i] + " ");
                            }
                        }
                        bw2.flush();

                    } else if (znamky.length % 2 != 0) {
                        for (int i = 0; i < znamky.length; i++) {
                            if (Integer.parseInt(znamky[i]) % 2 != 0) {
                                System.out.println(znamky[i]);
                                bw2.write(znamky[i] + " ");
                            }
                        }
                    }
                    break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


        }


//     File file1 = new File("data\\licha.txt");
//     File file2 = new File("data\\suda.txt");
//
//     if (!file1.exists()||!file2.exists()){
//         System.out.println("nelze nacist soubory");
//       System.exit(0);
//     }
//
//     try {
//         BufferedReader br1 = new BufferedReader(new FileReader(file1));
//         BufferedReader br2 = new BufferedReader(new FileReader(file2));
//         ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//
//          String[] numbersString;
//          String line1 = br1.readLine();
//          numbersString = line1.split(",");
//          int numberOfValues = numbersString.length;
//          for (int i = 0;i<numberOfValues;i++){
//              numbers.add(Integer.parseInt(numbersString[i]));
//          }
//
//          for (int number : numbers){
//               System.out.print(number + " ");
//          }
//          System.out.println();
//          if (numbers.size()%2 ==0){
//              System.out.println("sudy pocet");
//          }
//          else {
//              System.out.println("lichy pocet");
//          }
//
//
//
//
//
//
//
//     }catch (IOException e){
//         throw new RuntimeException(e);
//     }

    }
}