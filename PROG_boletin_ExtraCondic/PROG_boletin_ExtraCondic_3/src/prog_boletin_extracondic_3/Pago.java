package prog_boletin_extracondic_3;

public class Pago {

    private int cantidadAlumnos;
    
    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public void calculoPago() {
        float importe1 = 65.0f;
        float importe2 = 70.0f;
        float importe3 = 95.0f;
        if (cantidadAlumnos >= 100) {
            mostrarCalculo(cantidadAlumnos * importe1, importe1);
        } else if (cantidadAlumnos >= 50) {
            mostrarCalculo(cantidadAlumnos * importe2, importe2);
        } else if (cantidadAlumnos >= 30) {
            mostrarCalculo(cantidadAlumnos * importe3, importe3);
        } else {
            mostrarCalculo(4000, (4000 / cantidadAlumnos));
        }
    }

    public void mostrarCalculo(float total, float importe) {
        System.out.println("Total a la compañía de autobuses= " + total + "\nEl importe por alumno es= " + importe);
    }

}
