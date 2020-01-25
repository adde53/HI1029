/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu3hi1029;

import java.util.Iterator;

/**
 *
 * @author adde_
 */
public class LabU3HI1029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleLinkedList<Integer> hej = new SingleLinkedList();
        hej.add(0);
        hej.add(1);
        hej.add(2);
        hej.add(3);
        hej.add(4);
        hej.add(5);
        hej.add(6);
        hej.add(7);
        hej.add(8);
            Iterator<Integer> iter;// = new Iterator<>();//
            iter = hej.iterator();
            iter.next();
            iter.next();
            System.out.println(iter.toString());
            iter.remove();
            System.out.println(iter.toString());
            iter.next();
            iter.next();
            iter.next();
            iter.next();
            iter.next();
            iter.next();
            
            //iter.next();
            /*iter.next();
            iter.next();
            for(int i = 0; i<hej.size();i++){
                System.out.println("" + hej.get(i));
            }*/
            //System.out.println(iter.toString());
            /*iter.remove();
            iter.next();
            iter.remove();
            iter.next();
            iter.next();*/
            /*iter.next();
            iter.remove();
            System.out.println(iter.toString());
            iter.next();
            /*System.out.println(iter.toString());
            iter.remove();
            iter.next();
            System.out.println(iter.toString());
            iter.remove();*/
            System.out.println(iter.toString());
            for(int i = 0; i<hej.size();i++){
                System.out.println("" + hej.get(i));
            }
            //iter.next();
            //iter.remove();
            //iter.next();
            //iter.remove();
            //iter.next();
             //System.out.println(iter.toString());
            //while(iter.hasNext()){//O(n)
                System.out.println(iter.toString());
                //iter.remove();
                //System.out.println("SISTA:"+iter.next());
                //hej.iterator().toString();
                //iter.remove();
                
                
            //}
            //hej.iterator().toString();

            //System.out.println(iter.toString());
        //System.out.println(" " + hej.remove(0));
        //System.out.println("Break");
        /*for(int i = 0; i<hej.size(); i++){
            System.out.println(" " + hej.get(i));
        }*/
//        System.out.println(iter.toString());
    }
    /*
    Har testat att ta bort innan next har kallats på. Det kastas då exception
    Har testat att ta bort på första platsen direkt efter ett next det funkar
    Har testat göra två remove efter varandra då kastas exception
    */
    
}
