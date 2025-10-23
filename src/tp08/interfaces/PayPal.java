/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08.interfaces;

/**
 *
 * @author nicol
 */

public class PayPal implements Pago {
    private String cuenta;

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago por PayPal (" + cuenta + ") por $" + monto);
        // Simulación: siempre aprueba si monto < 50000
        return monto <= 50000;
    }
}

