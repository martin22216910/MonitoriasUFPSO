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
public class Masajista extends Persona{
    private String Titulacion;
    private int aniosExperiencia;
    public final ArrayList<Masajista> listaM;
    
    @SuppressWarnings("Convert2Diamond")
    public Masajista() {
        super();
        listaM=new ArrayList<Masajista>();
    }

	// constructor, getter y setter

    
    public void darMasaje() {
	//...
    }
}
