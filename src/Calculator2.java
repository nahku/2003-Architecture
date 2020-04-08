//@author MatrikelNr: 6430174

public class Calculator2 implements ICalculator{

    private double result;

    public Calculator2 (double first_number, double sec_number, operand operand)
    {
        if (operand == operand.PLUS){
            result = first_number + sec_number;
        }
        else if (operand == operand.MINUS){
            result = first_number - sec_number;
        }
        else if (operand == operand.MULT){
            result = first_number * sec_number;
        }
        else if (operand == operand.DIV) {
            result = first_number / sec_number;
        }
    }

    public double getResult() {
        return result;
    }
}
