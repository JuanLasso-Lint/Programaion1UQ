package org.uniquindio.edu.co.poo.model;

public class Medico {
    private String nombre;
    private String apellido;
    private String idUnica;
    private String numeroLicencia;
    private Especialidad especialidad;

    public Medico(String nombre, String apellido, String idUnica, String numeroLicencia, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idUnica = idUnica;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdUnica() {
        return idUnica;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdUnica(String idUnica) {
        this.idUnica = idUnica;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idUnica='" + idUnica + '\'' +
                ", numeroLicencia='" + numeroLicencia + '\'' +
                ", especialidad=" + especialidad +
                "     }";
    }
}
