/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrayqueue;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author AndreasOlsson
 */
public class ArrayQueue<E> {
    private int size, rear, front,maxSize;
    private E[] data;
    
    public ArrayQueue(int initMaxSize){
        size = 0;
        front = 0;
        maxSize = initMaxSize;
        rear = maxSize - 1;
        data = (E[]) new Object[maxSize];
    }
    public boolean offer(E element){
        if(size == maxSize){
            reallocate();
        }
        //Skriv kod som sätter in elementet, strunta i problement med att arrayen kan bli full
        rear = (rear+1) % maxSize;
        data[rear] = element;
        size++;
        return true;
    }
    public E peek(int index){
        if(size==0){
            return null;
        }
        return data[index];
    }
    public E poll(){
        if(size == 0){
            return null;
        }
        size--;
        E temp = data[front];
        front = (front+1)%maxSize;
        return temp;
    }
    public int size(){
        return size;
    }
    
    @Override
    public String toString(){
        String info = "List: " + data[1];
        return info;
    }
    public void reallocate(){
        int newMaxSize=maxSize*2;
        E[] newData = (E[]) new Object[newMaxSize];
        int j = front;
        for(int i = 0; i<size;i++){
            newData[i] = data[j];
            j = (j+1)% maxSize;
        }
        front = 0; 
        rear = size - 1;
        maxSize = newMaxSize;
        data = newData;
        
    }
    public Iterator<E> iterator(){
        return new Iter();
    }
    private class Iter implements Iterator<E>{

        private int index;
        private int count = 0; 
        public Iter(){
            index = front;//första elementet i arrayen.
        }
        @Override
        public boolean hasNext() {
            return count < size;
            }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            E returnValue = data[index];
            index = (index + 1)%maxSize;
            count++;
            return returnValue;
        }
        
        
    }
    
}
