/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07.ejercicio2;

/**
 *
 * @author nicol
 */

public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(3.2);

        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}
