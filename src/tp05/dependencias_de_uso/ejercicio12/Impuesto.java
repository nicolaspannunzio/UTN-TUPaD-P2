/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp05.dependencias_de_uso.ejercicio12;

public class Impuesto {
    private Contribuyente contribuyente;

    public Impuesto(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
}

