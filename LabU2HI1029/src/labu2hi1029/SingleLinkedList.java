/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu2hi1029;

/**
 *
 * @author adde_
 */
public class SingleLinkedList<E> {
    
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
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

}
