/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb7.pkg1;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author adde_
 */
public class PostfixEvaluator {
    public static class SyntaxErrorException extends Exception {
        SyntaxErrorException(String message) {
            super(message);
        }
    }
    private static final String OPERATORS = "+-*/";
    private Stack<Integer> operandStack;
    
    private int evalOp(char op) {
        int rhs = operandStack. pop() ;
        int lhs = operandStack. pop() ;
        int result = 0; 
        switch (op) {
            case '+':
                result = rhs + lhs;
                break;
            case '-':
                result = rhs - lhs;
                break;
            case '*':
                result = rhs * lhs;
                break;
            case '/':
                result = rhs / lhs;
                break;
            default:
                break;
        }
        
        return operandStack.push(result);
        //hit skickar vi en operator den ska nu utföras på de två översta talen på stacken som ska tas bort. Sedan ska resultatet upp på stacken
    }
    private boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }
    public int eval(String expression) throws SyntaxErrorException {
    //skapa en stack för denna beräkning
        operandStack = new Stack<>();
        String[] tokens = expression.split(" +");//delar upp strängen vid mellanslag
        try {
            for(String nextToken : tokens){
                if (Character.isDigit(nextToken.charAt(0))) {
                    operandStack.push(Integer.parseInt(nextToken));
                    // det kommer ett tal så använd Integer.parseInt(nextToken)) och lägg det på stacken!
                }
                else if (isOperator(nextToken.charAt(0))) {
                    evalOp(nextToken.charAt(0));
                    // det kommer en operator så anropa evalOp för att göra beräkningen med operatorn
                } else {
                    throw new SyntaxErrorException("Invalid character encountered");
                }
            }
            //Vi har läst hela uttrycket och gjort alla beräkningar så dags att ta ut svaret som borde vara det enda kvar på stacken
            //Om stacken inte är tom kasta ett syntax error annars returnera resultatet
        } catch (EmptyStackException ex) {
                throw new SyntaxErrorException("Syntax Error: The stack is empty");
        }
        return operandStack.peek();
    }
}
