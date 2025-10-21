/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio2;

/**
 *
 * @author nicol
 */

public enum GeneroLibro {
    FICCION("Historias imaginarias o inventadas"),
    NO_FICCION("Basado en hechos reales"),
    CIENCIA("Ciencia y divulgación"),
    HISTORIA("Eventos históricos"),
    INFANTIL("Cuentos para niños");

    private final String descripcion;

    GeneroLibro(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
