package boletin13;

import com.angi.paquete2.Persoal;

public class Boletin13 {

    public static void main(String[] args) {
        //crear un alumno
        Persoal alumno = new Persoal("986555555", "nombre@gmail.com");
        Academica obj = new Academica("Angi", 7, alumno);
        System.out.println(obj.toString());
    }

}
