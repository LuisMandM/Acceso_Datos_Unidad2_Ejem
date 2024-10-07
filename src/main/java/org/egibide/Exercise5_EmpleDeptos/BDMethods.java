package org.egibide.Exercise5_EmpleDeptos;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import org.egibide.ClassesExample.Persona;

public class BDMethods {
    final static String BDPer = "EMPLEDEP_DB.yap";

    public ObjectContainer ObtenerBD() {
        return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDPer);
    }

    public <T> boolean AddObjeto(T objeto) {
        try {
            ObtenerBD().store(objeto);
            return true;
        } catch (DatabaseClosedException e) {
            return false;
        } catch (DatabaseReadOnlyException e) {
            return false;
        }
    }

    public ObjectSet<Empleado> LeerEmpleado(int campoId, String apellido, String puesto, Departamento departamento) {
        Empleado empleado = new Empleado(campoId, apellido, puesto, departamento);
        ObjectSet<Empleado> result = ObtenerBD().queryByExample(empleado);
        if (result.isEmpty()) {
            return null;
        } else return result;
    }

    public ObjectSet<Departamento> LeerDepartamento(int campoId, String nombre, String ubicacion) {
        Departamento departamento = new Departamento(campoId, nombre, ubicacion);
        ObjectSet<Departamento> result = ObtenerBD().queryByExample(departamento);
        if (result.isEmpty()) {
            return null;
        } else return result;
    }


}
