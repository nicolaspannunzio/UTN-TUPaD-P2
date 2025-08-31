/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */

// Clase de prueba para la NaveEspacial
public class TestNaveEspacial {
    public static void main(String[] args) {
        // Crear una nave con 50 de combustible, capacidad maxima 100 y consumo 1 por unidad
        NaveEspacial nave = new NaveEspacial("Apollo", 50, 100, 1);

        // Paso 1: despegar
        nave.despegar();

        // Paso 2: intentar avanzar 60 unidades (fallara por falta de combustible)
        nave.avanzar(60);

        // Paso 3: recargar 20 unidades
        nave.recargarCombustible(20);

        // Paso 4: intentar avanzar 60 unidades de nuevo (ahora si alcanza)
        nave.avanzar(60);

        // Paso 5: mostrar el estado final
        nave.mostrarEstado();
    }
}

