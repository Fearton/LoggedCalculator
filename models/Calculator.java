package models;

import interfaces.Calculable;

public class Calculator implements Calculable {

    private ComplexNumbers result =new ComplexNumbers(0d, 0d);

    
    @Override
    public ComplexNumbers addition(ComplexNumbers a, ComplexNumbers b) {
        result.real = a.real + b.real;
        result.imaginary = a.imaginary + b.imaginary;
        return result;
    }

    @Override
    public ComplexNumbers subtraction(ComplexNumbers a, ComplexNumbers b) {
        result.real = a.real - b.real;
        result.imaginary = a.imaginary - b.imaginary;
        return result;
    }

    @Override
    public ComplexNumbers multiplication(ComplexNumbers a, ComplexNumbers b) {
        result.real = a.real * b.real - a.imaginary * b.imaginary;
        result.imaginary = a.real * b.imaginary + a.imaginary * b.real;
        return result;
    }

    @Override
    public ComplexNumbers division(ComplexNumbers a, ComplexNumbers b) {
        result.real = (a.real * b.real + a.imaginary * b.imaginary) / (b.real * b.real + b.imaginary * b.imaginary);
        result.imaginary = (a.imaginary * b.real - a.real * b.imaginary) / (b.real * b.real + b.imaginary * b.imaginary);
        return result;
    }

    public ComplexNumbers getResult() {
        return result;
    }
}
