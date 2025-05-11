package org.uniquindio.edu.co.poo.model;

public class Producto {
    private String nombre;
    private String codigo;
    private String categoria;
    private double precio;
    private Integer stock;

    public Producto(String nombre, String codigo, String categoria, double precio, Integer stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

//get
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getCategoria() {
        return categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public Integer getStock() {
        return stock;
    }

//Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
//toString


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    public double actualizarPrecio(double nuevoPrecio) {
        setPrecio(nuevoPrecio);
        return precio;
    }
}
