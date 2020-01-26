/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roads;

/**
 *
 * @author adde_
 */
public class Roads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int amount = antalVägar(3,2);
        System.out.println("Amount: " + amount);
    }
    
    private static int antalVägar(int m, int n){

        if(m == 0 && n == 0)
            return 1;
        else{
            int antal = 0;
            if(m>0){
                antal = antalVägar(m-1,n);
            }
            if(n>0){
                antal = (antal + antalVägar(m,n-1));
            }
            return antal;
        }
    }
}
