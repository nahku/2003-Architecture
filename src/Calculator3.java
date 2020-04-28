//@author: Matrikel-Nr.: 6274958
public class Calculator3 implements ICalculator{

    private double result;

    public Calculator3 (double value_one, double value_two, Operator Operator)
    {
        switch (Operator){
            case PLUS:
                result = value_one + value_two;
                break;
            case MINUS:
                result = value_one - value_two;
                break;
            case MULT:
                result = value_one * value_two;
                break;
            case DIV:
                result = value_one / value_two;
                break;
        }
    }

    public double getResult() {
        return result;
    }
}
