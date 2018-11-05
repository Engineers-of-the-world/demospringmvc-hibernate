package com.upeu.modell;
// Generated 05/11/2018 04:31:58 PM by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private Categoria categoria;
     private String descripcion;
     private String nameProducto;
     private String codigo;
     private String estado;

    public Producto() {
    }

	
    public Producto(int idProducto, Categoria categoria) {
        this.idProducto = idProducto;
        this.categoria = categoria;
    }
    public Producto(int idProducto, Categoria categoria, String descripcion, String nameProducto, String codigo, String estado) {
       this.idProducto = idProducto;
       this.categoria = categoria;
       this.descripcion = descripcion;
       this.nameProducto = nameProducto;
       this.codigo = codigo;
       this.estado = estado;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNameProducto() {
        return this.nameProducto;
    }
    
    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


