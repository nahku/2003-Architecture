import junit.framework.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator4Test {
    @Test
    public void additionTest() throws Exception
    {
        Calculator4 instance = new Calculator4(3.2, 44.1, operand.PLUS);
        assertEquals(instance.getResult(), 47.3, 0.001);
        instance = new Calculator4(-3.2, 44.1, operand.PLUS);
        assertEquals(instance.getResult(), 40.9, 0.001);
        instance = new Calculator4(3.2, -44.1, operand.PLUS);
        assertEquals(instance.getResult(), -40.9, 0.001);
        instance = new Calculator4(-3.2, -44.1, operand.PLUS);
        assertEquals(instance.getResult(), -47.3, 0.001);

    }


    @Test
    public void subtractionTest() throws Exception
    {
        Calculator4 instance = new Calculator4(3.2, 44.1, operand.MINUS);
        assertEquals(instance.getResult(), -40.9, 0.001);
        instance = new Calculator4(-3.2, 44.1, operand.MINUS);
        assertEquals(instance.getResult(), -47.3, 0.001);
        instance = new Calculator4(3.2, -44.1, operand.MINUS);
        assertEquals(instance.getResult(), 47.3, 0.001);
        instance = new Calculator4(-3.2, -44.1, operand.MINUS);
        assertEquals(instance.getResult(), 40.9, 0.001);
    }

    @Test
    public void multiplicationTest() throws Exception
    {
        Calculator4 instance = new Calculator4(3.2, 44.1, operand.MULT);
        assertEquals(instance.getResult(), 141.12, 0.001);
        instance = new Calculator4(-3.2, 44.1, operand.MULT);
        assertEquals(instance.getResult(), -141.12, 0.001);
        instance = new Calculator4(3.2, -44.1, operand.MULT);
        assertEquals(instance.getResult(), -141.12, 0.001);
        instance = new Calculator4(-3.2, -44.1, operand.MULT);
        assertEquals(instance.getResult(), 141.12, 0.001);
    }

    @Test
    public void divisionTest() throws Exception
    {
        Calculator4 instance = new Calculator4(18.5, 2.0, operand.DIV);
        assertEquals(instance.getResult(), 9.25, 0.001);
        instance = new Calculator4(-18.5, 2.0, operand.DIV);
        assertEquals(instance.getResult(), -9.25, 0.001);
        instance = new Calculator4(18.5, -2.0, operand.DIV);
        assertEquals(instance.getResult(), -9.25, 0.001);
        instance = new Calculator4(-18.5, -2.0, operand.DIV);
        assertEquals(instance.getResult(), 9.25, 0.001);
        instance = new Calculator4(18.5, 0.0, operand.DIV);
        assertEquals(instance.getResult(), 0.0, 0.001);

    }
}