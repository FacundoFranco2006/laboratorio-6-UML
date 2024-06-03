/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author mecha
 */

// Clase abstracta que representa un empleado genérico
public abstract class Empleado implements IEmpleado{
    protected int id;
    protected String nombre;
    protected double salario;

    // Constructor para inicializar los atributos del empleado
    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    @Override
   public void realizarTrabajo() {
        System.out.println(nombre + " está trabajando.");
    }
}