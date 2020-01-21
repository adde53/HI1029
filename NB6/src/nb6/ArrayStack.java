/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb6;

/**
 *
 * @author adde_
 */
import java.util.EmptyStackException;
import java.util.Arrays;
public class ArrayStack<E> implements StackInt<E> {
     private E[] data;
     private int top;
     private int maxSize;
     public ArrayStack() {
        top = -1;
        maxSize = 10;
        data = (E[]) new Object[maxSize];
     }
     @Override
     public E push(E obj) {
        if (top == maxSize-1) {
         reallocate();
        }
        top++;
        data[top] = obj;
     return obj;
     }
    @Override
     public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return data[top--];
     }
     @Override
     public E peek() {
        if (empty()) {
          throw new EmptyStackException();
        }
        return data[top];
     }
     @Override
    public boolean empty() {
        return top == -1;
    }
     private void reallocate() {
        maxSize*=2;
        data=Arrays.copyOf(data,maxSize);
     }
     public int size(){
        if (empty()) {
            throw new EmptyStackException();
        }
         return top+1;
     }
     public E peek(int n){
        if (empty()) {
            throw new EmptyStackException();
        }
        return data[n];
     }
     public E flush(){
        if (empty()) {
            throw new EmptyStackException();
        }
        E lastObject = data[top];
        Arrays.fill(data, null);
        top = -1;
        return lastObject;
     }
}