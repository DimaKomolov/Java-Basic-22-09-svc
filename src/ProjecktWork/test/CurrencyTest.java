
import org.example.Currency;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {
    @ParameterizedTest
    @MethodSource("testCorrectEndings")
    public void testGetEndingsRub(int amount, String expected) {
        Currency currency = Currency.RUB;
        String echul = currency.getEndings(amount);
        assertEquals(expected, echul);

    }

    private static @NotNull Stream<Arguments> testCorrectEndings() {
        return Stream.of(
                Arguments.of(1, "рубль"),
                Arguments.of(2, "рубля"),
                Arguments.of(3, "рубля"),
                Arguments.of(4, "рубля"),
                Arguments.of(5, "рублей"),
                Arguments.of(6, "рублей"),
                Arguments.of(7, "рублей"),
                Arguments.of(8, "рублей"),
                Arguments.of(9, "рублей"),
                Arguments.of(10, "рублей"),
                Arguments.of(11, "рублей"),
                Arguments.of(12, "рублей"),
                Arguments.of(13, "рублей"),
                Arguments.of(14, "рублей"),
                Arguments.of(15, "рублей"),
                Arguments.of(16, "рублей"),
                Arguments.of(17, "рублей"),
                Arguments.of(18, "рублей"),
                Arguments.of(19, "рублей"),
                Arguments.of(20, "рублей"),
                Arguments.of(21, "рубль"),
                Arguments.of(22, "рубля"),
                Arguments.of(23, "рубля"),
                Arguments.of(24, "рубля"),
                Arguments.of(25, "рублей"),
                Arguments.of(26, "рублей"),
                Arguments.of(27, "рублей"),
                Arguments.of(28, "рублей"),
                Arguments.of(29, "рублей"),
                Arguments.of(30, "рублей"),
                Arguments.of(121, "рубль"),
                Arguments.of(122, "рубля"),
                Arguments.of(125, "рублей"),
                Arguments.of(177, "рублей"),
                Arguments.of(1121, "рубль"),
                Arguments.of(4322, "рубля"),
                Arguments.of(7425, "рублей"),
                Arguments.of(9977, "рублей")

        );
    }
}
