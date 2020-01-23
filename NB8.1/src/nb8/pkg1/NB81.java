/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb8.pkg1;

/**
 *
 * @author adde_
 */
public class NB81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayQueue<String> test = new ArrayQueue<>(5);
        for(int i = 0; i<11; i++){
            System.out.println(test.offer("hej:"+i));
        }
        System.out.println(test.toString());
        
        //test.poll();
        /*System.out.println("break");
        for(int i = 0; i<12; i++){
            System.out.println(test.poll());
        }*/
        /*System.out.println(test.toString());
        System.out.println("break");
        
        for(int i = 0; i<11; i++){
            System.out.println(test.offer("hej:"+i));
        }
        System.out.println(test.toString());
        System.out.println("break");*/
        for(int i = 0; i<11; i++){
            System.out.println(test.poll());
        }
        System.out.println(test.toString());
    }
    
}
