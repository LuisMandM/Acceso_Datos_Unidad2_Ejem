package org.egibide.Exercises;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import org.egibide.ClassesExample.Persona;

public class Main_Example_DB4o {

    final static String BDPer = "DBPersonas.yap";

    public static void main(String[] args) {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDPer);
        //EscribirPersonas(db);
        //LeerDB4O(db);

        //Actualizar(db);
        LeerDB4O(db);
        Persona per = new Persona(null, "Bilbao", 0);
        ObjectSet<Persona> result = db.queryByExample(per);
        if (result.isEmpty()) {
            System.out.println("No existen Vitorianos");
        } else {
            while (result.hasNext()) {
                Persona existe = result.next();
                existe.setCiudad("Asturias");
                db.store(existe);
                System.out.println("Nombre: " +
                        existe.getNombre() + "  Ciudad:" + existe.getCiudad());
                db.delete(existe);
            }
        }

        LeerDB4O(db);

    }

    private static void Actualizar(ObjectContainer db) {
        Persona per = new Persona(null, "Vitoria", 0);
        ObjectSet<Persona> result = db.queryByExample(per);
        if (result.isEmpty()) {
            System.out.println("No existen Vitorianos");
        } else {
            while (result.hasNext()) {
                Persona existe = result.next();
                existe.setCiudad("Bilbao");
                db.store(existe);
                System.out.println("Nombre: " +
                        existe.getNombre() + "  Ciudad:" + existe.getCiudad());
            }
        }
    }

    private static void LeerDB4O(ObjectContainer db) {
        Persona per = new Persona(null, null, 0);
        ObjectSet<Persona> result = db.queryByExample(per);
        if (result.isEmpty()) {
            System.out.println("No existe hay personas en la BD");
        }
        while (result.hasNext()) {
            Persona p = result.next();
            System.out.println("\tNombre: " + p.getNombre());
            System.out.println("\tCiudad:" + p.getCiudad());
            System.out.println("\tEdad:" + p.getEdad());
        }

        System.out.println("----JUANES---");
        //búsqueda de objetos Persona con nombre Juan
        per = new Persona("Juan", null, 0);
        ObjectSet<Persona> result_2 = db.queryByExample(per);
        while (result_2.hasNext()) {
            Persona p = result_2.next();
            System.out.println("\tNombre: " + p.getNombre());
            System.out.println("\tCiudad:" + p.getCiudad());
            System.out.println("\tEdad:" + p.getEdad());
        }

        System.out.println("----Bilbainos---");
        //búsqueda de objetos Persona con ciudad Vitoria
        per = new Persona(null, "Bilbao", 0);
        ObjectSet<Persona> result_3 = db.queryByExample(per);
        while (result_3.hasNext()) {
            Persona p = result_3.next();
            System.out.println("\tNombre: " + p.getNombre());
            System.out.println("\tCiudad:" + p.getCiudad());
            System.out.println("\tEdad:" + p.getEdad());
        }

        System.out.println("----ASTURIANOS---");
        //búsqueda de objetos Persona con ciudad Vitoria
        per = new Persona(null, "Asturias", 0);
        ObjectSet<Persona> result_4 = db.queryByExample(per);
        while (result_4.hasNext()) {
            Persona p = result_4.next();
            System.out.println("\tNombre: " + p.getNombre());
            System.out.println("\tCiudad:" + p.getCiudad());
            System.out.println("\tEdad:" + p.getEdad());
        }
    }

    private static void EscribirPersonas(ObjectContainer db) {
        // Creamos Personas
        //Persona p1 = new Persona("Juan", "Guadalajara", 25);
        Persona p1 = new Persona("Juan", "Vitoria", 25);
        Persona p2 = new Persona("Luis", "Madrid", 23);
        Persona p3 = new Persona("Luis", "Granada", 22);
        Persona p4 = new Persona("Fernando", "Asturias", 14);
        //Almacenar objetos Persona en la base de datos
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);
        db.close();
    }
}
