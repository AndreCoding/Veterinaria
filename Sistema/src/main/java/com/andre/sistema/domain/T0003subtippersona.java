package com.andre.sistema.domain;
// Generated 17/01/2015 12:38:08 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * T0003subtippersona generated by hbm2java
 */
@SuppressWarnings("serial")
public class T0003subtippersona  implements java.io.Serializable {


     private int i0003idsubtippers;
     private T0002tipopersona t0002tipopersona;
     private String c0003nombre;
     private String c0003usuario;
     private Date d0003fecha;
     private String c0003pc;
     private String c0003ip;
     private boolean b0003estado;
     private String cusuarioMod;
     private String cobservacion;
     private String cipMod;
     private Set t0001personases = new HashSet(0);

    public T0003subtippersona() {
    }

	
    public T0003subtippersona(int i0003idsubtippers, T0002tipopersona t0002tipopersona, String c0003nombre, String c0003usuario, Date d0003fecha, String c0003pc, String c0003ip, boolean b0003estado) {
        this.i0003idsubtippers = i0003idsubtippers;
        this.t0002tipopersona = t0002tipopersona;
        this.c0003nombre = c0003nombre;
        this.c0003usuario = c0003usuario;
        this.d0003fecha = d0003fecha;
        this.c0003pc = c0003pc;
        this.c0003ip = c0003ip;
        this.b0003estado = b0003estado;
    }
    public T0003subtippersona(int i0003idsubtippers, T0002tipopersona t0002tipopersona, String c0003nombre, String c0003usuario, Date d0003fecha, String c0003pc, String c0003ip, boolean b0003estado, String cusuarioMod, String cobservacion, String cipMod, Set t0001personases) {
       this.i0003idsubtippers = i0003idsubtippers;
       this.t0002tipopersona = t0002tipopersona;
       this.c0003nombre = c0003nombre;
       this.c0003usuario = c0003usuario;
       this.d0003fecha = d0003fecha;
       this.c0003pc = c0003pc;
       this.c0003ip = c0003ip;
       this.b0003estado = b0003estado;
       this.cusuarioMod = cusuarioMod;
       this.cobservacion = cobservacion;
       this.cipMod = cipMod;
       this.t0001personases = t0001personases;
    }
   
    public int getI0003idsubtippers() {
        return this.i0003idsubtippers;
    }
    
    public void setI0003idsubtippers(int i0003idsubtippers) {
        this.i0003idsubtippers = i0003idsubtippers;
    }
    public T0002tipopersona getT0002tipopersona() {
        return this.t0002tipopersona;
    }
    
    public void setT0002tipopersona(T0002tipopersona t0002tipopersona) {
        this.t0002tipopersona = t0002tipopersona;
    }
    public String getC0003nombre() {
        return this.c0003nombre;
    }
    
    public void setC0003nombre(String c0003nombre) {
        this.c0003nombre = c0003nombre;
    }
    public String getC0003usuario() {
        return this.c0003usuario;
    }
    
    public void setC0003usuario(String c0003usuario) {
        this.c0003usuario = c0003usuario;
    }
    public Date getD0003fecha() {
        return this.d0003fecha;
    }
    
    public void setD0003fecha(Date d0003fecha) {
        this.d0003fecha = d0003fecha;
    }
    public String getC0003pc() {
        return this.c0003pc;
    }
    
    public void setC0003pc(String c0003pc) {
        this.c0003pc = c0003pc;
    }
    public String getC0003ip() {
        return this.c0003ip;
    }
    
    public void setC0003ip(String c0003ip) {
        this.c0003ip = c0003ip;
    }
    public boolean isB0003estado() {
        return this.b0003estado;
    }
    
    public void setB0003estado(boolean b0003estado) {
        this.b0003estado = b0003estado;
    }
    public String getCusuarioMod() {
        return this.cusuarioMod;
    }
    
    public void setCusuarioMod(String cusuarioMod) {
        this.cusuarioMod = cusuarioMod;
    }
    public String getCobservacion() {
        return this.cobservacion;
    }
    
    public void setCobservacion(String cobservacion) {
        this.cobservacion = cobservacion;
    }
    public String getCipMod() {
        return this.cipMod;
    }
    
    public void setCipMod(String cipMod) {
        this.cipMod = cipMod;
    }
    public Set getT0001personases() {
        return this.t0001personases;
    }
    
    public void setT0001personases(Set t0001personases) {
        this.t0001personases = t0001personases;
    }




}

