/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio04;

/**
 *
 * @author nicol
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 4: TARJETA DE CREDITO - CLIENTE - BANCO ===\n");
        
        // Crear bancos (pueden existir independientemente)
        Banco banco1 = new Banco("Banco Nacion", "30-54565789-2");
        Banco banco2 = new Banco("Banco Santander", "30-50000347-4");
        Banco banco3 = new Banco("Banco Galicia", "30-50000135-8");
        
        // Crear clientes
        Cliente cliente1 = new Cliente("Ana Martinez", "12345678");
        Cliente cliente2 = new Cliente("Carlos Rodriguez", "87654321");
        
        // Crear tarjetas de credito
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4567-8901-2345-6789", "12/2028");
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito("5432-1098-7654-3210", "08/2027");
        
        // Establecer relacion de agregacion (TarjetaDeCredito -> Banco)
        tarjeta1.setBanco(banco1);
        tarjeta2.setBanco(banco2);
        
        // Establecer relacion bidireccional (TarjetaDeCredito <-> Cliente)
        tarjeta1.setCliente(cliente1);
        tarjeta2.setCliente(cliente2);
        
        // Verificar las relaciones
        System.out.println("=== INFORMACION DE LAS TARJETAS ===");
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);
        
        System.out.println("\n=== INFORMACION DE LOS CLIENTES ===");
        System.out.println(cliente1);
        System.out.println("Tarjeta: " + cliente1.getTarjeta().getNumero());
        System.out.println(cliente2);
        System.out.println("Tarjeta: " + cliente2.getTarjeta().getNumero());
        
        System.out.println("\n=== INFORMACION DE LOS BANCOS ===");
        System.out.println(banco1);
        System.out.println(banco2);
        System.out.println(banco3); // Banco sin tarjetas asignadas
        
        System.out.println("\n=== DEMOSTRANDO ASOCIACION BIDIRECCIONAL ===");
        System.out.println("La tarjeta conoce al cliente Y el cliente conoce su tarjeta\n");
        
        System.out.println("Desde la tarjeta:");
        System.out.println("• Tarjeta " + tarjeta1.getNumero().substring(15) + " -> Cliente: " + tarjeta1.getCliente().getNombre());
        System.out.println("• Tarjeta " + tarjeta2.getNumero().substring(15) + " -> Cliente: " + tarjeta2.getCliente().getNombre());
        
        System.out.println("\nDesde el cliente:");
        System.out.println("• Cliente " + cliente1.getNombre() + " -> Tarjeta: " + cliente1.getTarjeta().getNumero().substring(15));
        System.out.println("• Cliente " + cliente2.getNombre() + " -> Tarjeta: " + cliente2.getTarjeta().getNumero().substring(15));
        
        System.out.println("\n=== DEMOSTRANDO AGREGACION ===");
        System.out.println("Los bancos pueden existir independientemente de las tarjetas");
        
        System.out.println("\nCambiando banco de la tarjeta de " + cliente1.getNombre() + "...");
        System.out.println("Banco anterior: " + tarjeta1.getBanco().getNombre());
        
        // Cambiar banco (agregacion permite esto)
        tarjeta1.setBanco(banco3);
        System.out.println("Nuevo banco: " + tarjeta1.getBanco().getNombre());
        
        // El banco original sigue existiendo
        System.out.println("Banco original sigue existiendo: " + banco1);
        
        System.out.println("\n=== CAMBIO DE CLIENTE (BIDIRECCIONAL) ===");
        System.out.println("Intercambiando clientes de las tarjetas...");
        
        System.out.println("Antes del cambio:");
        System.out.println("• Tarjeta 1: " + tarjeta1.getCliente().getNombre());
        System.out.println("• Tarjeta 2: " + tarjeta2.getCliente().getNombre());
        
        // Cambiar clientes - SOLUCION: primero desconectar, luego reconectar
        Cliente clienteTemp = tarjeta1.getCliente();
        Cliente cliente2Temp = tarjeta2.getCliente();
        
        // Desconectar ambas relaciones primero
        tarjeta1.setCliente(null);
        tarjeta2.setCliente(null);
        
        // Ahora reconectar de forma cruzada
        tarjeta1.setCliente(cliente2Temp);
        tarjeta2.setCliente(clienteTemp);
        
        System.out.println("\nDespues del cambio:");
        System.out.println("• Tarjeta 1: " + tarjeta1.getCliente().getNombre());
        System.out.println("• Tarjeta 2: " + tarjeta2.getCliente().getNombre());
        
        System.out.println("\nVerificacion desde los clientes:");
        System.out.println("• " + cliente1.getNombre() + " ahora tiene tarjeta: " + cliente1.getTarjeta().getNumero().substring(15));
        System.out.println("• " + cliente2.getNombre() + " ahora tiene tarjeta: " + cliente2.getTarjeta().getNumero().substring(15));
    }
}