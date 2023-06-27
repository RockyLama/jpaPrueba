package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        //Creamos lista de materias y las agregamos
        //LinkedList = lista enlasada
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Creacion Carrera con lista de materias
        Carrera carre = new Carrera(25, "Tecnicatura en Programacion", listaMaterias);
        //Guardado Carrera en BD
        control.crearCarrera(carre);
        
        
        //Creacion de Materias
        Materia mate1 = new Materia(58, "Progrmacion I", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Progrmacion II", "Cuatrimestral", carre);
        Materia mate3 = new Materia(60, "Progrmacion Avanzada", "Anual", carre);        
        
        //Guardo Materias en la BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregar a la lista las Materias de Carrera
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        
        
        //Creacion Alumno (con carrera) 
        Alumno al = new Alumno(23, "Ibra", "The Yorkie", new Date(), carre);
        
        //Guardamos el Alumno en la BD
        control.crearAlumno(al);
        
        //Mostramos por pantalla
        System.out.println("--------------------------------------------");
        System.out.println("----------DATOS ALUMNO----------------------");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
        
        
        
        
        
        
        /*
        //Creacion Carrera
        Carrera carre = new Carrera(25, "Tecnicatura en Programacion");
        //Guardado Carrera en BD
        control.crearCarrera(carre);
        //Creacion Alumno (con carrera)
        //Alumno al = new Alumno(32, "vicky", "Mrs", new Date(), carre);
        
        //Guardamos el alumno en la BD
        //control.crearAlumno(al);
        //vemos el resultado
        System.out.println("*****************************");
        System.out.println("**********DATOS ALUMNO**************");
        Alumno alu = control.traerAlumno(32);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        Alumno alu2 = new Alumno(32, "vicky", "Mrs", new Date());
        control.crearAlumno(alu2);
       control.eliminarAlumno(30
       alu.setApellido("Rocky");
       control.editarAlumno(alu);
       
        Alumno alu = control.traerAlumno(15);
        System.out.println("----------BUSQUEDA INDIVIDUAL---------------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("----------BUSQUEDA INDIVIDUAL---------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        //Como recorrer una lista =>
        for(Alumno al : listaAlumnos){
            System.out.println("El alumno es: " + al.toString());
        }
        System.out.println("------------------------------------------------");
                */
                
    }
}
