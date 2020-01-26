/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euklides;

/**
 *
 * @author adde_
 */
public class Euklides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int answer = gcdSearch(78,21);
        System.out.println("GCD = " + answer);
    }
    private static int gcdSearch(int a, int b){
        if(b==0){//det här är den från början
            return a;
        }else{
            return gcdSearch(b,a%b);
        }
    }
}
