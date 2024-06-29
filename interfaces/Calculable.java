package interfaces;

import models.ComplexNumbers;

/**
 * Calculable
 */
public interface Calculable {

    ComplexNumbers addition(ComplexNumbers a, ComplexNumbers b);
    ComplexNumbers subtraction(ComplexNumbers a, ComplexNumbers b);
    ComplexNumbers multiplication(ComplexNumbers a, ComplexNumbers b);
    ComplexNumbers division(ComplexNumbers a, ComplexNumbers b);
    
}