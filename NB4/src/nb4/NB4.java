/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb4;

import javax.swing.JOptionPane;

/**
 *
 * @author adde_
 */
public class NB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String expression = JOptionPane.showInputDialog("Skriv ett uttryck som innehåller paranteser");
        if(ParenChecker.isBalanced(expression)){
            JOptionPane.showMessageDialog(null, expression + " är balanserat!");
        }
        else 
            JOptionPane.showMessageDialog(null, expression + " är inte balanserat!");
    }
    
}
