/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08.interfaces;

/**
 *
 * @author nicol
 */

public class TarjetaCredito implements Pago, PagoConDescuento {
    private String titular;
    private String numero;

    public TarjetaCredito(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    @Override
    public boolean procesarPago(double monto) {
        // Simulación: aprobamos si monto < 100000 (ejemplo)
        System.out.println("Procesando pago con tarjeta de " + titular + " por $" + monto);
        return monto <= 100000;
    }

    @Override
    public double aplicarDescuento(double monto, double porcentaje) {
        double resultado = monto - (monto * porcentaje / 100.0);
        System.out.println("Aplicando descuento del " + porcentaje + "% con tarjeta. Total: $" + resultado);
        return resultado;
    }
}

