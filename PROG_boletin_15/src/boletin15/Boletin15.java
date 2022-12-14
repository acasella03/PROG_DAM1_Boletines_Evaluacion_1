package boletin15;

import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {
        //Pelicula peli=new Pelicula("Brad Pitt","Angelina Jolie","Sr. y Sra. Smith","Doug Liman","DVD",120f);
        //System.out.println(peli.toString());

        //Disco disc=new Disco("Rock","Queen II","Queen","CD",40.42f);
        //System.out.println(disc.toString());
        Pelicula peli = new Pelicula();
        peli.setActor(pedirDatos("Escribe nombre del Actor principal de la Película"));
        peli.setActriz(pedirDatos("Escribe nombre de la Actriz principal de la Película"));
        peli.setTitulo(pedirDatos("Escribe el título de la Película"));
        peli.setAutor(pedirDatos("Escribe el autor de la Película"));
        peli.setFormato(pedirDatos("Escribe el formato de la Película"));
        peli.setDuracion(Integer.parseInt(pedirDatos("Escribe la duración de la Película")));
        JOptionPane.showMessageDialog(null, peli.toString()); 

    }

    public static String pedirDatos(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
}
