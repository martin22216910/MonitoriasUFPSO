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
public class Buscar {
    private CuentaClave[] arregloCC = null; 
    public void setArregloCuentaClave(CuentaClave[] acc){ 
        arregloCC = acc; 
        } 
    public CuentaClave buscarCuenta(String cuenta){ 
        CuentaClave cc = null; 
        if(arregloCC != null && cuenta != null){ 
            for(int i=0;i<arregloCC.length;i++){ 
                cc = arregloCC[i]; 
                if(cc != null){ 
                    if(cuenta.equals(cc.getClave())){ 
                        break; 
                    }
                }
            }
        }
        return cc;
    }
}
   


