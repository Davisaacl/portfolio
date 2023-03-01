/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialalumnos;

/**
 *
 * @author agomezdg
 */
public class Pregunta3 {
    public static void main(String args[]) {
        ArrayQueue<Object> cola1=new ArrayQueue();
        ArrayQueue<Integer> cola2=new ArrayQueue();
        ArrayQueue<Character> cola3=new ArrayQueue();
        ArrayQueue<Double> cola4=new ArrayQueue();
        
        cola1.enqueue(new String("hola"));
        cola1.enqueue(new Integer(3));
        cola1.enqueue(new Double(3.1416));
        cola1.enqueue(new Integer(-17));
        // Debería imprimir: 3
        System.out.println("Primera prueba...se eliminó: "+eliminaSegundo(cola1));
        // Debería imprimir: hola 3.1416 -17
        System.out.println("Cola resultante: "+imprimeCola(cola1));
        
        // Debería imprimir: null
        System.out.println("Segunda prueba...se eliminó: "+eliminaSegundo(cola2));
        // Debería imprimir: (nada, cola vacía)
        System.out.println("Cola resultante: "+imprimeCola(cola2));
        
        cola3.enqueue(new Character('A'));
        cola3.enqueue(new Character('Z'));
        // Debería imprimir: Z
        System.out.println("Tercera prueba...se eliminó: "+eliminaSegundo(cola3));
        // Debería imprimir: A
        System.out.println("Cola resultante: "+imprimeCola(cola3));
        
        cola4.enqueue(new Double(3.1416));
        // Debería imprimir: null
        System.out.println("Cuarta prueba...se eliminó: "+eliminaSegundo(cola4));
        // Debería imprimir: 3.1416
        System.out.println("Cola resultante: "+imprimeCola(cola4));
    }
    
    // Elimina y regresa el segundo elemento de una cola, contando desde el
    // inicio (frente) hacia atrás.  En caso de que la cola no tenga por lo
    // menos dos elementos, deja intacta la cola y regresa "null".  Utiliza
    // una cola auxiliar:
    public static <T> T eliminaSegundo(ArrayQueue<T> cola) {
        T var = null;
        
        if (cola!=null){
            ArrayQueue <T> aux = new ArrayQueue<T>();
            
            int cont = 0;
            while(!cola.isEmpty()){
                if (cont==1)
                    var=cola.dequeue();
                if(!cola.isEmpty())
                    aux.enqueue(cola.dequeue());
                cont++;
            }
            while(!aux.isEmpty())
                cola.enqueue(aux.dequeue());
        }
        
        return var;

    }
    
    // Imprime el contenido de una cola, de forma no destructiva, escribiendo
    // de izquierda a derecha los elementos empezando por el que está en el
    // inicio (frente) de la cola y terminando por el que está hasta atrás
    // (hasta el final) de la cola:
    public static <T> String imprimeCola(ArrayQueue<T> cola) {
        StringBuilder cad = new StringBuilder("");
        
        if(cola!=null){
            ArrayQueue <T> aux = new ArrayQueue<T>();
            
            while(!cola.isEmpty()){
                cad.append(cola.first().toString() + ' ');
                aux.enqueue(cola.dequeue());
            }
            while(!aux.isEmpty())
                cola.enqueue(aux.dequeue());
        }
        return cad.toString();
    }
}
