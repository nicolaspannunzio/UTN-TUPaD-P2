/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio3;

/**
 *
 * @author nicol
 */

import java.util.List;
import java.util.Optional;

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad();

        // 1. Crear al menos cinco estudiantes
        uni.agregarEstudiante(new Estudiante("E001", "Sofía", "Martínez", 21, Carrera.INGENIERIA, 8.5));
        uni.agregarEstudiante(new Estudiante("E002", "Lucas", "Pérez", 23, Carrera.MEDICINA, 9.1));
        uni.agregarEstudiante(new Estudiante("E003", "María", "Gómez", 20, Carrera.LITERATURA, 7.4));
        uni.agregarEstudiante(new Estudiante("E004", "Tomás", "Ruiz", 22, Carrera.ARQUITECTURA, 6.8));
        uni.agregarEstudiante(new Estudiante("E005", "Lucía", "Fernández", 19, Carrera.INGENIERIA, 8.9));

        // 2. Listar estudiantes
        System.out.println("=== Lista de estudiantes ===");
        uni.listarEstudiantes();

        // 3. Buscar estudiante por legajo
        System.out.println("\n=== Buscar E002 ===");
        Estudiante encontrado = uni.buscarPorLegajo("E002");
        if (encontrado != null) encontrado.mostrarInfo();

        // 4. Filtrar por carrera
        System.out.println("\n=== Estudiantes de INGENIERIA ===");
        List<Estudiante> ing = uni.filtrarPorCarrera(Carrera.INGENIERIA);
        ing.forEach(Estudiante::mostrarInfo);

        // 5. Eliminar estudiante por legajo
        System.out.println("\n=== Eliminar E004 ===");
        uni.eliminarEstudiante("E004");
        uni.listarEstudiantes();

        // 6. Obtener mejor promedio
        System.out.println("\n=== Mejor promedio ===");
        Optional<Estudiante> mejor = uni.obtenerMejorPromedio();
        mejor.ifPresent(Estudiante::mostrarInfo);

        // 7. Obtener peor promedio
        System.out.println("\n=== Peor promedio ===");
        Optional<Estudiante> peor = uni.obtenerPeorPromedio();
        peor.ifPresent(Estudiante::mostrarInfo);

        // 8. Calcular promedio general
        System.out.println("\n=== Promedio general ===");
        System.out.printf("Promedio general: %.2f%n", uni.calcularPromedioGeneral());

        // 9. Filtrar estudiantes por rango de edad (20 a 22 años)
        System.out.println("\n=== Estudiantes entre 20 y 22 años ===");
        uni.filtrarPorRangoDeEdad(20, 22).forEach(Estudiante::mostrarInfo);

        // 10. Mostrar carreras disponibles
        System.out.println("\n=== Carreras disponibles ===");
        uni.mostrarCarreras();
    }
}

