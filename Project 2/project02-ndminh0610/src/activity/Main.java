package activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        File inputFile         = new File("data\\input.txt");
        Scanner input          = new Scanner(inputFile);

        if (inputFile.exists()) {
            while (input.hasNext()) {
                list.add(input.nextLine());
            }
        }

        filter(list);
        order(list);
        input.close();
    }
    public static void filter(ArrayList<String> list) throws FileNotFoundException {
        File outputFileBlue    = new File("data\\blue_output.txt");
        File outputFileRed     = new File("data\\red_output.txt");
        PrintStream outputBlue = new PrintStream(outputFileBlue);
        PrintStream outputRed  = new PrintStream(outputFileRed);

        for (String word : list) {
            if (word.contains("blue") || word.contains("Blue")) {
                outputBlue.println(word);
            }
            if (word.contains("red") || word.contains("Red")) {
                outputRed.println(word);
            }
        }
        outputBlue.close();
        outputRed.close();
    }
    public static void order(ArrayList<String> list) throws FileNotFoundException {
        File outputFile = new File("data\\output.txt");
        PrintStream output = new PrintStream(outputFile);

        Collections.sort(list);
        for (String word : list) {
            output.println(word);
        }
        output.close();
    }
}
