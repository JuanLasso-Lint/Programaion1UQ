package org.uniquindio.edu.co.poo.model;

public class Nota {
    String nombreNota;
    Float valorNota;

    public Nota(String nombreNota, Float valor){
        this.nombreNota = nombreNota;
        this.valorNota = valor;
    }
    public String getNombre() {
        return nombreNota;
    }
    public float getValor() {
        return valorNota;
    }

    public void setNombreNota(String nombreNota) {
        this.nombreNota = nombreNota;
    }
    public void setValor(Float valor) {
        this.valorNota = valor;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nombreNota='" + nombreNota + '\'' +
                ", valor=" + valorNota +
                '}';
    }
    public String actualizarNota (float nuevoValorNota) {
        setValor(nuevoValorNota);
        return "Nora actualizada";
    }
}
