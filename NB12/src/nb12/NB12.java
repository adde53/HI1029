/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb12;

/**
 *
 * @author adde_
 */
public class NB12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(powerOfN(6,2,1));
        
    }
    
    public static int powerOfN(int n, int x, int count){
        if(n<0){
            return 0;
        }
        else{
            if(n>0){
                count = count * x;
                return powerOfN(n-1,x,count);
            }
        }
        return count;
    }
}
