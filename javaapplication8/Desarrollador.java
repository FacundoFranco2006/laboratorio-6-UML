/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author mecha
 */
// Clase que representa a un desarrollador, hereda de Empleado e implementa IDesarrollador
public class Desarrollador extends Empleado implements IDesarrollador {
    public Desarrollador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public void realizarTrabajo() {
         super.realizarTrabajo();
        escribirCodigo();
    }

    @Override
    public void escribirCodigo() {
        System.out.println(nombre + " está escribiendo código.");
    }
}