/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio09;

/**
 * Clase de prueba
 */
public class Prueba {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan Perez", "OSDE");
        Profesional profesional = new Profesional("Dra. Lopez", "Cardiologia");
        CitaMedica cita = new CitaMedica("2025-10-01", "15:30", paciente, profesional);

        System.out.println("Cita Medica:");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
    }
}

