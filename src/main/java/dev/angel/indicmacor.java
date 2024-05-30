package imc;

import java.util.Scanner;

public class indicmacor {
    public static void main(String[] args) {
        System.out.println("Write your weight (kg): ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your height (m): ");
        int imc = scanner.nextInt();

        if (imc < 16) {
            System.out.println("Severe thinness");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Moderate thinness");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Slight thinness");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Normal weight");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Excess weight");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Mild obesity");
        } else if(imc >= 35 && imc < 40) {
            System.out.println("Moderate obesity");
        } else if (imc >= 40) {
            System.out.println("Morbid obesity");
        } scanner.close();
    }
}