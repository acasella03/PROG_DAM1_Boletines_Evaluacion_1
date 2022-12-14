package extras1ava;

import java.util.Scanner;

public class Extras1AVA {

    public static void main(String[] args) {
        Scanner ive = new Scanner(System.in);
        System.out.println("Indique la Base Imponible");
        float baseimponible = ive.nextFloat();
        System.out.println("Indique tipo de IVA");
        float porcentaje = ive.nextFloat();
        float iva = (float) ((baseimponible * porcentaje) / 100);
        float total = (float) (baseimponible + iva);
        System.out.println("IVA = " + iva + "\nTotal = " + total);
    }

}
