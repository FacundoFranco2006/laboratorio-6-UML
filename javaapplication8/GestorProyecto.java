/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author mecha
 */

// Clase que representa a un gestor de proyecto, hereda de Empleado e implementa IGestorProyecto
public class GestorProyecto extends Empleado implements IGestorProyecto {
    public GestorProyecto(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public void realizarTrabajo() {
        super.realizarTrabajo();
        gestionarProyecto();
    }

    @Override
    public void gestionarProyecto() {
        System.out.println(nombre + " está gestionando el proyecto.");
    }
}