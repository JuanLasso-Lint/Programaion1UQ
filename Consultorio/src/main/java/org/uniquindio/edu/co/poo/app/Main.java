package org.uniquindio.edu.co.poo.app;


import org.uniquindio.edu.co.poo.model.Consultorio;
import org.uniquindio.edu.co.poo.model.Especialidad;
import org.uniquindio.edu.co.poo.model.Medico;
import org.uniquindio.edu.co.poo.model.Paciente;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Medico medico = new Medico("Juan","Lasso","225","558",Especialidad.CIRUGIA_ORAL);
        //Paciente paciente = new Paciente(4850,"Ana",33,"311254","Calle 13", LocalDate.EPOCH,8);

        //System.out.println(medico);
        //System.out.println(paciente);

        Consultorio consultorio = new Consultorio("Risas para la Vida", "557984","Centro");

        consultorio.registrarPaciente(588,"Ana",33,"31154","Cale 13", LocalDate.now(),5);
        consultorio.registrarPaciente(589, "Carlos", 45, "31234", "Calle 20", LocalDate.now(), 6);
        consultorio.registrarPaciente(590, "Laura", 28, "31312", "Carrera 15", LocalDate.now(), 4);
        consultorio.registrarPaciente(591, "Miguel", 50, "31456", "Avenida 3", LocalDate.now(), 2);
        consultorio.registrarPaciente(592, "Sofia", 22, "31567", "Calle 8", LocalDate.now(), 3);
        consultorio.registrarPaciente(593, "Andres", 36, "31689", "Diagonal 10", LocalDate.now(), 8);
        consultorio.registrarPaciente(594, "Valentina", 40, "31745", "Carrera 25", LocalDate.now(), 2);
        consultorio.registrarPaciente(595, "Javier", 29, "31832", "Calle 5", LocalDate.now(), 9);



        //consultorio.registrarMedico("Juan" ,"Lasso","225","558",Especialidad.CIRUGIA_ORAL);
        //consultorio.actualizarPaciente(588,"Ana",33,"31154","Cale 13", LocalDate.now(),8);
        consultorio.obtenerPacientesConMasDe5Tratamientos();
        List<Paciente> pacientes = consultorio.obtenerPacientesConMasDe5Tratamientos();
        System.out.println("Pacientes con más de 5 tratamientos: " + pacientes);





    }
}