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
public class CuentaClave extends Cuenta {
    //Atributo que almacena el código de la cuenta 
    private String codigo; 
    
    public CuentaClave(String c, float f){ 
        //inicializa el saldo a través del constructor de la superclase 
        super(f); 
        codigo=c; 
        } 
    public String getClave(){ 
        return codigo; 
        } 
    public void extraer(float c){ 
        if(getSaldo() > c){ 
            //invoca la versión del método extraer() 
            //que esta definida en la superclase 
            super.extraer(c); 
        }else{ 
            System.out.println("No hay Fondos Suficientes :"); 
        } 
    }
}
