package prog_boletin_extracondic_2;

public class Uva {

    private String tipoUva;
    private int tamañoUva;
    private float precioIni;

    public void precioFinal() {
        if ("A".equals(tipoUva)) {
            if (tamañoUva == 1) {
                System.out.println("Precio Final = " + (precioIni + 0.20f));
            } else if (tamañoUva == 2) {
                System.out.println("Precio Final = " + (precioIni + 0.30f));
            } else {
                System.out.println("Error");
            }
        } else if ("B".equals(tipoUva)) {
            if (tamañoUva == 1) {
                System.out.println("Precio Final = " + (precioIni - 0.30f));
            } else if (tamañoUva == 2) {
                System.out.println("Precio Final = " + (precioIni - 0.50f));
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }

    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }

    public void setTamañoUva(int tamañoUva) {
        this.tamañoUva = tamañoUva;
    }

    public void setPrecioIni(float precioIni) {
        this.precioIni = precioIni;
    }

}
