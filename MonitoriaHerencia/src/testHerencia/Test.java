/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHerencia;

import ConHerencia.Entrenador;
import ConHerencia.Futbolista;
import ConHerencia.Masajista;

/**
 *
 * @author Martín
 */
public class Test {
    public static void main(String[] jmriosp){
        Futbolista f=new Futbolista();
        Entrenador e=new Entrenador();
        Masajista m=new Masajista();
        f.setId(1234);
        f.setNombre("Martin");
        f.setApellidos("Rios");
        f.setEdad(24);
        f.setDorsal(17);
        f.setDemarcacion("Portero");
        
        f.listf.add(f);
    }
    
}
