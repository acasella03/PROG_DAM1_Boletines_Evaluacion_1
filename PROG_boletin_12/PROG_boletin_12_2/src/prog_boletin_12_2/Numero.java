package prog_boletin_12_2;

import javax.swing.JOptionPane;

public class Numero {

    int numeroSecreto = (int) ((Math.random() * 50) + 1);
    int intento;
    String acertarNumeroSecreto = "¡Adivinaste!";
    String mensajeNumeroSecretoEsMayor = "El número es mayor\nInténtalo otra vez";
    String mensajeNumeroSecretoEsMenor = "El número es menor\nInténtalo otra vez";
    String gameOver = "Lo siento: ¡has perdido!. El número era el: "+numeroSecreto;

    public void pedirNumero() {
        JOptionPane.showMessageDialog(null, "Tienes 5 intentos. Escribe un número entre 1 y 50: ");
        for (int i = 1; i <= 5; i++) {
            intento = pedirEntero("Teclea y adivina el número");
            if (intento == numeroSecreto) {
                JOptionPane.showMessageDialog(null, acertarNumeroSecreto);
                break;
            }else if (i==5){
                JOptionPane.showMessageDialog(null, gameOver);
                break;
            } else if (numeroSecreto > intento) {
                JOptionPane.showMessageDialog(null, mensajeNumeroSecretoEsMayor);
            } else if (numeroSecreto < intento) {
                JOptionPane.showMessageDialog(null, mensajeNumeroSecretoEsMenor);
            }

        }

    }

    public static int pedirEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

}
