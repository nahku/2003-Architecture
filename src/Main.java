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
        ICalculator iCalculator1 = new Calculator1(1,1,operand.PLUS);
        ICalculator iCalculator2 = new Calculator2(1,1, operand.PLUS);
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

    public static void vote(ArrayList<Double> results){
        Set<Double> uniques = new HashSet<Double>();
        double result = 0;
        int counter = 0;
        for (int i = 0; i<4;i++){

            result = results.get(i);
            if(uniques.add(result)) {
                counter++;
            }
        }

        int deviations = --counter;

        switch (deviations){
            case 0:
                System.out.println("Kein Fehler");
                break;
            case 1:
                System.out.println("1 Fehler");
                break;
            case 2:
                System.out.println("2 Fehler");
                break;
            case 3:
                System.out.println("Keine übereinstimmenden Ergebnisse");
                break;
            default:
                break;
        }
    }
}
