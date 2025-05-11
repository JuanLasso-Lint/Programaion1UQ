package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String nit;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Venta> listaVentas;

    public Tienda(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listaClientes = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaVentas = new ArrayList<>();
    }

    //Get
    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

//Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    //toString
    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaProductos=" + listaProductos +
                ", listaVentas=" + listaVentas +
                '}';
    }
//Metodos

    public String registrarCliente(String nombre, String apellido, String identificacion, String telefono, String correo, String direccion) {
        String mensaje = "";
        Cliente encontrado = null;
        Cliente nuevoCliente = null;

        encontrado = buscarCliente(identificacion);
        if (encontrado != null) {// ya existe en el sistema
            mensaje = "El cliente " + encontrado.getNombre() + " ya existe en la tienda";
            return mensaje;
        }
        nuevoCliente = new Cliente(nombre, apellido, identificacion, telefono, correo, direccion);
        listaClientes.add(nuevoCliente);
        mensaje = "El estudiante fúe registrado exitosamente";
        return mensaje;
    }


    public Cliente buscarCliente(String identificacion) {
        Cliente encontrado = null;
        for (Cliente clienteAux : listaClientes) {
            if (clienteAux.getIdentificacion().equals(identificacion)) {
                return clienteAux;
            }
        }
        return encontrado;
    }

    public String actualizarCliente(String identificacion, String nuevoNombre) {
        String mensaje = "";
        Cliente clienteEncontrado = buscarCliente(identificacion);
        if (clienteEncontrado != null) {
            clienteEncontrado.actualizarNombre(nuevoNombre);
        } else {
            mensaje = "El cliente no esta resgitardo en la tienda";
        }
        return mensaje;
    }


    public String eliminarCliente(String identificacion) {
        String mensaje = "";
        Cliente clienteEncontrado = buscarCliente(identificacion);
        if (clienteEncontrado != null) {
            boolean eliminado = eliminarClienteDeLista(clienteEncontrado);
            if (eliminado) {
                mensaje = "Cliente eliminado correctamente.";
            } else {
                mensaje = "Error al eliminar el cliente.";
            }
        } else {
            mensaje = "El cliente no está registrado en la tienda.";
        }
        return mensaje;
    }


    private boolean eliminarClienteDeLista(Cliente cliente) {
        return listaClientes.remove(cliente);
    }


    //Producto


    public String registarProducto(String nombre, String codigo, String categoria, double precio, Integer stock) {
        String mensaje = "";
        Producto productoEncontrado = null;
        productoEncontrado = buscarProducto(codigo);

        if (productoEncontrado != null) {
            mensaje = "Ya existe";
        } else {
            Producto productoNuevo = new Producto(nombre, codigo, categoria, precio, stock);
            listaProductos.add(productoNuevo);
            mensaje = "Producto agregado";
        }
        return mensaje;
    }

    private Producto buscarProducto(String codigo) {
        Producto encontrado = null;
        for (Producto productoAux : listaProductos) {
            if (productoAux.getCodigo().equals(codigo)) {
                return productoAux;
            }
        }
        return encontrado;
    }


    public String actualizarProducto(String codigo, double nuevoPrecio) {
        String mensaje = "";
        Producto productoEncontrado = buscarProducto(codigo);
        if (productoEncontrado != null) {
            mensaje = String.valueOf(productoEncontrado.actualizarPrecio(nuevoPrecio));
        } else {
            mensaje = "El producto con el codigo no esta resgitardo en la tienda";
        }
        return mensaje;
    }


    public String eliminarProducto(String codigo) {
        String mensaje = "";
        Producto productoEncontrado = buscarProducto(codigo);
        if (productoEncontrado != null) {
            boolean eliminado = eliminarProductoDeLista(productoEncontrado);
            if (eliminado) {
                mensaje = "producto eliminado correctamente.";
            } else {
                mensaje = "Error al eliminar el producto.";
            }
        } else {
            mensaje = "El producto no está registrado en la tienda.";
        }
        return mensaje;
    }


    private boolean eliminarProductoDeLista(Producto producto) {
        return listaProductos.remove(producto);
    }

    //Venta
    public String registrarVenta(String fecha, String total, Integer cantidadComprada, ArrayList<DetalleDeVenta> listaDetalleVentas) {
        // Validaciones básicas antes de procesar la venta
        if (fecha == null || fecha.isEmpty()) return "Error: La fecha no puede estar vacía.";
        if (total == null || total.isEmpty()) return "Error: El total no puede estar vacío.";
        if (cantidadComprada == null || cantidadComprada <= 0) return "Error: La cantidad comprada debe ser mayor a 0.";
        if (listaDetalleVentas == null || listaDetalleVentas.isEmpty()) return "Error: La venta debe tener al menos un producto.";

        StringBuilder mensaje = new StringBuilder("📌 Registrando venta...\n");

        // Validamos cada detalle de la venta
        for (DetalleDeVenta detalle : listaDetalleVentas) {
            if (detalle.getCantidad() <= 0) return "Error: Un producto tiene cantidad inválida.";
            if (detalle.getSubtotal() <= 0) return "Error: Un producto tiene subtotal inválido.";

            mensaje.append("🛒 Producto - Cantidad: ").append(detalle.getCantidad())
                    .append(", Subtotal: $").append(detalle.getSubtotal()).append("\n");
        }

        // Registrar la venta en la lista
        Venta nuevaVenta = new Venta(fecha, total, cantidadComprada, listaDetalleVentas);
        listaVentas.add(nuevaVenta);

        mensaje.append("✅ Venta registrada con éxito.\n");
        return mensaje.toString();
    }




    //mostrar clientes y productos
    public void mostrarClientesEnConsola() {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes Registrados:\n");
            for (Cliente clienteAux : listaClientes) {
                System.out.println(clienteAux + "\n-------------------------");
            }
        }
    }


    public void mostrarProductosEnConsola() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("Productos Registrados:\n");
            for (Producto productoAux : listaProductos) {
                System.out.println(productoAux + "\n-------------------------");
            }
        }
    }

    public void mostrarVentas() {
        if (listaVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
            return;
        }

        System.out.println("\n===== LISTA DE VENTAS REGISTRADAS =====");
        for (Venta venta : listaVentas) {
            System.out.println(venta);
            System.out.println("-------------------------------------");
        }
    }


}


