package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String ubicacion;
    private ArrayList<Estudiante> listaEstudiantes;


    public Universidad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaEstudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }


    //Estudiante
    public String registrarEstudiante(String nombre, String identificacion) {
        String mensaje = "";
        Estudiante encontrado = null;
        Estudiante nuevoEstudiante = null;

        encontrado = buscarEstudiante(identificacion);
        if (encontrado != null) {// ya existe en el sistema
            mensaje = "El estudiante " + encontrado.getNombre() + " ya existe en la universidad";
            return mensaje;
        }
        nuevoEstudiante = new Estudiante(nombre, identificacion);
        listaEstudiantes.add(nuevoEstudiante);
        mensaje = "El estudiante fúe registrado exitosamente";
        return mensaje;
    }


    private Estudiante buscarEstudiante(String identificacion) {
        Estudiante encontrado = null;

        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                return estudianteAux;
            }
        }

        return encontrado;
    }


    //Notas
    public String registrarNota(String identificacion, String nombreNota, Float valorNota) {
        String mensaje = "";
        Estudiante EstudianteEncontrado = buscarEstudiante(identificacion);
        if (EstudianteEncontrado != null) {
            mensaje = EstudianteEncontrado.registrarNota(nombreNota, valorNota);
        } else {
            mensaje = "Estudiante no registrado";
        }
        return mensaje;

    }

    public float calcularPromedioGeneral() {
        float sumatoria = 0;

        for (Estudiante estudiante : listaEstudiantes) {
            sumatoria += estudiante.calcularDefinitiva();
        }

        return sumatoria / listaEstudiantes.size();
    }

    public String actualizarNota(String identificacion, String nombreNota, float nuevoValorNota) {
        String mensaje = "";
        Estudiante estudianteEncontrado = buscarEstudiante(identificacion);
        if (estudianteEncontrado != null) {
            mensaje = estudianteEncontrado.actualizarNota(nombreNota, nuevoValorNota);
        } else {
            mensaje = "El estudiante no esta resgitardo en la universidad";
        }

        return mensaje;
    }

    public float promedioGeneral() {
        float sumatoria = 0;

        for (Estudiante estudiante : listaEstudiantes) {
            sumatoria += estudiante.calcularDefinitiva();
        }
        return sumatoria / listaEstudiantes.size();
    }


    public String estuiantesMenorPromedio() {
        String mensaje = "";

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.calcularDefinitiva() < 3.0f) {
                mensaje += estudiante;
            }
        }
        return mensaje;
    }

    public ArrayList<Estudiante> estudiantesPuedenAprovar() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.calcularDefinitiva() < 3.0f && estudianteAux.notaParaaprovar() < 5.0f) {
                estudiantes.add(estudianteAux);
            }
        }
        return estudiantes;
    }


    public float buscarNotaPorValor(Float buscar) {
        float mensaje =0;
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion()!=null && estudianteAux.buscarNota() == buscar) {
                mensaje = estudianteAux.buscarNota();
            }
        }
        return mensaje;
    }
}
