import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.addNumbers(2, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(4, calculator.subtractNumbers(8, 4));
    }

    @Test
    public void canMultiply() {
        assertEquals(4, calculator.multiplyNumbers(2, 2));
    }

    @Test
    public void canDivide() {
        assertEquals(4.00, calculator.divideNumbers(8.00, 2.00), 0.00);
    }

}
