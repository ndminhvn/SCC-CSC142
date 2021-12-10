package conversion;
import java.util.Scanner;

public class CoinCalculator {
    Scanner sc = new Scanner(System.in);

    public void coinCalculator() {
        System.out.print("Enter a monetary value in dollars: $");
        double value = sc.nextDouble();
        int intValue = (int) (value * 100);

        int numQuarters = intValue / 25;
        int numDimes = (intValue % 25) / 10;
        int numNickels = (intValue % 25 % 10) / 5;
        int numPennies = intValue % 25 % 10 % 5;

        System.out.print("The smallest amount of quarters, dimes, nickels and pennies: ");
        System.out.print(numQuarters + " quarters, ");
        System.out.print(numDimes + " dimes, ");
        System.out.print(numNickels + " nickels, ");
        System.out.print(numPennies + " pennies.");
    }
    public static void main(String[] args) {
        //TODO: write a program to convert value into number of coins
        System.out.println();
        CoinCalculator coin = new CoinCalculator();
        coin.coinCalculator();
    }
}
