/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc Smart
 */
public class InOut {
    
    
      public String pedircaracter(String m) {
        return JOptionPane.showInputDialog(m);
    }

    public int pedirentero(String m) {
        String e = JOptionPane.showInputDialog(m);
        return Integer.parseInt(e);
    }

    public void mostrar(String m) {
        JOptionPane.showMessageDialog(null, m);
        
    }
    public double pedirdouble (String m){
    String d=JOptionPane.showInputDialog(m); 
    return Double.parseDouble(d);}
}

