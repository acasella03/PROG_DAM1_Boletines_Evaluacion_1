package prog_boletin_extracondic_1;

import java.util.Scanner;

public class PROG_boletin_ExtraCondic_1 {

    public static void main(String[] args) {
        Scanner scaner1 = new Scanner(System.in);
        System.out.println("Teclea un número");
        int numero = scaner1.nextInt();

        if (numero >= 0 && numero <= 99999) {
            int digitos = (Integer.toString(numero)).length();
            System.out.println("La cifra tiene " +digitos+" dígitos");
        }else{
            System.out.println("No válido");
        }
            
    }

}
