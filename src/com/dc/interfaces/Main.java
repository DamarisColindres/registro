package com.dc.interfaces;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IEmpleadoService empleadoService = new EmpleadoServiceImpl();

        
        Empleado empleado1 = new Empleado(1, "Damaris Gabriela Colindres", "Developer", 8000, LocalDate.of(2020, 1, 10), "IT");
        Empleado empleado2 = new Empleado(2, "Lilian Aracely Colindres", "Asistent", 5500, LocalDate.of(2019, 5, 15), "IT");
        
        empleadoService.registrarEmpleado(empleado1);
        empleadoService.registrarEmpleado(empleado2);
        
        empleadoService.listarEmpleados();

        empleadoService.agregarBono(empleado1, 2000);
        empleadoService.agregarDescuento(empleado2, 200);

        empleadoService.calcularIgss(empleado1);
        empleadoService.calcularIrtra(empleado1);

        empleadoService.bajarEmpleado(2);

        empleadoService.listarEmpleados();
    }
}
