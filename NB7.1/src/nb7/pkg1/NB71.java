/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb7.pkg1;

import java.util.Scanner;

/**
 *
 * @author adde_
 */
public class NB71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            PostfixEvaluator evaluator = new PostfixEvaluator();
            String line;
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.println("Enter a postfix expression to evaluate");
                line = in.nextLine();
                if(!line.equals("")){
                    try {
                        int result = evaluator.eval(line);
                        System.out.println("Value is " + result);
                    } catch (PostfixEvaluator.SyntaxErrorException ex) {
                        System.out.println("Syntax error " + ex.getMessage());
                    }
                } else {
                    break;
                }
            }
    }
    
}
