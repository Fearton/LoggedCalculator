package views;

import java.util.Scanner;

import interfaces.Calculable;
import models.ComplexNumbers;

public class CalculatorView {

    private Calculable calculator;


    public CalculatorView(Calculable calculator) {
        this.calculator = calculator;
    }

    public void run() {

        while (true) {
            System.out.println("Choose operation: +, -, *, /, exit");
            switch (getOperationFromUser()) {
                case "+" -> calculator.addition(getNumberFromUser(), getNumberFromUser());
                case "-" -> calculator.subtraction(getNumberFromUser(), getNumberFromUser());
                case "*" -> calculator.multiplication(getNumberFromUser(), getNumberFromUser());
                case "/" -> calculator.division(getNumberFromUser(), getNumberFromUser());
                case "exit" -> System.exit(0);
                default -> System.out.println("Wrong operation!");
            }
        }

    }

    public ComplexNumbers getNumberFromUser() {
        Scanner numb = new Scanner(System.in);
        System.out.println("Input complex number");
        System.out.println("real: ");
        double real = numb.nextDouble();
        System.out.println("imaginary: ");
        double imaginary = numb.nextDouble();
        return new ComplexNumbers(real, imaginary);
    }

    public String getOperationFromUser() {
        Scanner operation = new Scanner(System.in);
        System.out.println("Choose operation: ");
        return operation.nextLine();
    }
}
