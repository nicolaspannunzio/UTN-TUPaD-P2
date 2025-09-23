/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio07;

/**
 *
 * @author nicol
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 7: VEHICULO - MOTOR - CONDUCTOR ===\n");
        
        // Crear motores (pueden existir independientemente)
        Motor motor1 = new Motor("V6 3.0L", "MT001234567");
        Motor motor2 = new Motor("V8 4.0L", "MT007891234");
        Motor motor3 = new Motor("I4 2.0L Turbo", "MT004567890");
        Motor motor4 = new Motor("V12 5.2L", "MT009876543");
        
        // Crear vehiculos
        Vehiculo vehiculo1 = new Vehiculo("ABC-123", "Ford Mustang");
        Vehiculo vehiculo2 = new Vehiculo("XYZ-789", "Chevrolet Camaro");
        Vehiculo vehiculo3 = new Vehiculo("DEF-456", "BMW M3");
        
        // Crear conductores
        Conductor conductor1 = new Conductor("Alejandro Gomez", "B-12345678");
        Conductor conductor2 = new Conductor("Valentina Ruiz", "A-87654321");
        Conductor conductor3 = new Conductor("Nicolas Fernandez", "C-13579246");
        
        // Establecer relacion de agregacion (Vehiculo -> Motor)
        vehiculo1.setMotor(motor1);
        vehiculo2.setMotor(motor2);
        vehiculo3.setMotor(motor3);
        
        // Establecer relacion bidireccional (Vehiculo <-> Conductor)
        vehiculo1.setConductor(conductor1);
        vehiculo2.setConductor(conductor2);
        // vehiculo3 queda sin conductor asignado
        
        // Verificar las relaciones
        System.out.println("=== INFORMACION DE LOS VEHICULOS ===");
        System.out.println(vehiculo1);
        System.out.println(vehiculo2);
        System.out.println(vehiculo3);
        
        System.out.println("\n=== INFORMACION DE LOS CONDUCTORES ===");
        System.out.println(conductor1);
        System.out.println("Vehiculo asignado: " + conductor1.getVehiculo().getModelo() + " (" + conductor1.getVehiculo().getPatente() + ")");
        System.out.println(conductor2);
        System.out.println("Vehiculo asignado: " + conductor2.getVehiculo().getModelo() + " (" + conductor2.getVehiculo().getPatente() + ")");
        System.out.println(conductor3);
        System.out.println("Vehiculo asignado: " + (conductor3.getVehiculo() != null ? conductor3.getVehiculo().getModelo() : "ninguno"));
        
        System.out.println("\n=== INFORMACION DE LOS MOTORES ===");
        System.out.println("Motores instalados:");
        System.out.println("• " + motor1 + " -> " + vehiculo1.getModelo());
        System.out.println("• " + motor2 + " -> " + vehiculo2.getModelo());
        System.out.println("• " + motor3 + " -> " + vehiculo3.getModelo());
        System.out.println("Motores disponibles:");
        System.out.println("• " + motor4 + " -> disponible");
        
        System.out.println("\n=== DEMOSTRANDO AGREGACION ===");
        System.out.println("Los motores pueden existir independientemente de los vehiculos");
        
        System.out.println("\nCambiando motor del " + vehiculo1.getModelo() + "...");
        System.out.println("Motor anterior: " + vehiculo1.getMotor().getTipo());
        
        // Cambiar motor (agregacion permite esto)
        Motor motorAnterior = vehiculo1.getMotor();
        vehiculo1.setMotor(motor4);
        System.out.println("Nuevo motor: " + vehiculo1.getMotor().getTipo());
        
        // El motor original sigue existiendo
        System.out.println("Motor original sigue existiendo: " + motorAnterior);
        System.out.println("Ahora esta disponible para otro vehiculo");
        
        System.out.println("\n=== DEMOSTRANDO ASOCIACION BIDIRECCIONAL ===");
        System.out.println("El vehiculo conoce al conductor Y el conductor conoce su vehiculo\n");
        
        System.out.println("Desde los vehiculos:");
        System.out.println(" " + vehiculo1.getModelo() + " -> Conductor: " + vehiculo1.getConductor().getNombre());
        System.out.println(" " + vehiculo2.getModelo() + " -> Conductor: " + vehiculo2.getConductor().getNombre());
        System.out.println(" " + vehiculo3.getModelo() + " -> Conductor: " + (vehiculo3.getConductor() != null ? vehiculo3.getConductor().getNombre() : "sin asignar"));
        
        System.out.println("\nDesde los conductores:");
        System.out.println(" " + conductor1.getNombre() + " -> " + conductor1.getVehiculo().getModelo());
        System.out.println(" " + conductor2.getNombre() + " -> " + conductor2.getVehiculo().getModelo());
        System.out.println(" " + conductor3.getNombre() + " -> " + (conductor3.getVehiculo() != null ? conductor3.getVehiculo().getModelo() : "sin vehiculo"));
        
        System.out.println("\n=== REASIGNACION DE CONDUCTOR (BIDIRECCIONAL) ===");
        System.out.println("Asignando el BMW M3 a " + conductor3.getNombre() + "...");
        
        vehiculo3.setConductor(conductor3);
        System.out.println("Nicolas ahora maneja: " + conductor3.getVehiculo().getModelo());
        System.out.println("El BMW ahora es conducido por: " + vehiculo3.getConductor().getNombre());
        
        System.out.println("\n=== INTERCAMBIO DE CONDUCTORES ===");
        System.out.println("Intercambiando conductores entre Mustang y Camaro...");
        
        System.out.println("Antes del intercambio:");
        System.out.println("• " + vehiculo1.getModelo() + " -> " + vehiculo1.getConductor().getNombre());
        System.out.println("• " + vehiculo2.getModelo() + " -> " + vehiculo2.getConductor().getNombre());
        
        // Intercambio correcto para evitar problemas con bidireccionalidad
        Conductor conductorTemp1 = vehiculo1.getConductor();
        Conductor conductorTemp2 = vehiculo2.getConductor();
        
        // Desconectar primero
        vehiculo1.setConductor(null);
        vehiculo2.setConductor(null);
        
        // Reconectar de forma cruzada
        vehiculo1.setConductor(conductorTemp2);
        vehiculo2.setConductor(conductorTemp1);
        
        System.out.println("\nDespues del intercambio:");
        System.out.println(" " + vehiculo1.getModelo() + " -> " + vehiculo1.getConductor().getNombre());
        System.out.println(" " + vehiculo2.getModelo() + " -> " + vehiculo2.getConductor().getNombre());
        
        System.out.println("\nVerificacion desde los conductores:");
        System.out.println("• " + conductor1.getNombre() + " ahora maneja: " + conductor1.getVehiculo().getModelo());
        System.out.println("• " + conductor2.getNombre() + " ahora maneja: " + conductor2.getVehiculo().getModelo());
        
        System.out.println("\n=== REUTILIZACION DE MOTOR (AGREGACION) ===");
        System.out.println("Usando el motor que quedo disponible...");
        
        // Crear nuevo vehiculo
        Vehiculo vehiculoNuevo = new Vehiculo("GHI-999", "Audi A4");
        vehiculoNuevo.setMotor(motorAnterior); // Usar el motor que quitamos del Mustang
        
        System.out.println("Nuevo vehiculo creado: " + vehiculoNuevo);
        System.out.println("Motor reutilizado: " + motorAnterior + " ahora esta en " + vehiculoNuevo.getModelo());
        
        System.out.println("\n=== RESUMEN DE RELACIONES ===");
        System.out.println(" AGREGACION (Motor): Los motores pueden cambiarse y reutilizarse");
        System.out.println(" ASOCIACION BIDIRECCIONAL (Conductor): Ambos se conocen mutuamente");
        System.out.println(" FLEXIBILIDAD: Se pueden intercambiar motores y conductores");
    }
}
