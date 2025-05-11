package org.uniquindio.edu.co.poo.app;
import org.uniquindio.edu.co.poo.model.Cliente;
import org.uniquindio.edu.co.poo.model.DetalleDeVenta;
import org.uniquindio.edu.co.poo.model.Tienda;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("Tienda de don Juan", "11002558");

        tienda.registrarCliente("Juan","Lasso","1001","3121","juanes45@","Calle 32");
        tienda.registrarCliente("Maria", "Gomez", "1002", "3122", "maria_gomez@", "Avenida 10");
        tienda.registrarCliente("Carlos", "Perez", "1003", "3123", "carlitos90@", "Calle 50");
        tienda.registrarCliente("Ana", "Martinez", "1004", "3124", "ana_mtz@", "Carrera 15");
        tienda.registrarCliente("Luis", "Rodriguez", "1005", "3125", "luisr89@", "Diagonal 22");
        tienda.registrarCliente("Sofia", "Fernandez", "1006", "3126", "sofiaf@", "Transversal 5");
        tienda.registrarCliente("Pedro", "Lopez", "1007", "3127", "pedrito@", "Plaza Central");



        tienda.registarProducto("leche","7788","lacteo",3200,40);
        tienda.registarProducto("Pan", "1122", "Panadería", 2500, 30);
        tienda.registarProducto("Arroz", "3344", "Granos", 5000, 50);
        tienda.registarProducto("Azúcar", "5566", "Dulces", 4800, 25);
        tienda.registarProducto("Café", "9900", "Bebidas", 12000, 15);
        tienda.registarProducto("Huevos", "2233", "Abarrotes", 12000, 60);
        tienda.registarProducto("Jabón", "4455", "Limpieza", 3500, 20);

        ArrayList<DetalleDeVenta> detalleDeventa1 = new ArrayList<>();
        detalleDeventa1.add(new DetalleDeVenta(1,12000));
        detalleDeventa1.add(new DetalleDeVenta(2,2244));



        tienda.registrarVenta("03.08.2025","12",1, detalleDeventa1);



        //String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre");
        //String identificacion = JOptionPane.showInputDialog("Ingrese el numero identificacion del cliente a modificar");
        //tienda.actualizarCliente(identificacion, nuevoNombre);
        //tienda.eliminarCliente(identificacion);

        //double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("ingrese nuevo precio"));
        //String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto");
        //tienda.actualizarProducto("7788",nuevoPrecio);
        //tienda.eliminarProducto(codigo);


        tienda.mostrarClientesEnConsola();
        tienda.mostrarProductosEnConsola();
        tienda.mostrarVentas();





    }
}