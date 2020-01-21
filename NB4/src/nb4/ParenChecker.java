/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb4;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author adde_
 */
public class ParenChecker {
    
    
    private static String OPEN = "({["; 
    private static String CLOSED = ")}]";
    public static boolean isBalanced(String expression){
        Stack<Character> stackTest = new Stack<>();
        boolean balanced = true;
        try{
            int index = 0;
            while(balanced && index<expression.length()){
                char nextCh = expression.charAt(index); 
                if(isOpen(nextCh)){
                    stackTest.push(nextCh);                
                }
                else if(isClosed(nextCh)){//den är stängd
                    char topCh = stackTest.pop();//pop returnerar det översta objektet som nu har tagits bort
                    balanced = OPEN.indexOf(topCh) == CLOSED.indexOf(nextCh);//kollar om den öppna är sann och den stängda är sann då är det balanserat
                }
                index++;
            }
        }
        catch(EmptyStackException ex){
                balanced = false;
        }
        return (stackTest.empty() && balanced);
    }
    public static boolean isOpen(char ch){
        return OPEN.indexOf(ch)>-1;
    }
    public static boolean isClosed(char ch){
        return CLOSED.indexOf(ch) > -1;
    }
}
