import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    Calculator sut;

    @BeforeEach
    public void init() {
        System.out.println("Тест начат");
        sut = new Calculator();
    }

    @BeforeAll
    public static void started() {
        System.out.println("Тестирование начато");
    }

    @AfterEach
    public void finished() {
        System.out.println("Тест окончен");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Тестирование окончено");
    }

    @Test
    public void testPlus() {
        // given:
        int x = 1, y = 2, expected = 3;

        // when:
        int result = sut.plus.apply(x, y);

        // then:
        assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        // given:
        int x = 6, y = 4, expected = 2;

        // when:
        int result = sut.minus.apply(x, y);

        // then:
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        // given:
        int x = 4, y = 4, expected = 16;

        // when:
        int result = sut.multiply.apply(x, y);

        // then:
        assertEquals(expected, result);
    }

    @Test
    public void testDivide() {
        // given:
        int x = 500, y = 2, expected = 250;

        // when:
        int result = sut.divide.apply(x, y);

        // then:
        assertEquals(expected, result);
    }
}