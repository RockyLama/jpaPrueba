package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//mapeamos nuestra clase como una entidad
@Entity
public class Alumno implements Serializable {
    
    //Mapeamos nuestro campo ID como nuestra futura Primary Key
    //que sea autocremental
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    //Mapeamos nombre y apellido como campos basicos
    @Basic
    private String nombre;
    private String apellido;
    
    
    //Mapeamos como campo temporal es decir como una fecha para luego 
    //utilizarla en la BD
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    
    //Indicamos la relacion uno a uno a JPA con la siguiente anotacion
    @OneToOne 
    private Carrera carre; //a nivel logico generamos la relacion alumno/carrera

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac, Carrera carre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.carre = carre;
    }

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    //El metodo toString nos permite visaulaizar en forma de String cada unos de los atributos que tiene nuestro objeto
    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
}
