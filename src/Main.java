import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        calculate0Error();
        calculate1Error();
        calculate2Errors();
        calculateSpecialCase();
        calculateNoCommonResult();
    }

    public static void printCalculatorsInput(ArrayList<CalculatorInput> calculatorInputs){
        for(int i = 0; i < 4; i++){
            System.out.print("Input Calculator" + (i+1) + ": ");
            System.out.println("Input 1: " + calculatorInputs.get(i).getFirstOperand() + ", Input 2: " +
                    calculatorInputs.get(i).getSecondOperand() + ", Operator: " + calculatorInputs.get(i).getOperator().name());
        }
    }

    public static void calculateNoCommonResult(){
        ArrayList<CalculatorInput> calculatorsInput = new ArrayList<CalculatorInput>();
        CalculatorInput input1 = new CalculatorInput(1,1,Operator.PLUS);
        CalculatorInput input2 = new CalculatorInput(1,1,Operator.DIV);
        CalculatorInput input3 = new CalculatorInput(4,2,Operator.MULT);
        CalculatorInput input4 = new CalculatorInput(3,3,Operator.MINUS);
        calculatorsInput.add(input1);
        calculatorsInput.add(input2);
        calculatorsInput.add(input3);
        calculatorsInput.add(input4);

        calculate(calculatorsInput);
    }

    public static void calculateSpecialCase(){
        ArrayList<CalculatorInput> calculatorsInput = new ArrayList<CalculatorInput>();
        CalculatorInput rightInput = new CalculatorInput(1,1,Operator.PLUS);
        CalculatorInput wrongInput = new CalculatorInput(1,1,Operator.MULT);

        calculatorsInput.add(rightInput);
        calculatorsInput.add(rightInput);
        calculatorsInput.add(wrongInput);
        calculatorsInput.add(wrongInput);

        calculate(calculatorsInput);
    }

    public static void calculate2Errors(){
        ArrayList<CalculatorInput> calculatorsInput = new ArrayList<CalculatorInput>();
        CalculatorInput rightInput = new CalculatorInput(1,1,Operator.PLUS);
        CalculatorInput wrongInput = new CalculatorInput(1,1,Operator.MULT);
        CalculatorInput wrongInput2 = new CalculatorInput(1,3,Operator.MULT);

        for (int i = 0; i < 2; i++){
            calculatorsInput.add(rightInput);
        }
        calculatorsInput.add(wrongInput);
        calculatorsInput.add(wrongInput2);

        calculate(calculatorsInput);
    }

    public static void calculate1Error(){
        ArrayList<CalculatorInput> calculatorsInput = new ArrayList<CalculatorInput>();
        CalculatorInput rightInput = new CalculatorInput(1,1,Operator.PLUS);
        CalculatorInput wrongInput = new CalculatorInput(1,1,Operator.MULT);

        for (int i = 0; i < 3; i++){
            calculatorsInput.add(rightInput);
        }

        calculatorsInput.add(wrongInput);

        calculate(calculatorsInput);
    }

    public static void calculate0Error(){

        ArrayList<CalculatorInput> calculatorsInput = new ArrayList<CalculatorInput>();
        CalculatorInput singleInput = new CalculatorInput(1,1,Operator.PLUS);

        for (int i = 0; i < 4; i++){
            calculatorsInput.add(singleInput);
        }

        calculate(calculatorsInput);
    }

    public static void calculate(ArrayList<CalculatorInput> calculatorsInput){

        ArrayList<ICalculator> calculators = new ArrayList<ICalculator>();
        ArrayList<Double> results = new ArrayList<Double>();

        ICalculator iCalculator1 = new Calculator1(calculatorsInput.get(0).getFirstOperand(),
                calculatorsInput.get(0).getSecondOperand(),calculatorsInput.get(0).getOperator());
        ICalculator iCalculator2 = new Calculator1(calculatorsInput.get(1).getFirstOperand(),
                calculatorsInput.get(1).getSecondOperand(),calculatorsInput.get(1).getOperator());
        ICalculator iCalculator3 = new Calculator1(calculatorsInput.get(2).getFirstOperand(),
                calculatorsInput.get(2).getSecondOperand(),calculatorsInput.get(2).getOperator());
        ICalculator iCalculator4 = new Calculator1(calculatorsInput.get(3).getFirstOperand(),
                calculatorsInput.get(3).getSecondOperand(),calculatorsInput.get(3).getOperator());

        calculators.add(iCalculator1);
        calculators.add(iCalculator2);
        calculators.add(iCalculator3);
        calculators.add(iCalculator4);

        for(int i = 0; i < 4; i++)
        {
            results.add(calculators.get(i).getResult());
        }
        printCalculatorsInput(calculatorsInput);

        vote(results);
    }

    //returns true if 2 results have the same commonness and the result is insecure
    public static boolean handle_special_case(ArrayList<Double> results, Double[] unique_array){
        int commonness_first=0;
        int commonness_second=0;

        for (int i = 0; i <results.size(); i++) {
            if (Double.compare(unique_array[0], results.get(i))==0) {
                commonness_first++;
            }
        }
        for (int i = 0; i <results.size(); i++) {
            if (Double.compare(unique_array[1], results.get(i))==0) {
                commonness_second++;
            }
        }
        if (commonness_first==commonness_second){
            return true;
        }
        else{
            return false;
        }
    }

    public static void vote(ArrayList<Double> results){
        Set<Double> uniques = new HashSet<Double>();
        double result = 0;
        double correct_result=0;
        int counter = 0;
        for (int i = 0; i<4;i++){

            result = results.get(i);
            if(uniques.add(result)) {
                counter++;
            }
            else{
                correct_result=result;
            }
        }

        Double[] unique_array = uniques.toArray( new Double[uniques.size()] );

        int deviations = --counter;

        System.out.print("Voting-Ergebnis: ");

        switch (deviations){
            case 0:
                System.out.println("Kein Fehler. Korrekte Loesung: " + correct_result);
                break;
            case 1:
                if(handle_special_case(results,unique_array)){
                    System.out.println("Zwei Fehler aufgetreten. Keine eindeutige Lösung vorhanden. Mögliche Lösungen: "+unique_array[0]+ ", "+unique_array[1]);
                }
                else{
                    System.out.println("Ein Fehler. Korrekte Loesung: " + correct_result);
                }
                break;
            case 2:
                System.out.println("Zwei Fehler. Korrekte Loesung: " + correct_result);
                break;
            case 3:
                System.out.println("Keine übereinstimmenden Ergebnisse.");
                break;
            default:
                break;
        }

        System.out.println("");
    }
}
