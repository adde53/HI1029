/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu2hi1029;

/**
 *
 * @author adde_
 */
public class LabU2HI1029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleLinkedList hej = new SingleLinkedList();
        hej.add(0);
         hej.add(1);
          hej.add(2);
           hej.add(3);
           hej.add(4);
           hej.add(5);
           hej.add(6);
            
        //System.out.println(" " + hej.remove(0));
        //System.out.println("Break");
        for(int i = 0; i<hej.size(); i++){
            System.out.println(" " + hej.get(i));
        }
        System.out.println("Break");
        hej.remove(0);
        hej.remove(0);
        hej.remove(0);
        for(int i = 0; i<hej.size(); i++){
            System.out.println(" " + hej.get(i));
        }
           //hej.removeAfter(4);
        //System.out.println(" " + hej.get(2));
        //System.out.println(" " + hej.size());
        //hej.removeAfter(2);
        //System.out.println(" " + hej.get(1));
        //System.out.println(" " + hej.get(1));
    }
    
}
