/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author edi
 */
public class ArrayQueue <T> implements QueueADT<T>{
    private final int DEFAULT_CAPACITY = 100;
    private int front;      //primer dato
    private int rear;       //último dato. Apunta donde se puede agregar el próximo dato.
    private T [] queue;
    
    public ArrayQueue(){
        front = rear = 0;
        queue = (T[]) (new Object [DEFAULT_CAPACITY]);
    }
    
    public ArrayQueue(int initialCapacity){
        front = rear = 0;
        queue = (T[]) (new Object [initialCapacity]);
    }
    
    public void enqueue (T element){
        
        if (front == rear)
            expandCapacity();
        queue[rear] = element;
        rear = (rear+1)%queue.length;
    }
    
    public T dequeue (){
        if (isEmpty())
            throw new EmptyCollectionException();
        
        T result = queue[front];
        queue[front] = null;
        front = (front+1)&queue.length;
        
        return result;
    }
    
    public void expandCapacity(){
        T[] larger = (T[]) (new Object[queue.length*2]);
        
        for (int i=0; i<queue.length;i++){
            larger[i] = queue[front];
            front=(front+1)%queue.length;
        }
        front = 0;
        rear = queue.length;
    }
 
    public T first() {
        if (isEmpty())
            throw new EmptyCollectionException();
        return queue[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }
}
