package prog_boletin_extracondic_2;

import java.util.Scanner;

public class PROG_boletin_ExtraCondic_2 {

    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("Introduce tipo de uva (A o B): ");
        String tipo=scaner.next();
        System.out.println("Introduce tamaño de uva (1 o 2): ");
        int tamaño=scaner.nextInt();
        System.out.println("Introduce precio inicial: ");
        float precioIni=scaner.nextFloat();
        
        Uva obj=new Uva();
        obj.setTipoUva(tipo);
        obj.setTamañoUva(tamaño);
        obj.setPrecioIni(precioIni);
        obj.precioFinal();
        
    }
    
}
