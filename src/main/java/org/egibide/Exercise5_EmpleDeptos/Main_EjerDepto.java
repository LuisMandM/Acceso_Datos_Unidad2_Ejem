package org.egibide.Exercise5_EmpleDeptos;


import java.util.ArrayList;

public class Main_EjerDepto {
    static ArrayList<Empleado> empleadosArray = new ArrayList();

    public static void main(String[] args) {


//        System.out.println(BDMethods.LimpiarPersonas());
//        System.out.println(BDMethods.LimpiarDepartamento());
//        if (CargarDatos()) {
//            ObjectSet<Empleado> empleados = BDMethods.LeerEmpleado(null, null, null, null);
//            if (empleados == null) {
//                System.out.println("No se encontraron empleados");
//            } else {
//                while (empleados.hasNext()) {
//                    empleadosArray.add(empleados.next());
//                }
//            }
//        }


    }

    private static boolean CargarDatos() {
        ArrayList<Departamento> departamentos = new ArrayList();
        Departamento depto_1 = new Departamento(10, "CONTABILIDAD", "SEVILLA");
        Departamento depto_2 = new Departamento(20, "INVESTIGACION", "MADRID");
        Departamento depto_3 = new Departamento(30, "VENTAS", "BARCELONA");

        departamentos.add(depto_1);
        departamentos.add(depto_2);
        departamentos.add(depto_3);

        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(new Empleado(7639, "SANCHEZ", "EMPLEADO", depto_2.getId_departamento()));
        empleados.add(new Empleado(7499, "ARROYO", "VENDEDOR", depto_3.getId_departamento()));
        empleados.add(new Empleado(7521, "SALA", "VENDEDOR", depto_3.getId_departamento()));
        empleados.add(new Empleado(7639, "JIMENEZ", "DIRECTOR", depto_2.getId_departamento()));
        empleados.add(new Empleado(7782, "CEREZO", "DIRECTOR", depto_1.getId_departamento()));
        empleados.add(new Empleado(7839, "REY", "PRESIDENTE", depto_1.getId_departamento()));

//        try {
//            for (Departamento departamento : departamentos) BDMethods.AddObjeto(departamento);
//            for (Empleado empleado : empleados) BDMethods.AddObjeto(empleado);
//            return true;
//        } catch (Exception e) {
//            System.out.println("Algo ha ido mal con la carga inicial " + e.getMessage());
//            return false;
//        }
        return false;
    }

}
