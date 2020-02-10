/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu5hi10299;

import java.util.Arrays;

/**
 *
 * @author AndreasOlsson
 */
public class LabU5HI10299 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] characters ={'B','E','C','A','D'};
        char[] outPut ={'A','B','C','D','E'};
        //robot(test, 0, outPut,"");
        System.out.println("Tar "+robot(characters, outPut).length() + " steg: " + robot(characters, outPut));
    }
    public static String robot(char[] characters, char[] output){
        return robot(characters, 0, output, "");
    }
    private static String robot(char[] characters, int moves, char[] outPut, String bs){
        if(moves > 15){
            return bs;
        }
        if(Arrays.equals(characters, outPut)){
            return bs;
        }
        String s = robot(swift(characters),moves+1,outPut,bs+"s");
        String b = robot(byta(characters),moves+1,outPut,bs+"b");
        if(s.length()>b.length()){
            return b;
        }
        else{
            return s;
        }
    }

    public static char[] byta(char[] characters){
       char temp; 
       temp = characters[0];
       characters[0] = characters[1];
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
