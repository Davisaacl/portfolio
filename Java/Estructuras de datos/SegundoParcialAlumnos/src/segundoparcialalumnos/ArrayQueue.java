/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package segundoparcialalumnos;

/**
 *
 * @author agomezdg
 */
public class ArrayQueue<T> implements QueueADT<T> {
    private final int DEFAULT_CAPACITY=100;
    private int front,rear;
    private T[] queue;

    public ArrayQueue() {
        front=rear=0;
        queue=(T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayQueue(int initialCapacity) {
        front=rear=0;
        queue=(T[])(new Object[initialCapacity]);
    }

    public void enqueue(T element) {
        if(front==rear&&queue[front]!=null)
            expandCapacity();
        queue[rear]=element;
        rear=(rear+1)%queue.length;
    }

    private void expandCapacity() {
        T[] larger=(T[])(new Object[queue.length*2]);
        int i;

        for(i=front;i<queue.length;i++)
            larger[i-front]=queue[i];
        if(rear==front)
            for(i=0;i<rear;i++)
                larger[queue.length-front+i]=queue[i];
        front=0;
        rear=queue.length;
        queue=larger;
    }

    public T dequeue() {
        if(isEmpty())
            throw new EmptyCollectionException("Cola vacía.");
        else {
            T result=queue[front];
            queue[front]=null;
            front=(front+1)%queue.length;

            return result;
        }
    }

    public T first() {
        if(isEmpty())
            throw new EmptyCollectionException("Cola vacía.");
        else {
            T result=queue[front];

            return result;
        }
    }

    public boolean isEmpty() {
        boolean result=false;

        if(front==rear&&queue[front]==null)
            result=true;

        return result;
    }
}
