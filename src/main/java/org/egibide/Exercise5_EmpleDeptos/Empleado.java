package org.egibide.Exercise5_EmpleDeptos;

public class Empleado {
    private Integer idEmpleado;
    private String Apellido;
    private String puesto;
    private Integer departamento;

    public Empleado(Integer idEmpleado, String apellido, String puesto, Integer departamento) {
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

    public void setIdEmpleado(Integer idEmpleado) {
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

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }
}
