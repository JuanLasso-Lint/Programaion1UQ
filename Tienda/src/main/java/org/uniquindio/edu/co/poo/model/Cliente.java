package org.uniquindio.edu.co.poo.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String identificacion;
    private String telefono;
    private String correo;
    private String direccion;

    public Cliente(String nombre, String apellido, String identificacion, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = this.direccion;
    }
//Get
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public String getDireccion() {
        return direccion;
    }

//Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

//toString
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public String actualizarNombre(String nuevoNombre) {
        setNombre(nuevoNombre);
        return nombre;
    }
}
