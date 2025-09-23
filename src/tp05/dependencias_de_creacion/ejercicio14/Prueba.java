/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_creacion.ejercicio14;

/**
 *
 * @author nicol
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA EJERCICIO 14 ===");
        System.out.println("Dependencia de creacion: EditorVideo -> Render");
        System.out.println("Asociacion unidireccional: Render -> Proyecto");
        System.out.println();
        
        Proyecto proyecto1 = new Proyecto("Documental de Vida Marina", 90);
        Proyecto proyecto2 = new Proyecto("Cortometraje Artistico", 45);
        
        EditorVideo editor = new EditorVideo("Adobe Premiere Pro 2024");
        
        System.out.println(">>> Exportando proyecto 1 en formato MP4:");
        editor.exportar("MP4", proyecto1);
        
        System.out.println(">>> Exportando proyecto 1 en formato AVI:");
        editor.exportar("AVI", proyecto1);
        
        System.out.println(">>> Exportando proyecto 2 en formato MOV:");
        editor.exportar("MOV", proyecto2);
        
        System.out.println("=== FIN DE LA PRUEBA ===");
    }
}
