/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu2hi1029;

/**
 *
 * @author AndreasOlsson
 */
public class SingleLinkedList<E> {
    
    private static class Node<E> {
        private E data;
        private Node<E> next;
        //private Node<E> prev;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node<E> tail;
    private Node<E> head;
    private int size;
    public SingleLinkedList(){
        head = null;
        tail = head;
        size = 0;
    }
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            //System.out.println("Hejasasda");
            addFirst(item);
        } 
        else if(index == size){
            //System.out.println("" + tail.data);
            addOnTail(item);
        }
        /*else {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }*/
        //tail = getNode(size-1);
    }
    public void addOnTail(E item) {
        System.out.println("Tja");
        
        Node<E> node = new Node<>(item,null);
        
        tail.next = node;
        tail = node;
        
        node.next = head;
        node.next = new Node<>(item, node);
        //tail.next = node;
        //tail = node;
        size++;
    }

    public void addFirst(E item) {
        
        
        head = new Node<>(item, head);
        if(tail == null){
            tail = head;
        } 
        size++;
        //tail = getNode(size-1);
    }
    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node.next != null; i++) {
            node = node.next;
            //System.out.println("Data" + node.data);
        }
    return node;
    }
    
    private void addAfter(Node<E> node, E item) {
        node.next = new Node<E>(item, node.next);
        //tail = node.next;
        //tail = getNode(size-1);
        size++;
    }
    public boolean add(E item) {
        add(size, item);
        //tail = getNode(size-1);
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
            //tail = getNode(size-1);
            tail = node;
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
    
    @Override
    public String toString(){
        String info = "Tail: "+ tail.data;
        return info;
    }
}
