package models;

public class ComplexNumbers {
    public double real;
    public double imaginary;

    public ComplexNumbers(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)", real,imaginary);
    }
}
