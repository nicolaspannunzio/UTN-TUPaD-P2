/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07.ejercicio4;

/**
 *
 * @author nicol
 */

public class MainAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Toby");
        animales[1] = new Gato("Mishi");
        animales[2] = new Vaca("Lola");

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }
}

