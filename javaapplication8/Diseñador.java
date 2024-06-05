/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author mecha
 */
public class Diseñador extends Empleado {
    public Diseñador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public void realizarTrabajo() {
         super.realizarTrabajo();
        diseñarInterfaces();
    }

    public void diseñarInterfaces() {
        System.out.println(nombre + " está diseñando interfaces.");
    }
}