/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Procesobolso;

/**
 *
 * @author Pc Smart
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Procesobolso ob= new Procesobolso();
        
        ob.llenar();
        ob.mostrarelegante();
        ob.mostrarviaje();
        
    }
    
}
