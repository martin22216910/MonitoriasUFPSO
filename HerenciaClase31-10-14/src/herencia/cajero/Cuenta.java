/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.cajero;

/**
 *
 * @author Martín
 */
class Cuenta {
    //Atributo para almacenar el saldo actual 
    private float saldo; 
    
    public Cuenta(){ 
        //Inicializa el saldo a 0 
        saldo=0; 
    }
    public Cuenta(float s){ 
        //inicializa el saldo al valor indicado 
        saldo=s; 
    }
    public void ingresar(float c){ 
        saldo+=c; 
    }
    public void extraer(float c){ 
        saldo-=c; 
    }
    public float getSaldo(){ 
        return saldo; 
        }
}