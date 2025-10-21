/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio3;

/**
 *
 * @author nicol
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Universidad {
    private ArrayList<Estudiante> estudiantes;

    public Universidad() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        estudiantes.forEach(Estudiante::mostrarInfo);
    }

    public Estudiante buscarPorLegajo(String legajo) {
        for (Estudiante e : estudiantes) {
            if (e.getLegajo().equalsIgnoreCase(legajo)) return e;
        }
        return null;
    }

    public boolean eliminarEstudiante(String legajo) {
        Estudiante e = buscarPorLegajo(legajo);
        if (e != null) {
            estudiantes.remove(e);
            return true;
        }
        return false;
    }

    public List<Estudiante> filtrarPorCarrera(Carrera carrera) {
        return estudiantes.stream()
                .filter(e -> e.getCarrera() == carrera)
                .collect(Collectors.toList());
    }

    public Optional<Estudiante> obtenerMejorPromedio() {
        return estudiantes.stream()
                .max(Comparator.comparingDouble(Estudiante::getPromedio));
    }

    public Optional<Estudiante> obtenerPeorPromedio() {
        return estudiantes.stream()
                .min(Comparator.comparingDouble(Estudiante::getPromedio));
    }

    public double calcularPromedioGeneral() {
        if (estudiantes.isEmpty()) return 0;
        return estudiantes.stream()
                .mapToDouble(Estudiante::getPromedio)
                .average()
                .orElse(0);
    }

    public List<Estudiante> filtrarPorRangoDeEdad(int min, int max) {
        return estudiantes.stream()
                .filter(e -> e.getEdad() >= min && e.getEdad() <= max)
                .collect(Collectors.toList());
    }

    public void mostrarCarreras() {
        for (Carrera c : Carrera.values()) {
            System.out.printf("%s - %s%n", c.name(), c.getDescripcion());
        }
    }
}

