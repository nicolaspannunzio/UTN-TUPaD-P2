/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_creacion.ejercicio14;

/**
 *
 * @author nicol
 */
public class EditorVideo {
    private String nombreEditor;
    
    public EditorVideo(String nombreEditor) {
        this.nombreEditor = nombreEditor;
    }
    
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("Editor: " + nombreEditor);
        System.out.println("Iniciando proceso de exportacion...");
        
        Render render = new Render(formato, proyecto);
        render.renderizar();
        
        System.out.println("Proceso de exportacion finalizado.");
        System.out.println("-----------------------------------");
    }
    
    public String getNombreEditor() {
        return nombreEditor;
    }
    
    public void setNombreEditor(String nombreEditor) {
        this.nombreEditor = nombreEditor;
    }
}
