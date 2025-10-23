/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08.interfaces;

/**
 *
 * @author nicol
 */

public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    @Override
    public void notificar(String mensaje) {
        // En un sistema real enviarías un email; acá simulamos con println
        System.out.println("Notificación a " + nombre + " (" + email + "): " + mensaje);
    }
}

