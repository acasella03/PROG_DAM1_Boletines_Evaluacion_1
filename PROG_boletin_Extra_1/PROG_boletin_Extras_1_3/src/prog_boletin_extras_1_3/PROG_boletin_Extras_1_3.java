package prog_boletin_extras_1_3;

import java.util.Scanner;

public class PROG_boletin_Extras_1_3 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe el valor de a:");
        double a = escaner.nextDouble();
        System.out.println("Escribe el valor de b:");
        double b = escaner.nextDouble();
        System.out.println("Escribe el valor de c:");
        double c = escaner.nextDouble();
        double x1;
        double x2;
        
        if (Math.pow(b, 2) - (4 * a * c) >= 0) {
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            System.out.println("La solución de x1 es= " + x1);
            System.out.println("La solucuón de x2es= " + x2);
        } else {
            System.out.println("La solución es compleja");
        }

    }

}
