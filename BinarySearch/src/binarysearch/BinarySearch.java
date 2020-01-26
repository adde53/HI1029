/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author adde_
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static int binarySearch(Object[] array, int target){
        return binarySearch(array,target, 0, array.length-1);
    }
    private static int binarySearch(Object[] array, int target, int first, int last){
        if(first>last){//det här är den från början
            return -1;
        }else{
            int middle = (first + last)/2;
            int compResult = middle - target;
            if(compResult==0){
                return middle;
            }
            else if(compResult<0){
                return binarySearch(array,target, first,middle-1);
            }
            else
            return binarySearch(array,target, middle+1,last);
        }
    }
    
}
