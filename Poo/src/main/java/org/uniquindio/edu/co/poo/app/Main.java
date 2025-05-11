package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Estudiante;
import org.uniquindio.edu.co.poo.model.Universidad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Uq","norte");



        universidad.registrarEstudiante("441","Juan","Lasso","juanes","311",19);
        System.out.println(universidad);

    }
}