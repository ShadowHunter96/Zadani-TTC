import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;

import static java.lang.Math.abs;


public class Main {

    public static void main(String[] args) {
//        int pocetDelitelu = 0;
//        int number = 3;
//   if(number ==0 || number ==1){
//       System.out.println("number is not a prime");
//   }
//else if (number/number ==1){
//       pocetDelitelu ++;
//} else if (number/1 == number) {
//    pocetDelitelu ++;
//
//   } else if ( number%2 ==0) {
//    pocetDelitelu ++;
//
//   } else if (number%3==0) {
//       pocetDelitelu++;
//   }
//if (pocetDelitelu ==2){
//String Vysledek1 = String.format("%d is prime");
//System.out.println(Vysledek1);
//}
//if (pocetDelitelu>=3){
//    String Vysledek2 = String.format("%d is prime");
//    System.out.println(Vysledek2);
//}
//System.out.println(pocetDelitelu);







/*


        int numberThousand = number / 1000;
        System.out.println(numberThousand);
        int next_number = (number % (numberThousand * 1000));
        System.out.println(next_number);
        int number_hunderd = next_number / 100;
        int next_number_2 = next_number % (number_hunderd * 100);
        System.out.println(next_number_2);
        int number_tens = next_number_2 / 10;
        int next_number_3 = next_number_2 % (number_tens * 10);
        System.out.println(next_number_3);
        System.out.println();
        System.out.println(numberThousand);
        System.out.println(number_hunderd);
        System.out.println(number_tens);
        System.out.println(next_number_3);
        System.out.println("---------");
        System.out.println(numberThousand*numberThousand);
        System.out.println(number_hunderd*number_hunderd);
        System.out.println(number_tens*number_tens);
        System.out.println(next_number_3*next_number_3);
        System.out.println("---------");

       String final_string = Integer.toString(numberThousand*numberThousand) + Integer.toString(number_hunderd*number_hunderd) + Integer.toString(number_tens*number_tens) + Integer.toString(next_number_3*next_number_3);
       System.out.println(final_string);
       int finalNumber = Integer.parseInt(final_string);
       System.out.println(finalNumber);
*/

//
//        System.out.println("zadejte 1. cislo ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("zadejte  2. cislo ");
//        int b = sc.nextInt();
//
//        if (a==b){
//            System.out.println(a);
//        }
//         else if (a<b) {
//            int c = 0;
//            for (int i = a; i <= b; i++) {
//                c += i;
//                System.out.println(c);
//            }
//        }
//
//            else  {
//              int c = 0;
//                for (int i = b; i <= a; i++) {
//                    c += i;
//                    System.out.println(c);
//                }


//           Random rand = new Random();
//           Scanner sc = new Scanner(System.in);
//
//           int finalNumber = rand.nextInt(100) + 1;
//           while(true) {
//               System.out.println("Zadej cislo 1-100");
//           System.out.println(finalNumber);
//           int vstup = sc.nextInt();
//           if (vstup == finalNumber) {
//               System.out.println("correct");
//               break;
//           } else if (finalNumber > vstup) {
//               System.out.println("konecne cislo je vetsi nez tvuj guess");
//
//           } else if (finalNumber < vstup) {
//               System.out.println("konecne cislo je mensi nez tvuj guess");
//           }
//       }

//try {
//
//    File file1 = new File("data\\licha.txt");
//    File file2 = new File("data\\suda.txt");
//    File file3 = new File("data\\output.txt");
//
//    Path path3 = file3.toPath();
//
//    if (!file3.exists()){
//        System.out.println("file3 or output does not exists");
//    }
//
//
//
//
//    BufferedWriter bw = new BufferedWriter(new FileWriter(file3));
//    file3.getParentFile().mkdirs();
//    bw.write("neco");
//    bw.newLine();
//    bw.write("neco 2");
//    bw.flush();
//    System.out.println("zapsano do souboru");
//
//
//
//
//
//}catch(IOException e){
//    throw new RuntimeException(e);
//}
//
//
//

//        System.out.println("zadejte cislo");
//        int m = 0;
//        int flag = 0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        m = n / 2;
//        if (n<0){
//            System.out.println("not a prime number ");
//        }
//
//        else if (n == 0 || n == 1) {
//            System.out.print("not a prime number");
//
//        } else {
//            for (int i = 2; i <= m; i++) {
//                if (n % i == 0) {
//                    System.out.println(n + " is not a prime number");
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0){
//                System.out.println("is a prime number ");
//        }
//    }


//        int a = 7, b = 2, c = 2;
//
//
//        if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
//            System.out.print(true);
//        }
//        else {
//            System.out.println(false);
//        }

//        }
//        if ( (b+c) >a){
//            System.out.print(true);
//        }
//
//         if ( (a+ c) > b){
//            System.out.print(true);
//        }
//        else {
//            System.out.println(false);
//        }


//        int []array = {1,2,2,3,3,3,4,3,3,3,2,2,1};
//        for (int i =0;i <array.length-1;i++){
//           for(int j = i+1; j<array.length;j++){
//               if((array[i]==array[j]&& i!=j)){
//
//        String stringNumbers ="1 2 3 4 5";
//        String[] numbers = stringNumbers.split(" ");
//
//        int size = numbers.length;
//        int[]array = new int[size];
//        for (int i = 0;i < size; i++){
//            array[i]=Integer.parseInt(numbers[i]);
//
//        }


//        int min = Arrays.stream(array).min().getAsInt();
//        int max = Arrays.stream(array).max().getAsInt();
//        System.out.println(min);
//        System.out.println(max);

//        Arrays.sort(array);
//        int min = array[0];
//        int max = array[array.length-1];
//
//        System.out.println(min);
//        System.out.println(max);


//        Scanner sc = new Scanner(System.in);
//        int decimalNumber = sc.nextInt();
//        System.out.println((decimalNumber%100)/10);

//        for (int i =0; i< 10; i++){
//            System.out.print(i+" ");
//            if ((i%2)==0) continue;
//         System.out.println();
//        }


//        Akcie akcie = new Akcie("Cez", 1091,48);
//        akcie.nakup(100);
//        Akcie akcie1 = new Akcie("Moneta",84,7);
//        akcie1.nakup(1200);
//        Akcie akcie2 = new Akcie("Erste", 700,25);
//        akcie2.nakup(150);



//ArrayList<String> jmena = new ArrayList<>();
//        jmena.add("Karel");
//        jmena.add("Miroslav");
//        jmena.add("Petr");
//        jmena.add("Mirka");
//
//
//for (String jmeno :jmena ){
//    System.out.println(jmeno + "");
//}
//
//System.out.println(jmena.get(2));

        Map<String, String>slovnik = new HashMap<>();
        slovnik.put("cat", "kocka");
        slovnik.put("mouse", "mys");
        slovnik.put("computer", "pocitac");
        System.out.println("Zadej slovo ");
        Scanner sc = new Scanner(System.in);
        String slovo = sc.nextLine();
        if (slovnik.containsKey(slovo)){
            System.out.println("Preklad: " + slovnik.get(slovo) );

        }else {
            System.out.println("neni ve slovniku");
        }












}


    }
















