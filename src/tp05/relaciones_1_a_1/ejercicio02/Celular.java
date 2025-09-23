/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio02;

/**
 *
 * @author nicol
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;    // Asociacion bidireccional
    private Bateria bateria;    // Agregacion
    
    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Metodo para establecer la relacion bidireccional con usuario
    public void setUsuario(Usuario usuario) {
        // Si ya tenia un usuario, le quitamos la referencia
        if (this.usuario != null) {
            this.usuario.setCelular(null);
        }
        
        this.usuario = usuario;
        
        // Establecemos la relacion bidireccional
        if (usuario != null) {
            usuario.setCelular(this);
        }
    }
    
    // Getters y setters
    public String getImei() { 
        return imei; 
    }
    
    public void setImei(String imei) { 
        this.imei = imei; 
    }
    
    public String getMarca() { 
        return marca; 
    }
    
    public void setMarca(String marca) { 
        this.marca = marca; 
    }
    
    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    
    public Usuario getUsuario() { 
        return usuario; 
    }
    
    public Bateria getBateria() { 
        return bateria; 
    }
    
    public void setBateria(Bateria bateria) { 
        this.bateria = bateria; 
    }
    
    @Override
    public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo + 
               "', usuario=" + (usuario != null ? usuario.getNombre() : "sin usuario") + 
               ", bateria=" + (bateria != null ? bateria.getModelo() : "sin bateria") + "}";
    }
}
