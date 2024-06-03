/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;
import java.util.List;
/**
 *
 * @author mecha
 */
public class Proyecto {
    private String nombre;
    private List<Empleado> listaEmpleados;

    public Proyecto(String nombre, List<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    // Método para que todos los empleados del proyecto realicen su trabajo
    public void realizarTrabajo() {
        for (Empleado empleado : listaEmpleados) {
            empleado.realizarTrabajo();
        }
    }
}
