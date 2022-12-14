package prog_boletin_7_2;

import java.util.Scanner;

public class PROG_boletin_7_2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Teclea num1: ");
        short numero1 = obj.nextShort();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Teclea num2: ");
        short numero2 = obj1.nextShort();
        
        Numero obj2 =new Numero ();
        obj2.suma(numero1, numero2);       
        
    }

}
