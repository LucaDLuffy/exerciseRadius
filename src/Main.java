import util.Calculator;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;//usnado final para deixar imutavel ou seja constante.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.printf("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumferece(radius);
        double v = calc.volume(radius);

        System.out.printf("Circuference %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
        System.out.printf("PI value %.2f%n", calc.PI);

        sc.close();

    }




}