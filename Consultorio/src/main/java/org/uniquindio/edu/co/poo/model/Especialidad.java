package org.uniquindio.edu.co.poo.model;

public enum Especialidad {
    ODONTOLOGO_GENERAL(0),ORTODONCIA (1),ENDODONCIA(2) ,CIRUGIA_ORAL(3);

    private final int codigo;

    Especialidad(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
