package boletin15;

public class Disco extends Multimedia {
    private String genero;

    public Disco() {
        super();
    }

    public Disco(String genero, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+", genero= " + genero ;
    }
    
    
}
