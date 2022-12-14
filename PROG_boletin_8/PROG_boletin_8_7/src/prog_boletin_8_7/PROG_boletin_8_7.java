package prog_boletin_8_7;

import java.util.Scanner;

/**
 * Aplicacion que calcula el area de distintas figuras geometricas
 *
 * @author Angi M. Casella
 * @version 24.11.2022
 */

public class PROG_boletin_8_7 {
/**
* Esta aplicacion inicia pidiendole al usuario que seleccione una figura geometrica
* para calcular su area y mostrar el resultado por la consola.
*
* @param args
*/
    
    public static void main(String[] args) {
        String eleccion = "Elige una figura geométrica";
        String elecOpcion1 = "1. Cuadrado";
        String elecOpcion2 = "2. Triángulo";
        String elecOpcion3 = "3. Círculo";
        String pedirLado = "Introduce el lado";
        String pedirBase = "Introduce la base";
        String pedirAltura = "Introduce la altura";
        String pedirRadio = "Introduce el radio";
        String areaCuadrado = "El area del cuadrado es: ";
        String areaTriangulo = "El area del triángulo es: ";
        String areaCirculo = "El area del círculo es: ";
        String error = "Opción incorrecta";


        System.out.println(eleccion);
        System.out.println(elecOpcion1);
        System.out.println(elecOpcion2);
        System.out.println(elecOpcion3);

        Scanner scaner = new Scanner(System.in);
        int figura = scaner.nextInt();

        switch (figura) {
            case 1:
                System.out.println(pedirLado);
                float lado = scaner.nextFloat();
                Cuadrado cuadrado1 = new Cuadrado();
                cuadrado1.setLado(lado);
                System.out.println(areaCuadrado + cuadrado1.calcularArea());
                break;
            case 2:
                System.out.println(pedirBase);
                float base = scaner.nextFloat();
                System.out.println(pedirAltura);
                float altura = scaner.nextFloat();
                Triangulo triangulo1 = new Triangulo();
                triangulo1.setBase(base);
                triangulo1.setAltura(altura);
                System.out.println(areaTriangulo + triangulo1.calcularArea());
                break;
            case 3:
                System.out.println(pedirRadio);
                float radio = scaner.nextFloat();
                Circulo circulo1 = new Circulo();
                circulo1.setRadio(radio);
                System.out.println(areaCirculo + circulo1.calcularArea());
                break;
            default:
                System.out.println(error);
                break;
        }
    }
    
}