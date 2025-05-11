package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Consultorio {
    private String nombre;
    private String nit;
    private String ubicacion;
    private List<Medico> listaMedicos;
    private List<Paciente> listaPacientes;

    public Consultorio(String nombre, String nit, String ubicacion) {
        this.nombre = nombre;
        this.nit = nit;
        this.ubicacion = ubicacion;
        this.listaMedicos = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public void agregarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public void agregarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", listaMedicos=" + listaMedicos +
                ", listaPacientes=" + listaPacientes +
                '}';
    }


    public void registrarPaciente(int numHistoriaClinica, String nombre, int edad, String telefono, String direccion, LocalDate fechaUltimaConsulta, int cantidadTratamientos) {
        Paciente nuevoPaciente = new Paciente(numHistoriaClinica, nombre, edad, telefono, direccion, fechaUltimaConsulta, cantidadTratamientos);
        listaPacientes.add(nuevoPaciente);
        System.out.println("Paciente registrado exitosamente: " + nuevoPaciente);
    }


    public void registrarMedico (String nombre, String apellido, String idUnica, String numeroLicencia, Especialidad especialidad) {
        Medico nuevoMedico = new Medico(nombre, apellido, idUnica, numeroLicencia, especialidad);
        listaMedicos.add(nuevoMedico);
        System.out.println("Médico registrado exitosamente: " + nuevoMedico);
    }

    public void actualizarPaciente(int numHistoriaClinica, String nombre, int edad, String telefono,
                                   String direccion, LocalDate fechaUltimaConsulta, int cantidadTratamientos) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (listaPacientes.get(i).numHistoriaClinica() == numHistoriaClinica) {
                Paciente pacienteActualizado = new Paciente(numHistoriaClinica, nombre, edad, telefono, direccion,
                        fechaUltimaConsulta, cantidadTratamientos);
                listaPacientes.set(i, pacienteActualizado);
                System.out.println("Paciente actualizado exitosamente: " + pacienteActualizado);
                return;
            }
        }
        System.out.println("Error: Paciente con historia clínica " + numHistoriaClinica + " no encontrado.");
    }
    public List<Paciente> obtenerPacientesConMasDe5Tratamientos() {
        List<Paciente> pacientesFiltrados = new ArrayList<>();
        for (Paciente paciente : listaPacientes) {
            if (paciente.cantidadTratamientos() > 5) {
                pacientesFiltrados.add(paciente);
            }
        }
        return pacientesFiltrados;
    }



}
