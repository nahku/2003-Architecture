public class CalculatorInput {

    private double operand1;
    private double operand2;
    private Operator operator;

    CalculatorInput(double operand1, double operand2, Operator operator){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    double getFirstOperand(){
        return operand1;
    }

    double getSecondOperand(){
        return operand2;
    }

    Operator getOperator(){
        return operator;
    }
}
