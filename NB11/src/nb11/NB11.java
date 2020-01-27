/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb11;

/**
 *
 * @author adde_
 */
public class NB11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        array[0] = 7;
        array[1] = 10;
        array[2] = 2;
        array[3] = 4;
        array[4] = 7;
        array[5] = 6;
        array[6] = 7;
        array[7] = 12;
        array[8] = 7;
        array[9] = 9;
        System.out.println(findHighestNr(0, array, 0));
    }
    private static int findHighestNr(int n, int array[], int highest){
        if(array.length-1<0 || array.length-1<n){
            return highest;
        }
        else{
            if(array[n]>highest){
                highest=array[n];
                return findHighestNr(n+1, array,highest);
            }
            if(array[n]<highest){
                return findHighestNr(n+1, array,highest);
            }
        }
        return highest;
    }
    
}
