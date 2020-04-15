//@author MatrikelNr: 6274958
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Calculator3Test {

    @Test
    public void testPlus() {
        Calculator3 calculator = new Calculator3(3, 1.5,  operand.PLUS); //Test for Calculator3
        assertEquals(4.5, calculator.getResult());
        Calculator3 calculator2 = new Calculator3(-1, 4,  operand.PLUS); //Test for Calculator3
        assertEquals(3, calculator2.getResult());
    }
    @Test
    public void testMinus(){
        Calculator3 calculator = new Calculator3(3, 1.5,  operand.MINUS); //Test for Calculator3
        assertEquals(1.5, calculator.getResult());
        Calculator3 calculator2 = new Calculator3(-1, 4,  operand.MINUS); //Test for Calculator3
        assertEquals(-5, calculator2.getResult());
    }
    @Test
    public void testMult(){
        Calculator3 calculator = new Calculator3(3, 1.5,  operand.MULT); //Test for Calculator3
        assertEquals(4.5, calculator.getResult());
        Calculator3 calculator2 = new Calculator3(-1, 4,  operand.MULT); //Test for Calculator3
        assertEquals(-4, calculator2.getResult());
    }
    @Test
    public void testDiv(){
        Calculator3 calculator = new Calculator3(3, 1.5,  operand.DIV); //Test for Calculator3
        assertEquals(2, calculator.getResult());
        Calculator3 calculator2 = new Calculator3(-1, 4,  operand.DIV); //Test for Calculator3
        assertEquals(-0.25, calculator2.getResult());
    }
}