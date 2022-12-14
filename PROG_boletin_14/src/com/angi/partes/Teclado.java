package com.angi.partes;

public class Teclado {
    private String marca;
    
    public Teclado(){
        
    }

    public Teclado(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "marca=" + marca;
    }
    
}
