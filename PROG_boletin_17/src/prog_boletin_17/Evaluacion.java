package prog_boletin_17;

import javax.swing.JOptionPane;

public class Evaluacion {

    private float notaPuebraEscrita1;
    private float notaPruebaEscrita2;
    private float notaPruebaPractica;
    private float notaBoletines;

    public Evaluacion() {
    }

    public Evaluacion(float notape1, float notape2, float notapp, float notaBol) {
        notaPuebraEscrita1 = notape1;
        notaPruebaEscrita2 = notape2;
        notaPruebaPractica = notapp;
        notaBoletines = notaBol;
    }

    public float getNotaPuebraEscrita1() {
        return notaPuebraEscrita1;
    }

    public void setNotaPuebraEscrita1(float notaPuebraEscrita1) {
        this.notaPuebraEscrita1 = notaPuebraEscrita1;
    }

    public float getNotaPruebaEscrita2() {
        return notaPruebaEscrita2;
    }

    public void setNotaPruebaEscrita2(float notaPruebaEscrita2) {
        this.notaPruebaEscrita2 = notaPruebaEscrita2;
    }

    public float getNotaPruebaPractica() {
        return notaPruebaPractica;
    }

    public void setNotaPruebaPractica(float notaPruebaPractica) {
        this.notaPruebaPractica = notaPruebaPractica;
    }

    public float getNotaBoletines() {
        return notaBoletines;
    }

    public void setNotaBoletines(float notaBoletines) {
        this.notaBoletines = notaBoletines;
    }

    public float calcularNotaPruebaEscrita() {
        notaPuebraEscrita1 = validarNota("Teclea nota1 Prueba Escrita entre 0 y 10");
        notaPruebaEscrita2 = validarNota("Teclea nota2 Prueba Escrita entre 0 y 10");
        float media = (notaPuebraEscrita1 + notaPruebaEscrita2) / 2 * 0.40f;

        return media;

    }

    public float calcularNotaPruebaPractica() {
        notaPruebaPractica = validarNota("Teclea nota Prueba Práctica entre 0 y 10");
        float media = notaPruebaPractica * 0.40f;

        return media;
    }

    public float calcularNotaBoletines() {
        float bolTotal = pedirNumero("Indica número total de boletines");
        float bolHecho = pedirNumero("Indica cantidad de boletines hechos");
        if (((bolHecho / bolTotal) * 100) > 90) {
            notaBoletines = 2;
        } else if ((((bolHecho / bolTotal) * 100) >= 70) || (((bolHecho / bolTotal) * 100) <= 90)) {
            notaBoletines = 1;

        } else {
            notaBoletines = 0;
        }
        return notaBoletines;
    }

    public static float pedirNumero(String mensaje) {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }

    public float validarNota(String mensaje) {
        float nota;
        do {
            nota = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        } while (nota < 0 || nota > 10);
        return nota;
    }
}
