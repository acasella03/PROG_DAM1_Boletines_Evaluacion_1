package boletin13;

import com.angi.paquete2.Persoal;
import javax.swing.JOptionPane;

public class Academica {

    private static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Persoal alum;

    public Academica() {
        numReferencia++;
    }

    public Academica(String nome, int nota, Persoal alum) {
        Academica.numReferencia++;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", nota= " + nota + ", alum= " + alum;
    }

    public int validarNota(int nota) {
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("teclea nota entre 0 y 10"));
        } while (nota < 0 || nota > 10);
        return nota;
    }

}
