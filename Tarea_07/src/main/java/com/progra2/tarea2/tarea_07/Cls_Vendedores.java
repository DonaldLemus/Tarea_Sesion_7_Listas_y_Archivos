
package com.progra2.tarea2.tarea_07;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cls_Vendedores {
    
    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;
    private double abril;
    private int totalVentas;
    private double veinte;
    private double treinta;
    private double totalVenCom;
    private double isr;
    private double liquido;
    
    
    public Cls_Vendedores(String nombre){
        this.nombre = nombre;
    }


    /*
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
       
        if (nombre.equals("LUCAS")){
            
        } else {
            this.nombre = nombre;    
        }
        
        
    }

    /*
     * @return the enero
     */
    public double getEnero() {
        return enero;
    }

    /*
     * @param enero the enero to set
     */
    public void setEnero(double enero) {
        this.enero = enero;
    }

    /*
     * @return the febrero
     */
    public double getFebrero() {
        return febrero;
    }

    /*
     * @param febrero the febrero to set
     */
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    /*
     * @return the marzo
     */
    public double getMarzo() {
        return marzo;
    }

    /*
     * @param marzo the marzo to set
     */
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    /**
     * @return the abril
     */
    public double getAbril() {
        return abril;
    }

    /**
     * @param abril the abril to set
     */
    public void setAbril(double abril) {
        this.abril = abril;
    }

    /**
     * @return the totalVentas
     */
    public int getTotalVentas() {
        return totalVentas;
    }

    /**
     * @param totalVentas the totalVentas to set
     */
    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    /**
     * @return the veinte
     */
    public double getVeinte() {
        return veinte;
    }

    /**
     * @param veinte the veinte to set
     */
    public void setVeinte(double veinte) {
        this.veinte = veinte;
    }

    /**
     * @return the treinta
     */
    public double getTreinta() {
        return treinta;
    }

    /**
     * @param treinta the treinta to set
     */
    public void setTreinta(double treinta) {
        this.treinta = treinta;
    }

    /**
     * @return the totalVenCom
     */
    public double getTotalVenCom() {
        return totalVenCom;
    }

    /**
     * @param totalVenCom the totalVenCom to set
     */
    public void setTotalVenCom(double totalVenCom) {
        this.totalVenCom = totalVenCom;
    }

    /**
     * @return the isr
     */
    public double getIsr() {
        return isr;
    }

    /**
     * @param isr the isr to set
     */
    public void setIsr(double isr) {
        this.isr = isr;
    }

    /**
     * @return the liquido
     */
    public double getLiquido() {
        return liquido;
    }

    /**
     * @param liquido the liquido to set
     */
    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }
    
}
