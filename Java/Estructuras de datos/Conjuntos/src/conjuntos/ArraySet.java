/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

/**
 *
 * @author edi
 */
public class ArraySet <T> implements SetADT<T>{
    private static final int DEFAULT_CAPACITY = 100;
    private static Random rand = new Random();
    private static final int NOT_FOUND = -1;
    private int count;
    private T[] contents;
    
    public ArraySet (int initialCapacity){
        count = 0;
        contents = (T[]) ()
    }
    
}
