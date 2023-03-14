import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {


    private File input;
    private File output;

    private String[] args;

    private ArrayList<Integer> numbers;
    private ArrayList<Integer> filteredNumbers;

    // Constructor taking command line arguments
    public FileParser(String[] args) {
        this.args = args;
    }

    // Method to initialize parsing
    public boolean init() throws IOException {
        // Check number of arguments
        if (args.length > 2) {
            throw new IllegalArgumentException("This application doesn't support number of arguments: " + args.length);
        }

        // Two arguments: parse file and write to file
        if (2 == args.length) {
            parseTwoArguments();
            // One argument: either read from file or read from console
        } else if (1 == args.length) {
            parseOneArgument();
        } else {
            throw new IllegalArgumentException("Missing arguments");
        }

        return true;
    }

    // Method to parse two file arguments
    private void parseTwoArguments() throws IOException {

        input = new File(args[0]);
        output = new File(args[1]);

        if (!input.exists()) {
            throw new FileNotFoundException("Input file does not exist");
        }


        String line = readInputFileLine();
        numbers = fillNumbers(line);
        filteredNumbers = numbersFilter(numbers);
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(output));
        output.getParentFile().mkdirs();
        bw2.write(String.valueOf(filteredNumbers));
        bw2.flush();
        bw2.close();
        System.out.println("Parsing Complete!");

    }

    // Method to read a single line from an input file
    private String readInputFileLine() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));

            return reader.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // Method to parse input file into ArrayList of integers
    private ArrayList<Integer> fillNumbers(String line) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        String[] stringNumbers = line.split(",");

        for (int i = 0; i < stringNumbers.length; i++) {
            numbers.add(Integer.parseInt(stringNumbers[i]));
        }

        return numbers;
    }

    //filtering numbers if odd return array with odd, if even return array with even
    private ArrayList<Integer> numbersFilter(ArrayList<Integer> numbers) {
        ArrayList<Integer> filteredNumbers = new ArrayList<>();

        if (numbers.size() % 2 == 0) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    filteredNumbers.add(numbers.get(i));
                }
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0) {
                    filteredNumbers.add(numbers.get(i));
                }
            }
        }

        return filteredNumbers;
    }


    // Method to parse a single argument
    private void parseOneArgument() throws FileNotFoundException {

        try {

            // Try to parse argument as integer
            int num = Integer.parseInt(args[0]);
            System.out.println("Reading input from console...");

            // read the input from the console
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numbers and seperate them with comma");
            String consoleInput1 = sc.nextLine();
            System.out.println("Where do you want to write numbers into: \n 1: into console \n 2: into file");
            String consoleInput2 = sc.nextLine();

            String[] consoleNumbers = consoleInput1.split(",");

            //writing into console
            if (consoleInput2.equals("1")) {
                System.out.println(numbersFilter(fillNumbers(consoleInput1)));


            } else if (consoleInput2.equals("2")) {
                System.out.println("Enter pathname to outputFile");
                String pathName = sc.nextLine();
                File outputConsoleFile = new File(pathName);
                BufferedWriter bw1 = new BufferedWriter(new FileWriter(outputConsoleFile));

                outputConsoleFile.getParentFile().mkdirs();

                bw1.write(String.valueOf(numbersFilter(fillNumbers(consoleInput1))));
                bw1.flush();
                bw1.close();
                System.out.println("Writing into file was successful!");

            }


            //first argument is not Integer
        } catch (NumberFormatException e) {
            input = new File(args[0]);
            System.out.println("reading from file then printing in console...");
            if (!input.exists()) {
                System.out.println("System could not load the file from input argument");
            }
            String Line = readInputFileLine();
            System.out.println(Line);

        } catch (IOException e) {
            System.out.println("file not found!");
        }


    }

    private void readFromConsole() {

    }

    private void readFromFile() {

    }


}