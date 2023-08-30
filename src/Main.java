import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;//usnado final para deixar imutavel ou seja constante.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = circumferece(radius);
        double v = volume(radius);

        System.out.printf("Circuference %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
        System.out.printf("PI value %.2f%n", PI);

        sc.close();

    }

    //funções Static usadas
    // tem que usar o static pq esta dentro de outro metido static o main
    public static double circumferece(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}