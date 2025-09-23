/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio06;

/**
 *
 * @author nicol
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 6: RESERVA - CLIENTE - MESA ===\n");
        
        // Crear clientes
        Cliente cliente1 = new Cliente("Roberto Silva", "011-4567-8901");
        Cliente cliente2 = new Cliente("Carmen Lopez", "011-2345-6789");
        Cliente cliente3 = new Cliente("Diego Martinez", "011-8901-2345");
        
        // Crear mesas (pueden existir independientemente)
        Mesa mesa1 = new Mesa(1, 4);
        Mesa mesa2 = new Mesa(2, 2);
        Mesa mesa3 = new Mesa(3, 6);
        Mesa mesa4 = new Mesa(4, 8);
        
        // Crear reservas
        Reserva reserva1 = new Reserva("2024-03-15", "20:00");
        Reserva reserva2 = new Reserva("2024-03-15", "21:30");
        Reserva reserva3 = new Reserva("2024-03-16", "19:00");
        
        // Establecer relaciones unidireccionales (Reserva -> Cliente)
        reserva1.setCliente(cliente1);
        reserva2.setCliente(cliente2);
        reserva3.setCliente(cliente3);
        
        // Establecer relaciones de agregacion (Reserva -> Mesa)
        reserva1.setMesa(mesa1);
        reserva2.setMesa(mesa2);
        reserva3.setMesa(mesa3);
        
        // Verificar las relaciones
        System.out.println("=== INFORMACION DE LAS RESERVAS ===");
        System.out.println(reserva1);
        System.out.println(reserva2);
        System.out.println(reserva3);
        
        System.out.println("\n=== DEMOSTRANDO ASOCIACION UNIDIRECCIONAL ===");
        System.out.println("La reserva conoce al cliente, pero el cliente NO conoce sus reservas\n");
        
        System.out.println("Informacion desde las reservas:");
        System.out.println(" Reserva del " + reserva1.getFecha() + " a las " + reserva1.getHora() + " -> " + reserva1.getCliente().getNombre() + " (" + reserva1.getCliente().getTelefono() + ")");
        System.out.println(" Reserva del " + reserva2.getFecha() + " a las " + reserva2.getHora() + " -> " + reserva2.getCliente().getNombre() + " (" + reserva2.getCliente().getTelefono() + ")");
        System.out.println(" Reserva del " + reserva3.getFecha() + " a las " + reserva3.getHora() + " -> " + reserva3.getCliente().getNombre() + " (" + reserva3.getCliente().getTelefono() + ")");
        
        System.out.println("\nInformacion de los clientes (NO conocen sus reservas):");
        System.out.println(" " + cliente1); // Solo muestra datos del cliente, no las reservas
        System.out.println(" " + cliente2);
        System.out.println(" " + cliente3);
        
        System.out.println("\n=== DEMOSTRANDO AGREGACION ===");
        System.out.println("Las mesas pueden existir independientemente de las reservas");
        
        System.out.println("\nInformacion desde las reservas:");
        System.out.println("• " + reserva1.getCliente().getNombre() + " -> Mesa " + reserva1.getMesa().getNumero() + " (capacidad: " + reserva1.getMesa().getCapacidad() + ")");
        System.out.println("• " + reserva2.getCliente().getNombre() + " -> Mesa " + reserva2.getMesa().getNumero() + " (capacidad: " + reserva2.getMesa().getCapacidad() + ")");
        System.out.println("• " + reserva3.getCliente().getNombre() + " -> Mesa " + reserva3.getMesa().getNumero() + " (capacidad: " + reserva3.getMesa().getCapacidad() + ")");
        
        System.out.println("\nTodas las mesas del restaurant (existen independientemente):");
        System.out.println("• " + mesa1);
        System.out.println("• " + mesa2);
        System.out.println("• " + mesa3);
        System.out.println("• " + mesa4 + " (disponible - sin reserva)");
        
        System.out.println("\n=== CAMBIO DE MESA (AGREGACION) ===");
        System.out.println("Cambiando mesa de la reserva de " + reserva1.getCliente().getNombre() + "...");
        System.out.println("Mesa anterior: " + reserva1.getMesa().getNumero());
        
        // Cambiar mesa (agregacion permite esto)
        reserva1.setMesa(mesa4);
        System.out.println("Nueva mesa: " + reserva1.getMesa().getNumero() + " (capacidad: " + reserva1.getMesa().getCapacidad() + ")");
        
        // La mesa original sigue existiendo y disponible
        System.out.println("Mesa original sigue existiendo y disponible: " + mesa1);
        
        System.out.println("\n=== REASIGNACION DE CLIENTE (UNIDIRECCIONAL) ===");
        System.out.println("Cambiando cliente de una reserva...");
        System.out.println("Cliente anterior de la reserva del " + reserva2.getFecha() + ": " + reserva2.getCliente().getNombre());
        
        reserva2.setCliente(cliente1);
        System.out.println("Nuevo cliente: " + reserva2.getCliente().getNombre());
        
        // El cliente original sigue existiendo (no sabia de la reserva de todos modos)
        System.out.println("Cliente original sigue existiendo: " + cliente2.getNombre());
        
        System.out.println("\n=== SIMULACION DE RESTAURANT ===");
        System.out.println("Estado actual de las reservas:");
        System.out.println(" " + reserva1.getFecha() + " " + reserva1.getHora() + " - " + reserva1.getCliente().getNombre() + " - Mesa " + reserva1.getMesa().getNumero());
        System.out.println(" " + reserva2.getFecha() + " " + reserva2.getHora() + " - " + reserva2.getCliente().getNombre() + " - Mesa " + reserva2.getMesa().getNumero());
        System.out.println(" " + reserva3.getFecha() + " " + reserva3.getHora() + " - " + reserva3.getCliente().getNombre() + " - Mesa " + reserva3.getMesa().getNumero());
        
        System.out.println("\nMesas disponibles:");
        System.out.println("• Mesa " + mesa1.getNumero() + " (capacidad: " + mesa1.getCapacidad() + ") - LIBRE");
        
        System.out.println("\n=== CARACTERISTICAS DE LAS RELACIONES ===");
        System.out.println(" ASOCIACION UNIDIRECCIONAL: Solo la reserva conoce al cliente");
        System.out.println(" AGREGACION: Las mesas existen independientemente de las reservas");
        System.out.println(" FLEXIBILIDAD: Se pueden cambiar mesas y clientes de las reservas");
    }
}
