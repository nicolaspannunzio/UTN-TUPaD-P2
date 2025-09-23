/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio10;

/**
 * Clase de prueba
 */
public class Prueba {
    public static void main(String[] args) {
        Titular titular = new Titular("Ana Gomez", "30111222");
        ClaveSeguridad clave = new ClaveSeguridad("XYZ123", "2025-09-23");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 15000.50, clave, titular);

        System.out.println("Cuenta Bancaria:");
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
    }
}

