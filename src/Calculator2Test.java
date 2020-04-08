//@author MatrikelNr: 6430174
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Calculator2Test {

    @Test
    public void testAdd() {
        Calculator2 calculator = new Calculator2(1.45, 4.6,  operand.PLUS); // Calculator2 is tested
        assertEquals(6.05, calculator.getResult());
        Calculator2 calculator2 = new Calculator2(-1.7, 3,  operand.PLUS); // Calculator2 is tested
        assertEquals(1.3, calculator2.getResult());
    }
    @Test
    public void testSubtract(){
        Calculator2 calculator = new Calculator2(1.45, 0.45,  operand.MINUS); // Calculator2 is tested
        assertEquals(1, calculator.getResult());
        Calculator2 calculator2 = new Calculator2(1.7, -3,  operand.MINUS); // Calculator2 is tested
        assertEquals(4.7, calculator2.getResult());
    }
    @Test
    public void testMultiply(){
        Calculator2 calculator = new Calculator2(1, 4.6,  operand.MULT); // Calculator2 is tested
        assertEquals(4.6, calculator.getResult());
        Calculator2 calculator2 = new Calculator2(0, 3,  operand.MULT); // Calculator2 is tested
        assertEquals(0, calculator2.getResult());
    }
    @Test
    public void testDivide(){
        Calculator2 calculator = new Calculator2(2.6, 2,  operand.DIV); // Calculator2 is tested
        assertEquals(1.3, calculator.getResult());
        Calculator2 calculator2 = new Calculator2(-1.5, 3,  operand.DIV); // Calculator2 is tested
        assertEquals(-0.5, calculator2.getResult());
    }
}