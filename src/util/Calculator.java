package util;

public class Calculator {

    public final double PI = 3.14;

    //funções Static usadas
    // tem que usar o static pq esta dentro de outro metido static o main
    public double circumferece(double radius){
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
