/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio06;

/**
 *
 * @author nicol
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;    // Asociacion unidireccional
    private Mesa mesa;          // Agregacion
    
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // Getters y setters
    public String getFecha() { 
        return fecha; 
    }
    
    public void setFecha(String fecha) { 
        this.fecha = fecha; 
    }
    
    public String getHora() { 
        return hora; 
    }
    
    public void setHora(String hora) { 
        this.hora = hora; 
    }
    
    public Cliente getCliente() { 
        return cliente; 
    }
    
    public void setCliente(Cliente cliente) { 
        this.cliente = cliente; 
    }
    
    public Mesa getMesa() { 
        return mesa; 
    }
    
    public void setMesa(Mesa mesa) { 
        this.mesa = mesa; 
    }
    
    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora + 
               "', cliente=" + (cliente != null ? cliente.getNombre() : "sin cliente") + 
               ", mesa=" + (mesa != null ? "Mesa " + mesa.getNumero() : "sin mesa") + "}";
    }
}