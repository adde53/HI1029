/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb19;

import java.util.Arrays;

/**
 *
 * @author adde_
 */
public class NB19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,3,4,5,6,7};
        int[] outCome = {7,6,5,4,3,2,1};
        brickSpel(array,0,3, outCome);
        System.out.println("Lowest:" + lowest);
    }
    private static int right1 = 0;
    private static int left1 = 0;
    private static int lowest=100;
    public static int brickSpel(int[] array, int drag, int position, int[] outCome){
       
        if(drag > 30){
            return Integer.MAX_VALUE;
        }
        if(Arrays.equals(array, outCome)){
           // System.out.println("Tja" + drag);
            if(lowest>drag){
                lowest = drag;
            }
            return drag;
        }
        
        if(position-1>=0){
            if(position-2>=0){
                  right1 = brickSpel(rightToLeftMove2(array,position-2),drag+1, position-2,outCome);
            }
            else
                right1 = brickSpel(rightToLeftMove1(array,position-1),drag+1, position-1,outCome);
        }
        if(position+1<=6){
            if(position+2<=6){
              left1 = brickSpel(LeftToRightMove2(array,position+2),drag+1, position+2,outCome);
            }
            else
                left1 = brickSpel(LeftToRightMove1(array,position+1),drag+1, position+1,outCome);
        }
        if(right1>left1){
            
            //lowest = left1;
            return left1;
        }
        else{
            return right1;
        }
    }

    public static int[] rightToLeftMove1(int[] array, int position){
        int temp1 = array[position];
        int temp2 = array[position+1];
        //System.out.println(temp1 +"->" + temp2);
        array[position] = temp2;
        array[position+1] = temp1;
        return array;
    }
    
    public static int[] LeftToRightMove1(int[] array,int position){
       // System.out.println("Position: " + position);
        int temp1 = array[position];
        int temp2 = array[position-1];
       // System.out.println(temp1 +"->" + temp2);
        array[position] = temp2;
        array[position-1] = temp1;
        return array;
    }
    public static int[] rightToLeftMove2(int[] array, int position){
        //System.out.println("Position: " + position);
        int temp1 = array[position];
        int temp2 = array[position+2];
        //System.out.println(temp1 +"->" + temp2);
        array[position] = temp2;
        array[position+2] = temp1;
        return array;
    }
    public static int[] LeftToRightMove2(int[] array, int position){
        //System.out.println("Position: " + position);
        int temp1 = array[position];
        int temp2 = array[position-2];
        //System.out.println(temp1 +"->" + temp2);
        array[position] = temp2;
        array[position-2] = temp1;
        return array;
    }
}
