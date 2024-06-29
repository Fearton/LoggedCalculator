package models;

import java.util.logging.Logger;

import interfaces.Calculable;

public class LoggedCalculator implements Calculable {

    private Logger logger;
    private Calculable calculable;
    private ComplexNumbers result;

    public LoggedCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
    }

    @Override
    public ComplexNumbers addition(ComplexNumbers a, ComplexNumbers b) {
        result = calculable.addition(a, b);
        logger.info("Выполнено сложение: " + a + " + " + b + " = " + result);
        return result;
    }

    @Override
public ComplexNumbers subtraction(ComplexNumbers a, ComplexNumbers b) {
    result = calculable.subtraction(a, b);
    logger.info("Выполнено вычитание: " + a + " - " + b + " = " + result);
    return result;
}

@Override
public ComplexNumbers multiplication(ComplexNumbers a, ComplexNumbers b) {
    result = calculable.multiplication(a, b);
    logger.info("Выполнено умножение: " + a + " * " + b + " = " + result);
    return result;
}

@Override
public ComplexNumbers division(ComplexNumbers a, ComplexNumbers b) {
    result = calculable.division(a, b);
    logger.info("Выполнено деление: " + a + " / " + b + " = " + result);
    return result;
}
    
}
