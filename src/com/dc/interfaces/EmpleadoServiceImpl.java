package com.dc.interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceImpl implements IEmpleadoService {
    private List<Empleado> empleados;

    public EmpleadoServiceImpl() {
        empleados = new ArrayList<>();
    }

    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.getNombre());
    }

    @Override
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println("ID: " + empleado.getIdEmpleado() + " Nombre: " + empleado.getNombre() + 
                "Puesto: " + empleado.getPuestoTrabajo() + "  Salario: " + empleado.getSalarioBase() +
                "IGSS: " + empleado.getIgss() + "  IRTRA: " + empleado.getIrtra() +
                "Deducciones: " + empleado.getDeducciones() + "  Bonificaciones: " + empleado.getBonificaciones());
            }
        }
    }

    @Override
    public void bajarEmpleado(int idEmpleado) {
        empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
        System.out.println("Empleado con ID " + idEmpleado + " dado de baja.");
    }

    @Override
    public double calcularIgss(Empleado empleado) {
        double igss = empleado.getSalarioBase() * 0.0483; // Ejemplo: 4.83% del salario
        empleado.setIgss(igss);
        return igss;
    }

    @Override
    public double calcularIrtra(Empleado empleado) {
        double irtra = empleado.getSalarioBase() * 0.01; // Ejemplo: 1% del salario
        empleado.setIrtra(irtra);
        return irtra;
    }

    @Override
    public void agregarBono(Empleado empleado, double bono) {
        empleado.setBonificaciones(empleado.getBonificaciones() + bono);
        System.out.println("Bono de " + bono + " agregado a " + empleado.getNombre());
    }

    @Override
    public void agregarDescuento(Empleado empleado, double descuento) {
        empleado.setDeducciones(empleado.getDeducciones() + descuento);
        System.out.println("Descuento de " + descuento + " aplicado a " + empleado.getNombre());
    }
}
