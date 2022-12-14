package prog_boletin_7_3;

import java.util.Scanner;

public class PROG_boletin_7_3 {

       public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
           System.out.println("Teclea cero o un número positivo o negativo");
           int num=obj.nextInt();
           
           Numero obj1=new Numero();
           obj1.verNumero(num);
        
    }
    
}
