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
public class Entrenador extends Persona{
    private String idFederacion;
    public static ArrayList<Entrenador> listaE;
	// constructor, getter y setter
    @SuppressWarnings("Convert2Diamond")
    public Entrenador() {
	super();
        listaE=new ArrayList<Entrenador>();
    }
    
    public void dirigirPartido() {
	//...	
    }
	
    public void dirigirEntreno() {
	//...
    }    

    /**
     * @return the idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * @param idFederacion the idFederacion to set
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
}
