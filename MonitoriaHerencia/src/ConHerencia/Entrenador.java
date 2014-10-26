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
    private ArrayList<Entrenador> listaE;
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

    
    public void ListarEntrenador(){
        System.out.printf("   id  |          Nombre         |           Apellido        |     Edad   |      Id Federacion \n");
        for (int i = 0; i <getListaE().size(); i++) {
            //Futbolista f=getListf().get(i);
            //System.out.printf("  %d            %s                     %s                   %d       %s %n",f.getId(),f.getNombre(),f.getApellidos(),f.getEdad(), f.getDorsal());
            System.out.printf("  %d            %s                     %s                   %d       %s %n",getListaE().get(i).getId(),getListaE().get(i).getNombre(),getListaE().get(i).getApellidos(),getListaE().get(i).getEdad(), getListaE().get(i).getIdFederacion());
        
        }
    }

    /**
     * @return the listaE
     */
    public ArrayList<Entrenador> getListaE() {
        return listaE;
    }

    /**
     * @param listaE the listaE to set
     */
    public void setListaE(ArrayList<Entrenador> listaE) {
        this.listaE = listaE;
    }
}
