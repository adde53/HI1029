/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb6;

/**
 *
 * @author adde_
 */
public class NB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayStack hej = new ArrayStack();
        hej.push(1);
        hej.push(2);
        hej.push(3);
        hej.push(4);
        for(int i = 0; i<hej.size(); i++){
            System.out.println(" " + hej.peek(i));
        }
        hej.flush();
        hej.push(1);
        for(int i = 0; i<hej.size(); i++){
            System.out.println(" " + hej.peek(i));
        }
        
    }
    
}
