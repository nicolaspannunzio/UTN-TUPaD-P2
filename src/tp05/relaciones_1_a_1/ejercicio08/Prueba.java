/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio08;

/**
 * Clase de prueba
 */
public class Prueba {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nicolas", "nicolas@mail.com");
        FirmaDigital firma = new FirmaDigital("ABC123XYZ", "2025-09-23", usuario);
        Documento doc = new Documento("Contrato", "Contenido del contrato", firma);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Contenido: " + doc.getContenido());
        System.out.println("Firma hash: " + doc.getFirma().getCodigoHash());
        System.out.println("Usuario: " + doc.getFirma().getUsuario().getNombre());
    }
}
