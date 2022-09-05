
package com.progra2.tarea2.tarea_07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Cls_Persona implements IPersona{

    @Override
    public String getNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenar_informacion() {
       
    }

    @Override
    public void Cargar_informacion(String nombreArchivo) {
        List<Cls_Persona> personas = new ArrayList();
        
        try{
            BufferedReader entrada = null;
            File archivo = new File(nombreArchivo);
            entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            linea = entrada.readLine();
            while(linea != null){
               Cls_Persona per = new Cls_Persona();
               personas.add(per);
               
                linea = entrada.readLine();
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }catch(IOException ex){
            System.out.println("Hay clavos con la lectura");
        }
//         return personas;
    }

    @Override
    public void guardar_informacion(String NombreArchivo) {
         PrintWriter salida = null;
        try{
            File archivo = new File(NombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo));
            salida.println(archivo.toString());
            salida.close();
        }catch(IOException e){
            System.out.println("Problema al escribir en el archivo"+e.getMessage());
        }finally{
            salida.close();
        }
    }
    
}
