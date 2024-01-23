import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
/**
 * Pruebas de Junit
 */
public class HDT2 {
    @Test
    public void testPush(){
        CustomStack<Integer> s = new CustomStack<>();
        Calculadora c = new Calculadora();
        c.addNumber(s, 10);
        assertEquals(10, s.pop());
    }

    @Test
    public void testSuma() {
        CustomStack<Integer> s = new CustomStack<>();
        Calculadora c = new Calculadora();
        c.addNumber(s, 2);
        c.addNumber(s, 3);
        c.suma(s);
        assertEquals(5, s.pop());
    }

    @Test
    public void testDivision() {
        CustomStack<Integer> s = new CustomStack<>();
        Calculadora c = new Calculadora();
        c.addNumber(s, 2);
        c.addNumber(s, 6);
        c.division(s);
        assertEquals(3, s.pop());

    }
}
