/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio01;

/**
 *
 * @author nicol
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular;    // Asociación bidireccional
    private Foto foto;          // Composición
    
    public Pasaporte(String numero, String fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // La foto se crea junto con el pasaporte (composición)
        this.foto = new Foto("foto_pasaporte_" + numero + ".jpg", "JPG");
    }
    
    // Método para establecer la relación bidireccional con titular
    public void setTitular(Titular titular) {
        // Si ya tenía un titular, le quitamos la referencia
        if (this.titular != null) {
            this.titular.setPasaporte(null);
        }
        
        this.titular = titular;
        
        // Establecemos la relación bidireccional
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
    // Getters y setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }
    
    public Titular getTitular() { return titular; }
    
    public Foto getFoto() { return foto; }
    // Nota: No hay setFoto() porque es composición - la foto nace con el pasaporte
    
    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision='" + fechaEmision + 
               "', titular=" + (titular != null ? titular.getNombre() : "sin titular") + 
               ", foto=" + foto + "}";
    }
}
