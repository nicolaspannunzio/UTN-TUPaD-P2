/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_creacion.ejercicio14;

/**
 *
 * @author nicol
 */
public class Render {
    private String formato;
    private Proyecto proyecto;
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    
    public void renderizar() {
        System.out.println("=== RENDERIZANDO ===");
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duracion: " + proyecto.getDuracionMin() + " min");
        System.out.println("Formato: " + formato);
        System.out.println("Render completado exitosamente!");
        System.out.println("====================");
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public Proyecto getProyecto() {
        return proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}