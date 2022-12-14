package boletin15;

public class Pelicula extends Multimedia {

    private String actor;
    private String actriz;

    public Pelicula() {
        super();
    }

    public Pelicula(String actor, String actriz, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        return super.toString() + ", actor= " + actor + ", actriz= " + actriz;
    }

}
