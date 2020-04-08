//@author: Matrikel-Nr.: 8540946
import static org.junit.jupiter.api.Assertions.*;

class Calculator1Test {

    //Addition Tests
    @org.junit.jupiter.api.Test
    public void additionSimpleTest() throws Exception
    {
        Calculator1 caluclator = new Calculator1(1.1, 1.1, operand.PLUS);
        assertEquals(2.2, caluclator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void additionZeroTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(5.5, -5.5, operand.PLUS);
        assertEquals(0, calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void additionNegativeTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(-10.2, -4.5, operand.PLUS);
        assertEquals(-14.7, calculator.getResult());
    }

    //Subtraction Tests
    @org.junit.jupiter.api.Test
    public void subtractionSimpleTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(200.7, 50.2, operand.MINUS);
        assertEquals(150.5, calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void subtractionZeroTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(386, 386, operand.MINUS);
        assertEquals(0, calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void subtractionDoubleMinusTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(374, -200, operand.MINUS);
        assertEquals(574, calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void subtractionNegativeTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(20.4, 50, operand.MINUS);
        assertEquals(-29.6,calculator.getResult());
    }

    //Mulitply Tests
    @org.junit.jupiter.api.Test
    public void multiplySimpleTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(3.5, 20, operand.MULT);
        assertEquals(70,calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void mulitplyByZeroTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(357.34, 0, operand.MULT);
        assertEquals(0,calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void mulitplyNegativeTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(34.23, -2, operand.MULT);
        assertEquals(-68.46,calculator.getResult());
    }

    //Divide Tests
    @org.junit.jupiter.api.Test
    public void divideSimpleTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(10, 2, operand.DIV);
        assertEquals(5,calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    public void divideNegativeTest() throws Exception
    {
        Calculator1 calculator = new Calculator1(15, -3, operand.DIV);
        assertEquals(-5,calculator.getResult());
    }
}