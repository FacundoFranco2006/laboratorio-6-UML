/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mecha
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de desarrollador, diseñador y gestor de proyecto
        Desarrollador dev1 = new Desarrollador(1, "Alice", 50000);
        Diseñador dis1 = new Diseñador(2, "Bob", 45000);
        GestorProyecto gp1 = new GestorProyecto(3, "Charlie", 60000);

        // Crear una lista de empleados y añadir los empleados creados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(dev1);
        empleados.add(dis1);
        empleados.add(gp1);

        // Crear un proyecto y asignar la lista de empleados
        Proyecto proyecto = new Proyecto("Proyecto A", empleados);

        // Realizar los trabajos de todos los empleados del proyecto
        proyecto.realizarTrabajo();
    }
}