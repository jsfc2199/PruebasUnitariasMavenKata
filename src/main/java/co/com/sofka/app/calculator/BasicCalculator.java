package co.com.sofka.app.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long subtract(Long number1, Long number2) {
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multy {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        logger.info( "Div {} / {}", number1, number2 );
        if(number2==0){
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }
}
