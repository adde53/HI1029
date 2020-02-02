/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu5hi1029;

import java.util.Arrays;

/**
 *
 * @author adde_
 */
public class LabU5HI1029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] characters ={'B','E','C','A','D'};
        char[] outPut ={'A','B','C','D','E'};
        //robot(test, 0, outPut,"");
        System.out.println("Tar "+robot(characters, outPut) + " steg: " + temp);
    }
    public static int robot(char[] characters, char[] output){
        return robot(characters, 0, output, "");
    }
    private static String temp = "ssssssssssssssssssssssssssssssssssssss";
    private static int robot(char[] characters, int moves, char[] outPut, String bs){
        if(moves > 10){
            return Integer.MAX_VALUE;
        }
        if(Arrays.equals(characters, outPut)){
           /* for(int i = 0; i<characters.length; i++){
                System.out.print(characters[i] + "");
            }*/
            if(temp.length()>bs.length()){
                temp = bs;
            }
            return moves;
        }
        int s = robot(swift(characters),moves+1,outPut,bs+"s");
        int b = robot(byta(characters),moves+1,outPut,bs+"b");
        if(s>b){
            
            return b;
        }
        else{
            return s;
        }
    }

    public static char[] byta(char[] characters){
       char temp; 
       char temp2;
       temp = characters[0];
       temp2 = characters[1];
       characters[0] = temp2;
       characters[1] = temp;
       return characters;
    }
    public static char[] swift(char[] characters){
        char temp[] = new char[characters.length];
        char rightChar = characters[characters.length-1];
        for(int i = 1; i<characters.length;i++){
            temp[i] = characters[i-1];
        }
        temp[0] = rightChar;
        return temp;
    }
}
