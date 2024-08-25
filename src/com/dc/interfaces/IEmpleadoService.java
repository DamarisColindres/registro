package com.dc.interfaces;

public interface IEmpleadoService {
	
	void registrarEmpleado(Empleado empleado);
    void listarEmpleados();
    void bajarEmpleado(int idEmpleado);
    double calcularIgss(Empleado empleado);
    double calcularIrtra(Empleado empleado);
    void agregarBono(Empleado empleado, double bono);
    void agregarDescuento(Empleado empleado, double descuento);

}
