/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.imprimir;

import herencia.cajero.CuentaClave;



/**
 *
 * @author Martín
 */
public class Imprimir {
    public void imprimirCuenta(CuentaClave cc){ 
        System.out.println("Cuenta : " + cc.getClave()); 
        System.out.println("Saldo : " + cc.getSaldo()); 
    }
}
