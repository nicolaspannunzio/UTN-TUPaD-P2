/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08.interfaces;

/**
 *
 * @author nicol
 */

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado; // ejemplo: "CREADO", "PAGADO", "ENVIADO"

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "CREADO";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularTotal();
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificar al cliente del cambio
        if (cliente != null) {
            cliente.notificar("Su pedido cambió a estado: " + nuevoEstado);
        }
    }

    public void mostrarProductos() {
        System.out.println("Productos en pedido:");
        for (Producto p : productos) System.out.println(" - " + p);
    }
}

