package org.uniquindio.edu.co.poo.app;


import org.uniquindio.edu.co.poo.model.Universidad;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad del Quindío", "Armenia, Quindío");

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        String identidicacion = JOptionPane.showInputDialog("ingrese el identidicacion");
        String nombreNota = JOptionPane.showInputDialog("Ingrese el nombre del nota1");
        Float valorNota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de nota"));
        Float buscar = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de nota a buscar"));

        String mensaje1 = universidad.registrarEstudiante(nombre, identidicacion);
        String mensaje2 = universidad.registrarNota(identidicacion,nombreNota, valorNota);
        JOptionPane.showMessageDialog(null, mensaje1 + mensaje2);
        JOptionPane.showMessageDialog(null, universidad);
        float mensaje8 = universidad.buscarNotaPorValor(buscar);

        float nuevaNota = 1.2f;
        universidad.actualizarNota(identidicacion, nombreNota, nuevaNota);
        JOptionPane.showMessageDialog(null, universidad);
        JOptionPane.showMessageDialog(null,"La nota buscada es por el valor fue" + mensaje8 + nombre);



    }
}