/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConHerencia;

import java.util.ArrayList;
import javafx.print.Collation;



/**
 *
 * @author Martín
 */
public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;
    public ArrayList<Futbolista> listf;
    
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

    
    
    /**public static  Collation<Futbolista> ListaFutbolista(){
        ArrayList<Futbolista> listf=new ArrayList<Futbolista>();
        return null;
        
    }*/
    
}
