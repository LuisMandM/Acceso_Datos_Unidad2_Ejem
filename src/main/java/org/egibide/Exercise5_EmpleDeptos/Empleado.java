package org.egibide.Exercise5_EmpleDeptos;

public class Empleado {
    private int idEmpleado;
    private String Apellido;
    private String puesto;
    private Departamento departamento;

    public Empleado(int idEmpleado, String apellido, String puesto, Departamento departamento) {
        this.idEmpleado = idEmpleado;
        Apellido = apellido;
        this.puesto = puesto;
        this.departamento = departamento;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
