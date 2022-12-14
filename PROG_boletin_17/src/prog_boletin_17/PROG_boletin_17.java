package prog_boletin_17;

import javax.swing.JOptionPane;

public class PROG_boletin_17 {

    public static void main(String[] args) {
        Evaluacion pe = new Evaluacion();
        float mediaPruebaEscrita = pe.calcularNotaPruebaEscrita();
        float mediaPruebaPractica = pe.calcularNotaPruebaPractica();
        float mediaBoletines = pe.calcularNotaBoletines();
        float notaFinal = mediaPruebaEscrita + mediaPruebaPractica + mediaBoletines;
        JOptionPane.showMessageDialog(null, "Nota 1ª Prueba Escrita= " + pe.getNotaPuebraEscrita1()
                + "\nNota 2ª Prueba Escrita= " + pe.getNotaPruebaEscrita2()
                + "\nMedia Pruebas Escritas= " + mediaPruebaEscrita
                + "\nNota Prueba Práctica= " + pe.getNotaPruebaPractica()
                + "\nMedia Prueba Práctica= " + mediaPruebaPractica
                + "\nMedia Boletines= " + pe.getNotaBoletines()
                + "\nLa nota final es= " + notaFinal);
    }

}
