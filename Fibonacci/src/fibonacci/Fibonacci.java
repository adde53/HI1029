/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author adde_
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = fib(7);
        System.out.println(" " + s);
    }
    static int fib(int n){
        if(n==1||n==2)
            return 1;
        else
        return fib(n-1)+fib(n-2);
    }
    int fak(int n){
        if(n ==0){
            return 1;
        }
        else 
            return n*fak(n-1);
    }
    
    public static int linearsearch(Object[] array, Object target){
        return linearSearch(array,target,0);
    }
    private static int linearSearch(Object[] array, Object target, int position){
        if(position == array.length)
            return -1;
        else if(target.equals(array[position]))
            return position;
        else
        return linearSearch(array,target,position+1);
    }
    
}
