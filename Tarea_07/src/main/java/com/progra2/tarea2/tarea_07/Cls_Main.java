package com.progra2.tarea2.tarea_07;

/**
 *
 * @author ASUS
 */
public class Cls_Main {
    
    public static void main(String[] args) {
        Cls_Persona persona = new Cls_Persona();
        String archivo = "C:\\Users\\ASUS\\Downloads\\UMG\\04 Cuarto Semestres\\Programación II\\02 Segundo Semestre\\Vendedores.txt";
        
        persona.Cargar_informacion(archivo);
        persona.guardar_informacion(archivo);
    }
    
}
