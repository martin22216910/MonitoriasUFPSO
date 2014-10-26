/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConHerencia;

import java.util.ArrayList;




/**
 *
 * @author Martín
 */
public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;
    private ArrayList<Futbolista> listf;
    
    public Futbolista() {
	super();
        listf=new ArrayList<Futbolista>();
    }
    
    

	// constructor, getter y setter

    
    public void jugarPartido() {
	//...
    }

    public void entrenar() {
	//...
    }
    public void ListarFutbolistas(){
        System.out.printf("%-6S | %-15S | %-15S | %-4S | %-6S | %-10S  %n","ID","Nombre","Apellido","Edad","Dorsal","Demarcacion");
        for (int i = 0; i <getListf().size(); i++) {
            System.out.printf("%-8d %-18S %-17S %-5d %-8d %-15S %n",getListf().get(i).getId(),getListf().get(i).getNombre(),getListf().get(i).getApellidos(),getListf().get(i).getEdad(), getListf().get(i).getDorsal(),getListf().get(i).getDemarcacion());
        
        }
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * @return the demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    /**
     * @return the listf
     */
    public ArrayList<Futbolista> getListf() {
        return listf;
    }

    /**
     * @param listf the listf to set
     */
    public void setListf(ArrayList<Futbolista> list) {
        this.listf=list;
    }

    
    
    /**public static  Collation<Futbolista> ListaFutbolista(){
        ArrayList<Futbolista> listf=new ArrayList<Futbolista>();
        return null;
        
    }*/
    
}
