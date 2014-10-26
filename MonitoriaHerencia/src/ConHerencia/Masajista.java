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
    private ArrayList<Masajista> listaM;
    
    @SuppressWarnings("Convert2Diamond")
    public Masajista() {
        super();
        listaM=new ArrayList<Masajista>();
    }

	// constructor, getter y setter

    
    public void darMasaje() {
	//...
    }
    
    public void ListarMasajista(){
        System.out.printf("%6S | %15S | %15S | %4S | %15S | %4S %n","ID","Nombre","Apellido","Edad","Titulacion","Años Experienca");
        for (int i = 0; i <getListaM().size(); i++) {
            System.out.printf("%-7d %-19S %-18S %-5d %-18S %-4d %n",getListaM().get(i).getId(),getListaM().get(i).getNombre(),getListaM().get(i).getApellidos(),getListaM().get(i).getEdad(), getListaM().get(i).getTitulacion(),getListaM().get(i).getAniosExperiencia());
        
        }
    }

    /**
     * @return the Titulacion
     */
    public String getTitulacion() {
        return Titulacion;
    }

    /**
     * @param Titulacion the Titulacion to set
     */
    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    /**
     * @return the aniosExperiencia
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    /**
     * @param aniosExperiencia the aniosExperiencia to set
     */
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * @return the listaM
     */
    public ArrayList<Masajista> getListaM() {
        return listaM;
    }

    /**
     * @param listaM the listaM to set
     */
    public void setListaM(ArrayList<Masajista> listaM) {
        this.listaM = listaM;
    }
}
