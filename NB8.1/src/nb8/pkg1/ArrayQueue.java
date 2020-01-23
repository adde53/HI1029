/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb8.pkg1;

import java.util.Arrays;

public class ArrayQueue<E>{
	private int front, rear, size, maxSize;
	private E[] data;

	public ArrayQueue(int initialSize){
		size = 0;
		front = 0;
		maxSize = initialSize;
		rear = maxSize - 1; //rear = 0;
		data = (E[]) new Object[maxSize];
	}

	public boolean offer(E element){
		if(size==maxSize)
			reallocate();
		//data[rear] = element;
                rear = (rear+1)%maxSize;
                data[rear] = element;
		size++;
		return true;
	}

	public E peek(){
		if(size==0) return null;
		return data[front];
	}

	public E poll(){
		if(size==0){
			return null;
		}else{
			size--;
			E element = data[front];
			front = (front+1)%maxSize;
			return element;
		}	
	}

	private void reallocate() {
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
        public int size(){
            return size;
        }

        @Override
        public String toString(){
            String info = "Size: " + size + " Front: " + front + " Rear: " + rear + " MaxSize: " + maxSize;
            return info;
        }


}
