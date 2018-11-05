package com.upeu.modell;
// Generated 05/11/2018 04:31:58 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private int idCategoria;
     private String nameCat;
     private String estado;
     private Set productos = new HashSet(0);

    public Categoria() {
    }

	
    public Categoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public Categoria(int idCategoria, String nameCat, String estado, Set productos) {
       this.idCategoria = idCategoria;
       this.nameCat = nameCat;
       this.estado = estado;
       this.productos = productos;
    }
   
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNameCat() {
        return this.nameCat;
    }
    
    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}

