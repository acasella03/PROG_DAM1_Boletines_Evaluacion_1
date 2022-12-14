package prog_boletin_extras_1_2;

import java.util.Scanner;

public class PROG_boletin_Extras_1_2 {

    public static void main(String[] args) {
        Scanner escanera= new Scanner (System.in);
        System.out.println("Introduce el valor de a");
        double a=escanera.nextDouble();
        Scanner escanerb=new Scanner(System.in);
        System.out.println("Introduce el valor de b");
        double b=escanerb.nextDouble();
        Scanner escanerc=new Scanner(System.in);
        System.out.println("Introduce el valor de c");
        double c=escanerc.nextDouble();
        Scanner escanerx=new Scanner(System.in);
        System.out.println("Introduce el valor de X");
        double x=escanerx.nextDouble();
        
       double y=(a*(Math.pow(x, 2))+(b*x)+c);
       
        System.out.println("El valor de Y es "+y);
        
    }
    
}
