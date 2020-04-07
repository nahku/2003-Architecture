//@author: 5060216 (Matrikelnummer)

public class Calculator4 implements ICalculator {

    private static double result;

    public Calculator4 (double first_number, double sec_number, operand operand)
    {

        switch(operand){
            case PLUS: addition(first_number, sec_number);
                       break;
            case MINUS: subtraction(first_number, sec_number);
                        break;
            case MULT: multiplication(first_number, sec_number);
                       break;
            case DIV: division(first_number, sec_number);
                      break;
            default: break;
        }
    }

    public double getResult(){
        return result;
    }

    private static void addition(double first_number, double sec_number){
        result = first_number + sec_number;
    }

    private static void subtraction(double first_number, double sec_number){
        result = first_number - sec_number;
    }

    private static void multiplication(double first_number, double sec_number){
        result = first_number * sec_number;
    }

    private static void division(double first_number, double sec_number) {
        if (sec_number == 0.0) {
            System.out.println("You should not divide a number by zero");
            result = 0.0;
        } else {
            result = first_number / sec_number;
        }
    }
}
