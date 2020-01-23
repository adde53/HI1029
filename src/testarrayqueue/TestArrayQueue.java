/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrayqueue;

/**
 *
 * @author AndreasOlsson
 */
public class TestArrayQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayQueue<String> hej = new ArrayQueue<>(10);
        System.out.println(hej.offer("Hej"));
        System.out.println(hej.offer("tja"));
        System.out.println(hej.offer("Yo"));
        for(int i = 0; i<hej.size(); i++){
            System.out.println(hej.peek(i));
        }
        hej.poll();
        for(int i = 0; i<hej.size(); i++){
            System.out.println(hej.peek(i));
        }
        //System.out.println(hej.toString());
    }
    
}
