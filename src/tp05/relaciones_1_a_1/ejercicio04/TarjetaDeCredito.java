/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio04;

/**
 *
 * @author nicol
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;    // Asociacion bidireccional
    private Banco banco;        // Agregacion
    
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    // Metodo para establecer la relacion bidireccional con cliente
    public void setCliente(Cliente cliente) {
        // Si ya tenia un cliente, le quitamos la referencia
        if (this.cliente != null) {
            this.cliente.setTarjeta(null);
        }
        
        this.cliente = cliente;
        
        // Establecemos la relacion bidireccional
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }
    
    // Getters y setters
    public String getNumero() { 
        return numero; 
    }
    
    public void setNumero(String numero) { 
        this.numero = numero; 
    }
    
    public String getFechaVencimiento() { 
        return fechaVencimiento; 
    }
    
    public void setFechaVencimiento(String fechaVencimiento) { 
        this.fechaVencimiento = fechaVencimiento; 
    }
    
    public Cliente getCliente() { 
        return cliente; 
    }
    
    public Banco getBanco() { 
        return banco; 
    }
    
    public void setBanco(Banco banco) { 
        this.banco = banco; 
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', fechaVencimiento='" + fechaVencimiento + 
               "', cliente=" + (cliente != null ? cliente.getNombre() : "sin cliente") + 
               ", banco=" + (banco != null ? banco.getNombre() : "sin banco") + "}";
    }
}
