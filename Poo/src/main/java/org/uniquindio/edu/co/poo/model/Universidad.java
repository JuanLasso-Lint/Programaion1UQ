package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String direccion;
    private ArrayList<Estudiante> listaEstudiantes;

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }

    private Estudiante buscarEstudiante(String identificacion) {
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getNumeroIdentificacion().equals(identificacion)) {
                return estudianteAux;
            }
        }
        return null;
    }

    public String registrarEstudiante(String numeroIdentificacion, String nombre, String apellido, String correo, String telefono, int edad) {
        Estudiante encontrado = buscarEstudiante(numeroIdentificacion);
        if (encontrado != null) { // ya existe en el sistema
            return "El estudiante " + encontrado.getNombre() + " ya existe en la universidad";
        }

        Estudiante nuevoEstudiante = new Estudiante(numeroIdentificacion, nombre, apellido, correo, telefono, edad);
        listaEstudiantes.add(nuevoEstudiante);
        return "El estudiante fue registrado exitosamente";
    }
}
