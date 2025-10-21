/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio2;

/**
 *
 * @author nicol
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {
        libros.add(l);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        libros.forEach(Libro::mostrarInfo);
    }

    public Libro buscarPorCodigo(String codigo) {
        for (Libro l : libros) {
            if (l.getCodigo().equalsIgnoreCase(codigo)) return l;
        }
        return null;
    }

    public boolean eliminarLibro(String codigo) {
        Libro l = buscarPorCodigo(codigo);
        if (l != null) {
            libros.remove(l);
            return true;
        }
        return false;
    }

    public List<Libro> filtrarPorGenero(GeneroLibro genero) {
        return libros.stream()
                .filter(l -> l.getGenero() == genero)
                .collect(Collectors.toList());
    }

    public void prestarLibro(String codigo) {
        Libro l = buscarPorCodigo(codigo);
        if (l != null && l.isDisponible()) {
            l.setDisponible(false);
            System.out.println("✅ Libro prestado: " + l.getTitulo());
        } else {
            System.out.println("❌ No disponible o no encontrado.");
        }
    }

    public void devolverLibro(String codigo) {
        Libro l = buscarPorCodigo(codigo);
        if (l != null && !l.isDisponible()) {
            l.setDisponible(true);
            System.out.println("📗 Libro devuelto: " + l.getTitulo());
        } else {
            System.out.println("⚠️ El libro ya estaba disponible o no existe.");
        }
    }

    public List<Libro> filtrarPorAutor(String autor) {
        return libros.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public List<Libro> filtrarPorAnio(int anio) {
        return libros.stream()
                .filter(l -> l.getAnioPublicacion() == anio)
                .collect(Collectors.toList());
    }

    public Optional<Libro> obtenerMasAntiguo() {
        return libros.stream()
                .min(Comparator.comparingInt(Libro::getAnioPublicacion));
    }

    public void mostrarGeneros() {
        for (GeneroLibro g : GeneroLibro.values()) {
            System.out.printf("%s - %s%n", g.name(), g.getDescripcion());
        }
    }
}
