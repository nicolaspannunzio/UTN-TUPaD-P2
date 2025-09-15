/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_creacion.ejercicio13;

/**
 *
 * @author nicol
 */

public class GeneradorQR {
    
    // DEPENDENCIA DE CREACIÓN: crea CódigoQR dentro del método pero NO lo guarda
    public void generar(String valor, Usuario usuario) {
        if (valor == null || valor.trim().isEmpty()) {
            System.out.println(" Error: El valor no puede estar vacío");
            return;
        }
        
        if (usuario == null) {
            System.out.println(" Error: El usuario no puede ser nulo");
            return;
        }
        
        System.out.println("   Iniciando generación de código QR...");
        System.out.println("   Procesando valor: " + valor);
        System.out.println("   Para usuario: " + usuario.getNombre());
        
        // DEPENDENCIA DE CREACIÓN: Aquí se crea el CódigoQR
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        // Simulamos el procesamiento del QR
        System.out.println("️ Generando matriz QR...");
        System.out.println("️ Codificando información...");
        System.out.println("️ Aplicando corrección de errores...");
        
        // Mostramos la información del QR creado
        codigoQR.mostrarInfo();
        
        // Simulamos que se guarda o se envía (pero no se almacena en GeneradorQR)
        System.out.println(" Código QR generado exitosamente");
        System.out.println(" QR guardado en sistema");
        System.out.println(" QR enviado a: " + usuario.getEmail());
        
        // IMPORTANTE: El CódigoQR no se guarda como atributo de GeneradorQR
        // Al finalizar el método, la referencia local 'codigoQR' desaparece
    }
    
    // Método adicional para mostrar estadísticas
    public void mostrarEstadisticas() {
        System.out.println(" GeneradorQR - Estadísticas:");
        System.out.println("   • Sistema activo y funcionando");
        System.out.println("   • Listo para generar códigos QR");
        System.out.println("   • No mantiene historial de códigos generados");
    }
}