/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;


/**
 *
 * @author adde_
 */
public class StackTest<E> implements StackInt<E>{

    //private Stack<ArrayList> s = new Stack<>();
    private E array[];
    private int top;
    private int maxSize;
    
    public StackTest(){
        top = -1;
        maxSize=10;
        array = (E[]) new Object[maxSize];
    }

    @Override
    public E push(E obj) {
        if(top == maxSize-1){
            reallocate();
        }
        top++;
        array[top] = obj;
        return obj;
    }

    @Override
    public E peek() {
        if(empty()){
            throw new EmptyStackException();
        }
        return array[top];
    }

    @Override
    public E pop() {
        if(empty()){
            throw new EmptyStackException();
        }
        return array[top--];
    }
    public void reallocate(){
        maxSize *=2;
        array = Arrays.copyOf(array, maxSize);
    }

    @Override
    public boolean empty() {
        
        return top==-1;
    }

 
    
    
}
