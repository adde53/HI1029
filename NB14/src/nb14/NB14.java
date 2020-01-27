/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb14;

/**
 *
 * @author adde_
 */
public class NB14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Poängen kan nås med " + myntMaskin(0,109)+" öre");
    }
    
    public static int myntMaskin(int count, int amount){
        if(amount<0){
            return 0;
        }
        else 
        {
            if(amount%3==0){
                System.out.println("hej" + (amount/3));
                return (amount/3);
            }
            else{
                int tio = amount/3;
                count = amount%3;
                System.out.println("Fem:" + count + " Tio:" + tio);
            }
        }
        return 0;
    }
    /*
    Tar in amount
    
    */
}
