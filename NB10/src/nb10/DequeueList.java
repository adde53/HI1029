/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb10;

import java.util.NoSuchElementException;

/**
 *
 * @author adde_
 */
public class DequeueList<E> {
    
    private Node<E> front;
    private Node<E> rear;
    private int size = 0;
    public E pollFirst(){
        if(front == null){
            throw new NoSuchElementException();
        }
        Node<E> temp = front;
        Node<E> tempNext = front.getNext();
        if(tempNext != null) tempNext.setPrev(null);
        if(tempNext == null) rear = null;
        front = tempNext;
        return temp.data;
    }
    public E pollLast(){
        if(rear == null){
            throw new NoSuchElementException();
        }
        //remove an item from the beginning of the queue
        Node<E> tmpRear = rear;
        Node<E> tmpRearPrev = rear.getPrev();
        if(tmpRearPrev != null) tmpRearPrev.setNext(null);
        if(tmpRearPrev == null) front = null;
        rear = tmpRearPrev;
        return tmpRear.data;
    }
    public boolean offerFirst(E item){
        System.out.println("adding first: "+item);
        Node<E> node = new Node<>();
        node.setData(item);
        node.setNext(front);
        if(front !=null){
            front.setPrev(node);
        }
        if(front == null){
            rear = node;
        }
        size++;
        front = node; 
        return true;
    }
    public boolean offerLast(E item){
        System.out.println("adding last: "+item);
        Node<E> node = new Node<>();
        node.setData(item);
        node.setPrev(rear);
        if(rear != null) rear.setNext(node);
        if(rear == null) front = node;
        size++;
        rear = node;
        return true;
    }
    public int size(){
        return size;
    }
    public boolean empty(){
        if(empty()){
            return true;
        }
        return false;
    }
    // NODE
    class Node<E>{
        private Node<E> prev;
        private Node<E> next;
        private E data;
        
    public Node<E> getPrev(){
        return prev;
        
    }
    public void setPrev(Node<E> prev){
        this.prev = prev;
    }
    public Node<E> getNext(){
        return next;
    }
    public void setNext(Node<E> next){
        this.next = next;
    }
    public E getData(){
        return data;
    }
    public void setData(E data){
        this.data = data;
    }
    }
}
