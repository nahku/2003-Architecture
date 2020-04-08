//@author MatrikelNr: 6430174
public class Calculator2 implements ICalculator{

    private double result;

    public Calculator2 (double first_value, double sec_value, operand operand)
    {
        if (operand == operand.PLUS){
            result = first_value + sec_value;
        }
        else if (operand == operand.MINUS){
            result = first_value - sec_value;
        }
        else if (operand == operand.MULT){
            result = first_value * sec_value;
        }
        else if (operand == operand.DIV) {
            result = first_value / sec_value;
        }
    }

    public double getResult() {
        return result;
    }
}
