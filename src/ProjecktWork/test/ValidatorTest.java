import org.example.*;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatorTest {
    @ParameterizedTest
    @MethodSource("testCorrectInput")
    public void testInputStringValidator(String value, boolean expected) {
        InputStringValidator inputStringValidator = new InputStringValidator();
        String[] strings = value.split(" ");
        boolean result = inputStringValidator.validate(strings);
        assertEquals(expected, result);


    }

    private static @NotNull Stream<Arguments> testCorrectInput() {
        return Stream.of(
                Arguments.of("1 RUB", true),
                Arguments.of("1RUB", false),
                Arguments.of("1", false),
                Arguments.of("RUB", false),
                Arguments.of("1 USD", true),
                Arguments.of("1", false),
                Arguments.of("USD", false),
                Arguments.of("1USD", false)

        );
    }

    @ParameterizedTest
    @MethodSource("testMaxValue")
    public void testValidatorMaxValue(int value, boolean expected) {
        MaxValueValidator maxValueValidator = new MaxValueValidator(10_000);
        boolean result = maxValueValidator.validate(value);
        assertEquals(expected, result);
    }

    private static @NotNull Stream<Arguments> testMaxValue() {
        return Stream.of(
                Arguments.of(9_999, true),
                Arguments.of(10_000, true),
                Arguments.of(10_001, false),
                Arguments.of(11_000, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testMinValue")
    public void testValidatorMinValue(int value, boolean expected) {
        MinValueValidator minValueValidator = new MinValueValidator(1);
        boolean result = minValueValidator.validate(value);
        assertEquals(expected, result);
    }

    private static @NotNull Stream<Arguments> testMinValue() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(2, true),
                Arguments.of(-1, false),
                Arguments.of(-763, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCurrency")
    public void testCurrencyValidator(String value, boolean expected) {
        CurrencyValidator currencyValidator = new CurrencyValidator();
        boolean result = currencyValidator.validate(value);
        assertEquals(expected, result);
    }

    private static @NotNull Stream<Arguments> testCurrency() {
        return Stream.of(
                Arguments.of("RUB", true),
                Arguments.of("USD", true),
                Arguments.of("rub", false),
                Arguments.of("usd", false),
                Arguments.of("РУБ", false),
                Arguments.of("ЮСД", false),
                Arguments.of("руб", false),
                Arguments.of("юсд", false),
                Arguments.of("R U B", false),
                Arguments.of("U S D", false)
        );
    }
}