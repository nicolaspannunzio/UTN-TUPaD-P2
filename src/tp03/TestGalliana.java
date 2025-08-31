/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class TestGalliana {
    public static void main(String[] args) {
        System.out.println(" === BIENVENIDO A LA GRANJA DIGITAL === \n");
        
        // Crear dos gallinas con diferentes edades
        Gallina gallina1 = new Gallina(001, 4);  // Joven, no puede poner huevos aún
        Gallina gallina2 = new Gallina(002, 8);  // Adulta, ya puede poner huevos
        
        // Mostrar estado inicial
        System.out.println(" ESTADO INICIAL DE LAS GALLINAS:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println("\n === SIMULACIÓN DIA 1 === 🌅");
        
        // Intentar que ambas pongan huevos
        System.out.println("\n Intentando que las gallinas pongan huevos:");
        gallina1.ponerHuevo();  // No podrá porque es joven
        gallina2.ponerHuevo();  // Sí podrá
        
        System.out.println("\n === PASAN 2 MESES === ⏰");
        
        // Envejecer las gallinas
        System.out.println("\n Envejeciendo gallinas:");
        gallina1.envejecer();
        gallina1.envejecer(); // Ahora tendrá 6 meses
        
        gallina2.envejecer();
        gallina2.envejecer(); // Ahora tendrá 10 meses
        
        System.out.println("\n Intentando poner huevos después del crecimiento:");
        gallina1.ponerHuevo();  // Ahora sí podrá
        gallina2.ponerHuevo();  // Seguirá pudiendo
        
        System.out.println("\n === SIMULACIÓN DE PRODUCCIÓN === ");
        
        // Simular varios días de producción para la gallina 2
        System.out.println("\n Simulando 1 semana de producción (gallina #002):");
        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("--- Día " + dia + " ---");
            gallina2.ponerHuevo();
        }
        
        // Más producción para demostrar niveles de productividad
        System.out.println("\n Simulando más producción:");
        for (int i = 0; i < 15; i++) {
            gallina2.ponerHuevo();
        }
        
        System.out.println("\n === ESTADO FINAL DE LA GRANJA ===");
        
        // Estados finales
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // Resumen de la granja
        System.out.println("\n === RESUMEN DE LA GRANJA ===");
        System.out.println("Total de gallinas: 2");
        System.out.println("Producción total: " + 
            (gallina1.getHuevosPuestos() + gallina2.getHuevosPuestos()) + " huevos");
        System.out.println("Gallina más productiva: #" + 
            (gallina1.getHuevosPuestos() > gallina2.getHuevosPuestos() ? 
             gallina1.getIdGallina() : gallina2.getIdGallina()));
        
        System.out.println("\n ¡Simulación de granja completada exitosamente!");
    }
}
