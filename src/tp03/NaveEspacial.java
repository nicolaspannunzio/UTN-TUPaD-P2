/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
// Clase que representa una nave espacial
public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private int capacidadMaxima;
    private int consumoPorUnidad;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial, int capacidadMaxima, int consumoPorUnidad) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.consumoPorUnidad = consumoPorUnidad;

        // Validacion para que el combustible inicial no supere la capacidad ni sea negativo
        if (combustibleInicial < 0) {
            this.combustible = 0;
        } else if (combustibleInicial > capacidadMaxima) {
            this.combustible = capacidadMaxima;
        } else {
            this.combustible = combustibleInicial;
        }
    }

    // Metodo para despegar (no consume combustible en este ejemplo)
    public void despegar() {
        System.out.println("[" + nombre + "] ha despegado con exito.");
    }

    // Metodo para avanzar una distancia determinada
    public void avanzar(int distancia) {
        int requerido = distancia * consumoPorUnidad;
        if (combustible < requerido) {
            System.out.println("[" + nombre + "] no tiene suficiente combustible. "
                + "Necesita " + requerido + ", disponible " + combustible + ".");
        } else {
            combustible -= requerido;
            System.out.println("[" + nombre + "] avanzo " + distancia 
                + " unidades. Combustible restante: " + combustible + ".");
        }
    }

    // Metodo para recargar combustible sin pasarse de la capacidad maxima
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("[" + nombre + "] la cantidad a recargar debe ser mayor a 0.");
            return;
        }
        combustible += cantidad;
        if (combustible > capacidadMaxima) {
            combustible = capacidadMaxima;
        }
        System.out.println("[" + nombre + "] recargo combustible. Ahora tiene " + combustible + ".");
    }

    // Metodo para mostrar el estado actual de la nave
    public void mostrarEstado() {
        System.out.println("Estado de la nave " + nombre + ":");
        System.out.println(" - Combustible: " + combustible + "/" + capacidadMaxima);
    }
}

