package org.uniquindio.edu.co.poo.model;

public class DetalleDeVenta {
    private Integer cantidad;
    private double subtotal;


    public DetalleDeVenta(Integer cantidad, double subtotal) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }


    //get
    public Integer getCantidad() {
        return cantidad;
    }
    public double getSubtotal() {
        return subtotal;
    }

    //set
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    //toString


    @Override
    public String toString() {
        return "DetalleDeVenta{" +
                "cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                '}';
    }

}

