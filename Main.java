import java.util.logging.Logger;

import models.Calculator;
import models.LoggedCalculator;
import views.CalculatorView;

/**
 * Main
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
    
        CalculatorView calc = new CalculatorView(new LoggedCalculator(new Calculator(), LOGGER));
        calc.run();
    }
}