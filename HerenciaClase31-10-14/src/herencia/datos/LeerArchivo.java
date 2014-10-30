/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import herencia.cajero.CuentaClave;

/**
 *
 * @author Martín
 */
public class LeerArchivo {
    /** Constructor de la clase */ 
    public LeerArchivo() { 
        }
    /**Este método se encarga de leer un archivo y retornar un arreglo de objetos de tipo persona*/ 
    
    public CuentaClave[] leerArchivoTexto(){ 
        File f = null;
        BufferedReader entrada = null; 
        String texto = null; 
        CuentaClave cc = null; 
        String[] cadena = null; 
        CuentaClave[] arregloCC = new CuentaClave[20]; 
        int cont = 0; 
        try{
            f = new File( "./src/herencia/datos/datos.txt" ); 
            entrada = new BufferedReader( new FileReader( f ) ); 
            if (f.exists()){ 
                while((texto = entrada.readLine()) != null){ 
                    cadena = texto.split("#"); 
                    cc = new CuentaClave(cadena[0], Float.parseFloat(cadena[1]));
                    arregloCC[cont] = cc; 
                    cont++; 
                }
                f = null; 
                } 
            }catch(Exception e){ 
                System.out.println("Error ::: " + e.getMessage()); 
                } 
        return arregloCC;
    }
}
