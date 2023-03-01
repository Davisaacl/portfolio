/*
CCS
13 de febrero del 2018
Clase PilaA
 */
package proyecto;


public class PilaA <T> implements PilaADT<T>{
    private T[] colec;
    private int tope;
    private final int MAX=100;

    public PilaA() {
        colec=(T[]) new Object[MAX];
        tope=-1;
    }
    public PilaA(int max){
        colec=(T[]) new Object[max];
        tope=-1;
    }
    public boolean isEmpty(){
        return tope==-1;
    }
    public void push (T dato){
        if(tope==colec.length)
            expandCapacity();
        tope++;
        colec[tope]=dato;
    }
    
    
    public T pop(){
        T res=null;
        if(!isEmpty()){
            res=colec[tope];
            colec[tope]=null;
            tope--;
        }
        return res;
    }
    public T peek(){
        T res=null;
        if(!isEmpty())
            res=colec[tope];
        return res;
    }
    
    
    private void expandCapacity(){
        T nuevo[]=(T[]) new Object[colec.length*2];
        
        for(int i=0; i<=tope; i++)
            nuevo[i]= colec[i];
        colec=nuevo;
    }
    public boolean equals(Object  obj){
        boolean res=false;
        try{
            res= iguales(((PilaA)obj), this);
        }
        catch(Exception e){
        }
        return res;
    }
    
    
    private static <T> boolean iguales(PilaADT<T> p1, PilaADT<T> p2){
        boolean res=false;
        
        if(p1!=null && p2!=null){
            PilaA<T> auxP1= new PilaA<T>();
            PilaA<T> auxP2= new PilaA<T>();
        
            while(!p1.isEmpty()&&!p2.isEmpty()&&res && p1.peek().equals(p2.peek())){
                auxP2.push(p2.pop());
                auxP1.push(p1.pop());
            }   
            if(p2.isEmpty()&& p1.isEmpty())
                res=true;
            while(!auxP1.isEmpty()){
                p1.push(auxP1.pop());
                p2.push(auxP2.pop());
            }
        }
        return res;
    }
}
