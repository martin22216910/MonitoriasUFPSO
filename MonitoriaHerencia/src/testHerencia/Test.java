/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHerencia;

import ConHerencia.Entrenador;
import ConHerencia.Futbolista;
import ConHerencia.Masajista;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martín
 */
public class Test implements Serializable{
    public static void main(String[] jmriosp){
        Scanner input=new Scanner(System.in);
        Scanner inputl=new Scanner(System.in);
        ArrayList<Futbolista> listf=new ArrayList<Futbolista>();
        int i=0;
        Futbolista f=new Futbolista();
        Entrenador e=new Entrenador();
        Masajista m=new Masajista();
        boolean Salir=false;
        while(!Salir){
            System.out.println("[1]...Agregar Persona.  [2]...Imprimir Lista Persona [3]... Salir \n");
            switch(input.nextInt()){
                case 1:
                    System.err.println("Ingrese Id: ");
                    f.setId(input.nextInt());
                    System.err.println("Ingrese Nombre: ");
                    f.setNombre(inputl.nextLine());
                    System.err.println("Ingrese Apellido: ");
                    f.setApellidos(inputl.nextLine());
                    System.err.println("Ingrese Edad: ");
                    f.setEdad(input.nextInt());
                    System.err.println("Ingrese Dorsal: ");
                    f.setDorsal(input.nextInt());
                    System.err.println("Ingrese Demarcacion: ");
                    f.setDemarcacion(inputl.nextLine());
                    
                    
                    break;
                case 2:
                    f.setListf(listf);
                    f.ListarFutbolistas();
                    break;
                case 3:
                    Salir=true;
                default:
                    System.out.println("Opcion Incorrecta");
            }
            
            
        }     
        
        
    }
    
}
