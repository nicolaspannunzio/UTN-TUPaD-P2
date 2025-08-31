/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class Gallina {
    // ATRIBUTOS PRIVADOS
    private int idGallina;
    private int edad;           // En meses
    private int huevosPuestos;
    
    // CONSTRUCTOR
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // Inicia sin huevos puestos
    }
    
    // MÉTODOS PÚBLICOS
    
    /**
     * Simula que la gallina pone un huevo
     * Solo puede poner huevos si tiene al menos 6 meses de edad
     */
    public void ponerHuevo() {
        if (edad >= 6) {
            huevosPuestos++;
            System.out.println(" La gallina #" + idGallina + " puso un huevo!");
            System.out.println("   Total de huevos puestos: " + huevosPuestos);
        } else {
            System.out.println(" La gallina #" + idGallina + " es muy joven para poner huevos.");
            System.out.println("   Necesita al menos 6 meses. Edad actual: " + edad + " meses");
        }
    }
    
    /**
     * Simula el envejecimiento de la gallina (aumenta 1 mes de edad)
     */
    public void envejecer() {
        edad++;
        System.out.println(" La gallina #" + idGallina + " envejeció 1 mes.");
        System.out.println("   Nueva edad: " + edad + " meses");
        
        // Mensaje especial cuando alcanza la edad reproductiva
        if (edad == 6) {
            System.out.println(" ¡La gallina #" + idGallina + " ya puede poner huevos!");
        }
    }
    
    /**
     * Muestra el estado completo de la gallina
     */
    public void mostrarEstado() {
        System.out.println("=== Estado de la Gallina #" + idGallina + " ===");
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " meses");
        System.out.println("Huevos puestos: " + huevosPuestos);
        
        // Estado reproductivo
        if (edad >= 6) {
            System.out.println("Estado: Adulta (puede poner huevos)");
        } else {
            System.out.println("Estado: Joven (faltan " + (6 - edad) + " meses para poner huevos)");
        }
        
        // Productividad
        if (huevosPuestos == 0) {
            System.out.println("Productividad: Sin producción");
        } else if (huevosPuestos < 10) {
            System.out.println("Productividad: Baja");
        } else if (huevosPuestos < 50) {
            System.out.println("Productividad: Media");
        } else {
            System.out.println("Productividad: Alta");
        }
        
        System.out.println("=====================================");
    }
    
    // GETTERS para acceso controlado a los atributos
    public int getIdGallina() {
        return idGallina;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
}
