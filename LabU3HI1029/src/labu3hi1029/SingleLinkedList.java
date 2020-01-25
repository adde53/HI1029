/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu3hi1029;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author adde_
 */
public class SingleLinkedList<E> implements Iterable<E>{
    
    private Node<E> head;
    private int size;
    public SingleLinkedList(){
        
        head = null;
        size = 0;
    }
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }
    public void addFirst(E item) {
        head = new Node<E>(item, head);
        size++;
    }
    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
            //System.out.println("hejas");
        }
    return node;
    }
    private void addAfter(Node<E> node, E item) {
        node.next = new Node<E>(item, node.next);
        size++;
    }
    public boolean add(E item) {
        add(size, item);
        return true;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        //System.out.println("hejas");
        Node<E> node = getNode(index);
        return node.data;
    }
    @Override
    public Iterator<E> iterator() {
        return new Itr(head);
    }

    public E remove(int index){
        
        Node<E> node = getNode(index-1);
        Node<E> temp = node.next;//getNode(index);//head.next;
        //System.out.println("hejas");
        if(index == 0)
        {
            removeFirst();
            return temp.data;
            //System.out.println("hejas");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if(temp != null){
            node.next = temp.next;
            size--;
            return temp.data;
        }
        else
        return null;
    }
    
    public int size(){
        
        return size;
    }
    private E removeFirst(){
        Node<E> temp = head;
        if(head != null){
                head = head.next;
        }
        if(temp != null){
            size--;
            return temp.data;
        }
        return null;
    }
    
    
    
    public class Itr implements Iterator<E> {//nested class – ligger i SingleLinkedList
    Node<E> current;
    Node<E> bCurrent;
    Node<E> bBCurrent;
    public Itr(Node<E> start) {
        current = start;
        bCurrent = start;
        bBCurrent = start;
        System.out.println("Current: " + current.data);// + " bCurrenct: " + bCurrent.data + " bBCurrent: " + bBCurrent.data);
    }
    @Override
    public boolean hasNext() {
        return current != null; 
    }
    @Override
    public E next() {
    if (current == null) {
        throw new NoSuchElementException();
    }
    if(bCurrent==bBCurrent){
        E returnValue = current.data;
        bCurrent = current;
        current = current.next;
        return returnValue;
    }
        E returnValue = current.data;
        bBCurrent = bCurrent;
        bCurrent = current;
        current = current.next;
        System.out.println("returnValue: " + returnValue + ",");
    return returnValue;
    }
    
    @Override
    public void remove(){
        //System.out.println("Current: " + current.data);
        if(!hasNext() || bBCurrent == bCurrent && (bCurrent.next!=current)){
            throw new UnsupportedOperationException();
        }
        if(bBCurrent == bCurrent && (bCurrent.next==current)){
            
            removeFirst();
            bCurrent = current;
            bBCurrent = current;
            size--;
        }
        else{
            System.out.println("HEEEEJ");
            System.out.println("Current: " + current.data);
            Node<E> node = bBCurrent.next;
            bCurrent = bBCurrent;
            bBCurrent.next = node.next;
            
            //current = current.next;
            size--;
        }
        
    }
    @Override
    public String toString(){
        String info = "Current: " + current.data+ " bCurrenct:" + bCurrent.data + " bBCurrent:" + bBCurrent.data;
        return info;
    }
 }
}
