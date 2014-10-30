/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.cajero;

import herencia.datos.LeerArchivo;
import herencia.imprimir.Imprimir;
import java.util.Scanner;

/**
 *
 * @author Martín
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valor = 0;
        String op; 
        CuentaClave c = null; 
        float cant; 
        CuentaClave[] arregloCC = null; 
        Scanner scanner = null; 
        LeerArchivo leerArchivo = new LeerArchivo(); 
        arregloCC = leerArchivo.leerArchivoTexto(); 
        Buscar buscar = new Buscar(); 
        buscar.setArregloCuentaClave(arregloCC); 
        Menu menu = new Menu(); 
        
        Imprimir imprimir = new Imprimir(); 
        if(arregloCC != null){ 
            scanner = new Scanner(System.in); 
            boolean Salir=false;
            while(!Salir){
                menu.mostrarMenu(); 
                op = scanner.next(); 
                switch(Integer.parseInt(op)){ 
                    case 1: 
                        System.out.println("Código de la Cuenta: "); 
                        String cod = scanner.next(); 
                        c = buscar.buscarCuenta(cod); 
                        if(c != null){ 
                            System.out.println("Ingrese la Cantidad que desea Adicionar"); 
                            valor = scanner.nextFloat(); 
                            c.ingresar(valor); 
                            imprimir.imprimirCuenta(c); 
                        }else{ 
                            System.out.println("La cuenta ["+cod+"] no existe." ); 
                            } 
                        break; 

                    case 2: 
                        System.out.println("Código de la Cuenta: "); 
                        cod = scanner.next(); 
                        c = buscar.buscarCuenta(cod); 
                        if(c != null){ 
                            System.out.println("Ingrese la Cantidad que desea Retirar");
                            valor = scanner.nextFloat(); 
                            c.extraer(valor); 
                            imprimir.imprimirCuenta(c); 
                        }else{ 
                            System.out.println("La cuenta ["+cod+"] no existe." );
                            } 
                        break; 

                    case 3: 
                        System.out.println("Código de la Cuenta: "); 
                        cod = scanner.next();
                        c = buscar.buscarCuenta(cod);
                        if(c != null){ 
                            imprimir.imprimirCuenta(c); 
                        }else{ 
                            System.out.println("La cuenta ["+cod+"] no existe." );
                            } 
                        break;
                    case 4:
                        Salir=true;
                        break;

                    default: 
                        System.out.println("Selección Incorrecta"); 

                }
            }
            
        }
    }  
}
