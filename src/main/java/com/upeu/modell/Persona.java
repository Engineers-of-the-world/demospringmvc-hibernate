package com.upeu.modell;
// Generated 05/11/2018 04:31:58 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int idPersona;
     private String firstName;
     private String lastName;
     private String dni;
     private Date dfdfd;
     private Set usuarios = new HashSet(0);

    public Persona() {
    }

	
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
    public Persona(int idPersona, String firstName, String lastName, String dni, Date dfdfd, Set usuarios) {
       this.idPersona = idPersona;
       this.firstName = firstName;
       this.lastName = lastName;
       this.dni = dni;
       this.dfdfd = dfdfd;
       this.usuarios = usuarios;
    }
   
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getDfdfd() {
        return this.dfdfd;
    }
    
    public void setDfdfd(Date dfdfd) {
        this.dfdfd = dfdfd;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

