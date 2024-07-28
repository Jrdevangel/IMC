package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double imc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height (m): ");
        double height= scanner.nextDouble();
        System.out.println("Write down your weight (kg): ");
        double weight = scanner.nextDouble();
        scanner.close();
        imc = weight / Math.pow(height,2);
        System.out.println("Based on your IMC that is from " + Math.round(imc * 100) / 100d + ", we can see that you are in your category of:");

        if (imc < 16) {
            System.out.println("Severe thinness.");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Moderate thinness.");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Slight thinness.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Normal weight.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Excess weight.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Mild obesity.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Mild obesity.");
        } else if (imc >= 40) {
            System.out.println("Morbid obesity.");
        }
    }
}
