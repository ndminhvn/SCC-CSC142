package conversion;
import java.util.Scanner;

public class ConversionCalculator {
    Scanner sc = new Scanner(System.in);

    public void convertWeightInKg() {
        System.out.print("Enter a person weight in pounds (lbs): ");
        double weightInPound = sc.nextDouble();
        System.out.println("The weight in kilograms (kg) is: " + (weightInPound * 0.454));
    }
    public void convertHeightInCm() {
        System.out.print("Enter a person height in feet (ft): ");
        double heightInFt = sc.nextDouble();
        System.out.println("The height in centimeters (cm) is: " + (heightInFt * 30.48));
    }
    public static void main(String[] args) {
        //TODO: write a program to convert (lbs, ft) to (kg, cm)
        System.out.println();
        ConversionCalculator a = new ConversionCalculator();
        a.convertWeightInKg();
        a.convertHeightInCm();
    }
}
