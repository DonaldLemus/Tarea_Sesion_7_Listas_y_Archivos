package com.progra2.tarea2.tarea_07;

/**
 *
 * @author ASUS
 */
public interface IPersona {
    
    public String getNombre(String nombre);
    public void setNombre(String nombre);
    
    public void llenar_informacion();
    public void Cargar_informacion(String archivo);
    public void guardar_informacion(String archivo);
}
