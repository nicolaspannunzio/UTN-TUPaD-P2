/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_creacion.ejercicio13;

/**
 *
 * @author nicol
 */

public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional
    
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    // Getters y setters
    public String getValor() { 
        return valor; 
    }
    
    public void setValor(String valor) { 
        this.valor = valor; 
    }
    
    public Usuario getUsuario() { 
        return usuario; 
    }
    
    public void setUsuario(Usuario usuario) { 
        this.usuario = usuario; 
    }
    
    // Método para mostrar la información del QR
    public void mostrarInfo() {
        System.out.println("📱 Código QR generado:");
        System.out.println("   Valor: " + valor);
        System.out.println("   Para usuario: " + usuario.getNombre());
        System.out.println("   Email: " + usuario.getEmail());
    }
    
    @Override
    public String toString() {
        return "CodigoQR{valor='" + valor + "', usuario=" + usuario.getNombre() + "}";
    }
}