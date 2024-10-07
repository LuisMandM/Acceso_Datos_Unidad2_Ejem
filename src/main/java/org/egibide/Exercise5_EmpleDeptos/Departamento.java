package org.egibide.Exercise5_EmpleDeptos;

public class Departamento {
    private int id_departamento;
    private String nombre;
    private String ubicacion;


    public Departamento() {
    }

    public Departamento(int id_departamento, String nombre, String ubicacion) {
        this.id_departamento = id_departamento;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }


    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
