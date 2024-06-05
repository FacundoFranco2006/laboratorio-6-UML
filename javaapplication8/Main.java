/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mecha
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de desarrollador, diseñador y gestor de proyecto
        Empleado desarrollador = new Desarrollador(1, "Alice", 50000);
        Empleado diseñador = new Diseñador(2, "Bob", 45000);
        Empleado gerente = new GestorProyecto(3, "Charlie", 60000);

        // Crear una lista de empleados y añadir los empleados creados
        desarrollador.realizarTrabajo();
        diseñador.realizarTrabajo();
        gerente.realizarTrabajo();
        // Crear un proyecto y asignar la lista de empleados
        Proyecto proyecto = new Proyecto("Proyecto A", Arrays.asList(desarrollador, diseñador, gerente));

        // Realizar los trabajos de todos los empleados del proyecto
        proyecto.realizarTrabajo();
    }
}