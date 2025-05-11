package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;

public class Venta {
    private String fecha;
    private String total;
    private Integer cantidadComprada;
    private ArrayList<DetalleDeVenta> listaDetalleVentas;

    public Venta(String fecha, String total, Integer cantidadComprada, ArrayList<DetalleDeVenta> listaDetalleVentas) {
        this.fecha = fecha;
        this.total = total;
        this.cantidadComprada = cantidadComprada;
        this.listaDetalleVentas = new ArrayList<>();
    }

//get
    public String getFecha() {
        return fecha;
    }
    public String getTotal() {
        return total;
    }
    public Integer getCantidadComprada() {
        return cantidadComprada;
    }
    public ArrayList<DetalleDeVenta> getListaDetalle() {
        return listaDetalleVentas;
    }

//Set
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public void setCantidadComprada(Integer cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
    public void setListaDetalle(ArrayList<DetalleDeVenta> listaDetalleVentas) {
        this.listaDetalleVentas = listaDetalleVentas;
    }
//toString


    @Override
    public String toString() {
        return "Venta{" +
                "fecha='" + fecha + '\'' +
                ", total='" + total + '\'' +
                ", cantidadComprada=" + cantidadComprada + ", listaDetalleVentas=" + listaDetalleVentas +
                '}';
    }
}
