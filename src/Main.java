import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        calculate0Error();
    }

    public static void calculate0Error(){
        ArrayList<ICalculator> calculators = new ArrayList<ICalculator>();
        ArrayList<Double> results = new ArrayList<Double>();
        ICalculator iCalculator1 = new Calculator1(2,1,operand.PLUS);
        ICalculator iCalculator2 = new Calculator2(5,1, operand.PLUS);
        ICalculator iCalculator3 = new Calculator3(1,1, operand.PLUS);
        ICalculator iCalculator4= new Calculator4(1,1, operand.PLUS);
        calculators.add(iCalculator1);
        calculators.add(iCalculator2);
        calculators.add(iCalculator3);
        calculators.add(iCalculator4);

        for(int i = 0; i < 4; i++)
        {
            results.add(calculators.get(i).getResult());
        }

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
    }
}
