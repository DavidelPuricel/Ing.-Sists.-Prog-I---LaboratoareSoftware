package lab5;

// Importăm doar ce este în subpachet
import lab5.advanced.NewIntCalculator;
import lab5.advanced.DoubleCalculator;

public class AppLab5 {
    public static void main(String[] args) {

        IntCalculator calculator = new IntCalculator(10);
        int resultA = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + resultA);

        AdvancedCalculator advCalc = new AdvancedCalculator(10);
        int resultB = advCalc.divide(4).power(2).root(2).result();
        System.out.println("b) " + resultB);

        NewIntCalculator iCalc = new NewIntCalculator(10);
        int resInt = (Integer) iCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("5.5.2 a) " + resInt);

        DoubleCalculator dCalc = new DoubleCalculator(10);
        double resDouble = (Double) dCalc.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("5.5.2 b) " + resDouble);
    }
}