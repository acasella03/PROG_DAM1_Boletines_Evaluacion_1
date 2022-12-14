package prog_boletin_8_7;
/**
 * Clase Triangulo.
 *
 * @author Angi M. Casella
 * @version 24.11.2022
 */
public class Triangulo {
    private float base;
    private float altura;

    /**
     * Da valor a la base del triangulo
     *
     * @param base del triangulo
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Da valor a la altura del triangulo
     *
     * @param altura del triangulo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Metodo que calcula el area del triangulo
     *
     * @return area del triangulo
     */
    public float calcularArea() {
        return base * altura / 2;
    }
}
