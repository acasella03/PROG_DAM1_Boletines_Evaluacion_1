package boletin14;

import com.angi.partes.Cpu;
import com.angi.partes.Monitor;
import com.angi.partes.Teclado;

public class Boletin14 {

    
    public static void main(String[] args) {
        Ordenador objord=new Ordenador(new Monitor(19f),new Teclado ("Primux"), new Cpu (256), 500.30f);
        System.out.println("Las caracteríticas del ordenados son: "+objord.toString());
        
        System.out.println("El precio del ordenador es= "+objord.getPrecio()+" euros");
        System.out.println("Teclado "+objord.getTe());
        System.out.println("CPU su "+objord.getPro());
        
    }
    
}
