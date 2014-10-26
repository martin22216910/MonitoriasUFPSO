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
        ArrayList<Entrenador> liste=new ArrayList<Entrenador>();
        ArrayList<Masajista> listm=new ArrayList<Masajista>();
        
        boolean Salir=false;
        while(!Salir){
            Futbolista f=new Futbolista();
            Entrenador e=new Entrenador();
            Masajista m=new Masajista();
            System.out.println("[1]...Agregar Persona.  [2]...Imprimir Lista Persona [3]... Salir \n");
            switch(input.nextInt()){
                case 1:
                    System.out.println("[1]...Futbolista [2]...Entrenador [3]...Masajista");
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
                            listf.add(f);
                            break;
                        case 2:
                            System.err.println("Ingrese Id: ");
                            e.setId(input.nextInt());
                            System.err.println("Ingrese Nombre: ");
                            e.setNombre(inputl.nextLine());
                            System.err.println("Ingrese Apellido: ");
                            e.setApellidos(inputl.nextLine());
                            System.err.println("Ingrese Edad: ");
                            e.setEdad(input.nextInt());
                            System.err.println("Ingrese Id Federacion: ");
                            e.setIdFederacion(inputl.nextLine());
                            liste.add(e);
                            break;
                        case 3:
                            System.err.println("Ingrese Id: ");
                            m.setId(input.nextInt());
                            System.err.println("Ingrese Nombre: ");
                            m.setNombre(inputl.nextLine());
                            System.err.println("Ingrese Apellido: ");
                            m.setApellidos(inputl.nextLine());
                            System.err.println("Ingrese Edad: ");
                            m.setEdad(input.nextInt());
                            System.err.println("Ingrese Años de Experiencia: ");
                            m.setAniosExperiencia(input.nextInt());
                            System.err.println("Ingrese Titulacion: ");
                            m.setTitulacion(inputl.nextLine());
                            listm.add(m);
                            break;
                        default:
                            System.err.println("¡Opcion Incorecta!");
                    }
                    
                    break;
                case 2:
                    System.out.println("[1]...Futbolista [2]...Entrenador [3]...Masajista");
                    switch(input.nextInt()){
                        case 1:
                            f.setListf(listf);
                            f.ListarFutbolistas();
                            break;
                        case 2:
                            e.setListaE(liste);
                            e.ListarEntrenador();
                            break;
                        case 3:
                            m.setListaM(listm);
                            m.ListarMasajista();
                            break;
                        default:
                            System.err.println("¡Opcion Incorecta!");
                            
                    }                    
                    break;
                case 3:
                    Salir=true;
                default:
                    System.out.println("Opcion Incorrecta");
            }
            
            
        }     
        
        
    }
    
}
