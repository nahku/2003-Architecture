//@author: 5060216 (Matrikelnummer)

public class Calculator4 implements ICalculator {

    private static double result;
    private static double first_num;
    private static double second_num;

    public Calculator4 (double first_number, double sec_number, Operator Operator)
    {
        first_num = first_number;
        second_num =sec_number;

        switch(Operator){
            case PLUS: addition();
                       break;
            case MINUS: subtraction();
                        break;
            case MULT: multiplication();
                       break;
            case DIV: division();
                      break;
            default: break;
        }
    }

    public double getResult(){
        return result;
    }

    private static void addition(){
        result = first_num + second_num;
    }

    private static void subtraction(){
        result = first_num - second_num;
    }

    private static void multiplication(){
        result = first_num * second_num;
    }

    private static void division() {
        if (second_num == 0.0) {
            System.out.println("You should not divide a number by zero");
            result = 0.0;
        } else {
            result = first_num / second_num;
        }
    }
}
