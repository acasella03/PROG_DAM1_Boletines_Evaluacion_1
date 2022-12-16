package prog_boletin_extracondic_3;

import java.util.Scanner;

public class PROG_boletin_ExtraCondic_3 {

    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("Indica la cantidad de alumnos:");
        int numAlumnos=scaner.nextInt();
        
        Pago importe=new Pago();
        importe.setCantidadAlumnos(numAlumnos);
        importe.calculoPago();
    }
    
}
