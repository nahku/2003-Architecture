import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //calculate
    }

    public static void calculate0Error(){

        ICalculator iCalculator1 = new Calculator1(1,1,operand.PLUS);
        ICalculator iCalculator2;
        ICalculator iCalculator3;
        ICalculator iCalculator4; //= MyClass1(1,2,"+");
        ArrayList<Float> results;


        //vote(results);

    }

    public static void vote(ArrayList<Float> results){
        Set<Float> uniques = new HashSet<Float>();
        float result = 0;
        int counter = 0;
        for (int i = 0; i<4;i++){

            result = results.get(i);
            if(uniques.add(result)) {
                counter++;
            }
        }

        int deviations = counter--;

        switch (deviations){
            case 0:
                System.out.println("Kein Fehler");
                break;
            case 1:
                System.out.println("1 Fehler");
                break;
            case 2:
                System.out.println("2 Fehler");
            case 3:
                System.out.println("Keine übereinstimmenden Ergebnisse");
            default:
                break;
        }
    }
}
