package prog_boletin_repaso_repetitivas;

public class PROG_boletin_repaso_repetitivas {

    public static void main(String[] args) {
        Metodos ejercicios=new Metodos();
        
        System.out.println("Ejercicio 1: sacar por consola 5 veces a frase 'isto e un bucle'.");
        ejercicios.sacarConsolaFrase();
        
        System.out.println("\nEjercicio 2: visualizar   5 números  que pides por teclado.");
        ejercicios.mostrarNumerosPedidos();
        
        System.out.println("\nEjercicio 3: visualiza varios números que pides por teclado , remata cando premes o cero.");
        ejercicios.mostrarNumerosSolicitados();
        
        System.out.println("\nEjercicio 4: visualiza 4 numeros   que entren por teclado . Os números non poden ser negativos.");
        ejercicios.visualizarNumeroPedido();
        
        System.out.println("\nEjercicio 5: completa o exercicio anterior visualizando ademáis a suma dos 4 números.");
        ejercicios.visualizarYSumarNumeroPedido();
        
        System.out.println("\nEjercicio 6: Calcula o área dun cadrado . O valor do lado o pides por teclado.");
        ejercicios.calcularAreaCuadrado();
        
        System.out.println("\nEjercicio 7: Codifica o programa anterior tendo en conta que o lado non pode ser negativo.");
        ejercicios.calcularAreaCuadrado1();
        
        System.out.println("\nEjercicio 8: Completa o programa anterior para que calcule o área de varios cadrados .Remata o programa cando o valor do lado sexa 0.");
        ejercicios.calcularAreaCuadrado2();
        
        System.out.println("\nEjercicio 9: Sumar unha serie de números que pedimos por teclado . Cando a suma sexa 100 ou superior visualizamos o resultado.");
        ejercicios.sumar();
        
        System.out.println("\nEjercicio 10: Calcula a nota media  de un alumno que ten 6 módulos.");
        ejercicios.media();
        
        System.out.println("\nEjercicio 11: Supon que nunha clase están 3 alumnos . Calcula a nota media para cada un dos alumnos.");
        ejercicios.media3Alumnos();
    }
    
}
