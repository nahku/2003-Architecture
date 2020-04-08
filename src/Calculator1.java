//@author: Matrikel-Nr.: 8540946
public class Calculator1 implements ICalculator {
    private double _value1;
    private double _value2;
    private operand _operand;

    public Calculator1(double value1, double value2, operand operand){
        this._value1 = value1;
        this._value2 = value2;
        this._operand = operand;
    }

    @Override
    public double getResult() {
        double result = 0;
        switch (this._operand){
            case PLUS:
                result = add();
                break;
            case MINUS:
                result = subtract();
                break;
            case DIV:
                result = divide();
                break;
            case MULT:
                result = multiply();
                break;
        }
        return result;
    }

    private double add(){
        return this._value1 + this._value2;
    }

    private double subtract(){
        return this._value1 - this._value2;
    }

    private double divide(){
        return  this._value1 / this._value2;
    }

    private double multiply(){
        return this._value1 * this._value2;
    }
}
