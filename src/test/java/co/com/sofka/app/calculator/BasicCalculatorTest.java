package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class BasicCalculatorTest {

    BasicCalculator basicCalculator = new BasicCalculator();

    //suma
    @Test
    @DisplayName("Testing sum: 1+1=2")
    void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }


    //multiples pruebas con CsvSource
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    //resta
    @Test
    @DisplayName("Testing sum: 1-1=0")
    void resta() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subs")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "11,    2,   9",
            "51,  50, 1",
            "1,  100, -99"
    })
    public void severalSubs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    //Mult
    @Test
    @DisplayName("Testing sum: 1*1=1")
    void mult() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several mults")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "11,    2,   22",
            "51,  50, 2550",
            "1,  100, 100"
    })
    public void severalMult(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    //Div
    @Test
    @DisplayName("Testing sum: 1/1=1")
    void div() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 0L;


        // Assert
        assertThrows(ArithmeticException.class, () -> basicCalculator.div(number1, number2));
    }

    @DisplayName("Testing several mults")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "10,    2,   5",
            "25,  5, 5",
            "100,  4, 25"
    })
    public void severalDivs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}