package pkgAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arg){

        List<CursoAsignado>cat_Cursos= new ArrayList<>();
        cat_Cursos.add(new CursoAsignado(Codigo:101, Nombre: "programacion", costo 500));
        cat_Cursos.add(new CursoAsignado(Codigo:105, Nombre: "Derecho", costo 1));
        cat_Cursos.add(new CursoAsignado(Codigo:110, Nombre: "Estadistica", costo 450));
        cat_Cursos.add(new CursoAsignado(Codigo:120, Nombre: "Electronica", costo 400));


        Alumnos al1 = new Alumnos ("2023015", "Andrea", "55555555", "5 calle 8-36 zona 1 ");
        al1.agregarCursoAsignado(cat_Cursos.get(1));
        al1.agregarCursoAsignado(cat_Cursos.get(2));
        System.out.println("Total del alumno"+al1.getNombre()+);
        al1.mostrarInformacion();
        for (CursoAsignado curso: al1.getCursoAsignados()){
            System.out.println("nombre del curso "+ curso.getNombreCurso());
            System.out.println("Costo:"+curso.getCostoCurso());

        }

        // Agregar dos alumnos más
        Alumnos al2 = new Alumnos("2023016", "Ivan", "12345678", "2 avenida 10-20 zona 2");
        al2.agregarCursoAsignado(curso1);
        al2.agregarCursoAsignado(curso3);
        al2.agregarCursoAsignado(curso2);
        System.out.println ("Total del alumno :"+al1.getNombre()+"Q."+al1.getTotalCurso());
        al2.mostrarInformacion();

        Alumnos al3 = new Alumnos("2023017", "Laura", "98765432", "3 calle 15-45 zona 3");
        al3.agregarCursoAsignado(curso1);
        al3.agregarCursoAsignado(curso2);
        al2.agregarCursoAsignado(curso3);

        System.out.println (al1.getTotalCurso()+al2.getTotalCurso());
        al3.mostrarInformacion();
    }
}
