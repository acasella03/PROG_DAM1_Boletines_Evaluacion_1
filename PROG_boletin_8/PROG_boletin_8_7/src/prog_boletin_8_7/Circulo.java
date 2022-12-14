package prog_boletin_8_7;
/**
 * Clase Circulo.
 *
 * @author Angi M. Casella
 * @version 24.11.2022
 */
public class Circulo {
    private float radio;

    /**
     * Da valor al radio del circulo
     *
     * @param radio del circulo
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * Metodo que calcula el area del circulo
     *
     * @return area del circulo
     */
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
