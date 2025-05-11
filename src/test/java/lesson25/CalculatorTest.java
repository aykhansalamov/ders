package lesson25;

import org.example.lesson25.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

//    @Test
//void testAdd() {
//
//        Calculator calculator = new Calculator();
//
//        assertEquals("a + b", calculator.add(2, 3));
//    }

    @Test
    void testAdd() {

        Calculator calculator = new Calculator();

        // Mocking - moklama
        int a = 2;
        int b = 3;

        //running - ishletme
        int c = calculator.add(a, b);

        //assertion - yoxlama
        assertEquals(3, c);
    }
}
