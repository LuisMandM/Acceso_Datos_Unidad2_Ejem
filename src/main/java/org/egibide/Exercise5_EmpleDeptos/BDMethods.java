//package org.egibide.Exercise5_EmpleDeptos;
//
//import com.db4o.Db4oEmbedded;
//import com.db4o.ObjectContainer;
//import com.db4o.ObjectSet;
//import com.db4o.ext.DatabaseClosedException;
//import com.db4o.ext.DatabaseReadOnlyException;
//import org.egibide.ClassesExample.Persona;
//
//public class BDMethods {
//    final static String BDPer = "EMPLEDEP_DB.yap";
//
//    public static ObjectContainer ObtenerBD() {
//        return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDPer);
//    }
//
//    public static <T> boolean AddObjeto(T objeto) {
//        try {
//            ObjectContainer db = ObtenerBD();
//            db.store(objeto);
//            db.close();
//            return true;
//        } catch (DatabaseClosedException e) {
//            System.out.println(e.getMessage());
//            return false;
//        } catch (DatabaseReadOnlyException e) {
//            System.out.println(e.getMessage());
//            return false;
//        }
//    }
//
//    public static ObjectSet<Empleado> LeerEmpleado(Integer campoId, String apellido, String puesto, Integer departamento) {
//        ObjectContainer db = ObtenerBD();
//        Empleado empleado = new Empleado(campoId, apellido, puesto, departamento);
//        ObjectSet<Empleado> result = db.queryByExample(empleado);
//        if (result.isEmpty()) {
//            return null;
//        } else {
//
//            return result;
//        }
//    }
//
//    public static ObjectSet<Departamento> LeerDepartamento(int campoId, String nombre, String ubicacion) {
//        Departamento departamento = new Departamento(campoId, nombre, ubicacion);
//        ObjectSet<Departamento> result = ObtenerBD().queryByExample(departamento);
//        if (result.isEmpty()) {
//            return null;
//        } else return result;
//    }
//
//    public static boolean LimpiarPersonas() {
//        ObjectContainer db = ObtenerBD();
//        Empleado persona = new Empleado(null, null, null, null);
//        ObjectSet<Empleado> result = db.queryByExample(persona);
//        if (result.isEmpty()) {
//            return false;
//        } else {
//            while (result.hasNext()) {
//                Empleado empleado = result.next();
//                db.delete(empleado);
//            }
//            db.close();
//            return true;
//        }
//    }
//
//    public static boolean LimpiarDepartamento() {
//        ObjectContainer db = ObtenerBD();
//        Departamento departamento = new Departamento(0, null, null);
//        ObjectSet<Departamento> result = db.queryByExample(departamento);
//        if (result.isEmpty()) {
//            return false;
//        } else {
//            while (result.hasNext()) {
//                Departamento depto = result.next();
//                db.delete(depto);
//            }
//            db.close();
//            return true;
//        }
//    }
//
//
//}
