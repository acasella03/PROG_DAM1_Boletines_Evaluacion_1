package prog_boletin_11_5;

import java.util.Scanner;

public class Sueldo {

    private int trabajadoresSueldoMedio = 0;
    private int trabajadoresSueldoBajo = 0;
    private float sueldo;
    private int totalTrabajadores = 0;

    public void calcular() {
        do {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Indica el sueldo del trabajador\n(si el sueldo en 0 se terminará el programa):");
            sueldo = scaner.nextFloat();
            if (sueldo > 0) {
                totalTrabajadores++;
                if (sueldo >= 1000 && sueldo <= 1750) {
                    trabajadoresSueldoMedio = trabajadoresSueldoMedio + 1;
                } else if (sueldo <= 1000) {
                    trabajadoresSueldoBajo = trabajadoresSueldoBajo + 1;
                }
            }

        } while (sueldo != 0);

        float porcentaje = (float) trabajadoresSueldoBajo / (float) totalTrabajadores * 100;
        System.out.println("Trabajadores con sueldo de 1000 euros a 1750 euros: " + trabajadoresSueldoMedio);
        System.out.println("Trabajadores con sueldo inferior a 1000 euros: " + trabajadoresSueldoBajo);
        System.out.println("El porcentaje de trabajadores con sueldo inferior a 1000 euros es: " + porcentaje + " %");
    }
}
