package org.egibide.ClassesExample;

public class Persona {
    private String nombre;
    private String Ciudad;
    private int edad;

    public Persona(String nombre, String ciudad, int edad) {
        this.nombre = nombre;
        Ciudad = ciudad;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
