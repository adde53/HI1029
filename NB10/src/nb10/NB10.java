/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb10;

/**
 *
 * @author adde_
 */
public class NB10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DequeueList<Integer> deque = new DequeueList<Integer>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerFirst(4);
        System.out.println("Removing first:"+deque.pollFirst());
        System.out.println("Removing first:"+deque.pollFirst());
        System.out.println("Removing first:"+deque.pollFirst());    
        deque.offerLast(5);
        deque.offerLast(6);
        deque.offerLast(7);
        deque.offerLast(8);
        deque.offerLast(9);
        System.out.println("Removing last "+deque.pollLast());
        System.out.println("Removing last "+deque.pollLast());
        System.out.println("Removing last "+deque.pollLast());
        System.out.println("Removing last "+deque.pollLast());
        System.out.println("Removing last "+deque.pollLast());
        System.out.println("Removing last "+deque.pollLast());
        //deque.pollLast();
        /*for(int i = 0; i<deque.size(); i++){
            System.out.println(deque.)
        }*/
    }
    
}
