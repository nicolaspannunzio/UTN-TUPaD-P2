/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio3;

/**
 *
 * @author nicol
 */

public enum Carrera {
    INGENIERIA("Carrera de Ingeniería en Sistemas"),
    MEDICINA("Carrera de Medicina"),
    DERECHO("Carrera de Derecho"),
    ARQUITECTURA("Carrera de Arquitectura"),
    LITERATURA("Carrera de Literatura");

    private final String descripcion;

    Carrera(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

