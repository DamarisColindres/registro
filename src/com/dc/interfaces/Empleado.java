package com.dc.interfaces;

import java.time.LocalDate;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String puestoTrabajo;
    private double salarioBase;
    private LocalDate fechaIngreso;
    private String departamento;
    private double igss;
    private double irtra;
    private double deducciones;
    private double bonificaciones;

    public Empleado(int idEmpleado, String nombre, String puestoTrabajo, double salarioBase, LocalDate fechaIngreso, String departamento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puestoTrabajo = puestoTrabajo;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
        this.igss = 0;
        this.irtra = 0;
        this.deducciones = 0;
        this.bonificaciones = 0;
    }

    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getIgss() {
        return igss;
    }

    public void setIgss(double igss) {
        this.igss = igss;
    }

    public double getIrtra() {
        return irtra;
    }

    public void setIrtra(double irtra) {
        this.irtra = irtra;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }
}
