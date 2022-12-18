package prog_boletin_repaso_repetitivas;

import java.util.Scanner;

public class Metodos {

    public void sacarConsolaFrase() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Esto es un bucle");
        }
    }

    public void mostrarNumerosPedidos() {
        for (int i = 0; i < 5; i++) {
            int numero = pedirNumero("Teclea un número:");
            System.out.println("El número tecleado es: " + numero);
        }
    }

    public void mostrarNumerosSolicitados() {
        int numero;
        do {
            numero = pedirNumero("Escribe un número:");
            System.out.println("El número es: " + numero);
        } while (numero != 0);
    }

    public void visualizarNumeroPedido() {
        for (int i = 0; i < 4; i++) {
            int numero;
            do {
                numero = pedirNumero("Teclea un número:");
            } while (numero < 0);

            System.out.println("El número tecleado es: " + numero);
        }
    }

    public void visualizarYSumarNumeroPedido() {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            int numero;
            do {
                numero = pedirNumero("Teclea un número:");
            } while (numero < 0);

            System.out.println("El número tecleado es: " + numero);
            suma = suma + numero;
            System.out.println("La suma de los número es= " + suma);
        }
    }

    public void calcularAreaCuadrado() {
        int lado = pedirNumero("Teclea el lado del cuadrado:");
        System.out.println("El área del cuadrado es= " + Math.pow(lado, 2));

    }

    public void calcularAreaCuadrado1() {
        int lado;
        do {
            lado = pedirNumero("Teclea el lado del cuadrado:");
        } while (lado < 0);

        System.out.println("El área del cuadrado es= " + Math.pow(lado, 2));
    }

    public void calcularAreaCuadrado2() {
        int lado;
        do {
            do {
                lado = pedirNumero("Teclea el lado del cuadrado:");
            } while (lado < 0);
            System.out.println("El área del cuadrado es= " + Math.pow(lado, 2));
        } while (lado != 0);
    }

    public void sumar() {
        int suma = 0;
        do {
            int numero = pedirNumero("Teclea un número:");
            suma = suma + numero;
        } while (suma < 100);

        System.out.println("La suma es= " + suma);
    }

    public void media() {
        float suma = 0;
        for (int i = 1; i < 7; i++) {
            float nota = pedirNumero("Escribe nota del módulo " + i + ": ");
            suma = suma + nota;
        }
        System.out.println("La media es= " + (suma / 6));
    }

    public void media3Alumnos() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Alumno " + i + ":");
            float suma = 0;
            float nota;
            int cantidadNotas = 0;
            do {
                nota = pedirNumero("Escribe nota del módulo: ");
                if (nota >= 0 && nota <= 10) {
                    suma = suma + nota;
                    cantidadNotas++;
                } else {
                    System.out.println("La última nota no es válida, a contonuación se calcula la media"); 
                }

            } while (nota >= 0 && nota <= 10);
            System.out.println("La media es del alumno " + i + " = " + (suma / cantidadNotas));
        }

    }

    public int pedirNumero(String mensaje) {
        Scanner pedir = new Scanner(System.in);
        System.out.println(mensaje);
        return pedir.nextInt();
    }
}
