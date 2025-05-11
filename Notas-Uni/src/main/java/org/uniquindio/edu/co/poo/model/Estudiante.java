package org.uniquindio.edu.co.poo.model;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private String identificacion;
    private Nota [] listaNotas = new Nota[5];

    public Estudiante(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre(){
        return nombre;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public Nota[] getListaNotas(){
        return listaNotas;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public void setListaNotas(Nota[] listaNotas){
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString(){
        return nombre + " " + identificacion + " "  + Arrays.toString(listaNotas);
    }

    //Notas
    public String registrarNota(String nombreNota, Float valorNota) {
        int posdiponible = 0;
        posdiponible = buscarPosDisponible();

        if (posdiponible == -1){
            return "No hay cupos disponibles";
        }else{
            Nota nota = new Nota(nombreNota, valorNota);
            listaNotas[posdiponible] = nota;
            return "Nota del estudiante registrada";
        }
    }

    private int buscarPosDisponible() {
        for (int i = 0; i < listaNotas.length; i++ )
            if (listaNotas[i] == null)
                return i;
        return -1;
    }



    public float calcularDefinitiva(){
        float sumatoria = 0;
        float definitiva = 0;

        for(Nota notaAux : listaNotas){
            if(notaAux != null){
                sumatoria += notaAux.getValor();
            }
        }
        definitiva = sumatoria / listaNotas.length;
        return definitiva;
    }




    public String actualizarNota(String nombreNota, float nuevoValorNota) {
        String mensaje = "";

        Nota notaEncontrada = buscarNota(nombreNota);
        if(notaEncontrada != null){
            notaEncontrada.valorNota = nuevoValorNota;
            mensaje =  "";
        }else{
            mensaje = "La no nota esta registrada";
        }
        return mensaje;

    }

    private Nota buscarNota(String nombreNota) {

        Nota notaEncontrada = null;
        for (Nota nota: listaNotas) {
            if(nota != null && nota.getNombre().equals(nombreNota)){
                notaEncontrada = nota;
                break;
            }
        }
        return notaEncontrada;
    }

    public float notaParaaprovar(){
        float definitiva = 0;

        for (Nota nota: listaNotas) {
            if(nota == null){
                definitiva = (float) ((3.0 * listaNotas.length - calcularDefinitiva()) / (5 - listaNotas.length));
            }
        }
        return definitiva;
    }


    public float buscarNota (){
        float NotaAux = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            if(listaNotas[i] != null){
                NotaAux = listaNotas[i].getValor();
            }
        }
        return NotaAux;

    }
}
