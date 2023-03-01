/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialalumnos;

/**
 *
 * @author agomezdg
 */

public class Pregunta2 {
    public static void main(String args[]) {
        ArrayStack<Object> pila1=new ArrayStack();
        ArrayStack<Integer> pila2=new ArrayStack();
        ArrayStack<Character> pila3=new ArrayStack();
        ArrayStack<Double> pila4=new ArrayStack();
        
        pila1.push(new String("hola"));
        pila1.push(new Integer(3));
        pila1.push(new Double(3.1416));
        pila1.push(new Integer(-17));
        // Debería imprimir: 3.1416
        System.out.println("Primera prueba...se eliminó: "+eliminaSegundo(pila1));
        // Debería imprimir: hola 3 -17
        System.out.println("Pila resultante: "+imprimePila(pila1));
        
        // Debería imprimir: null
        System.out.println("Segunda prueba...se eliminó: "+eliminaSegundo(pila2));
        // Debería imprimir: (nada, lista vacía)
        System.out.println("Pila resultante: "+imprimePila(pila2));
        
        pila3.push(new Character('A'));
        pila3.push(new Character('Z'));
        // Debería imprimir: A
        System.out.println("Tercera prueba...se eliminó: "+eliminaSegundo(pila3));
        // Debería imprimir: Z
        System.out.println("Pila resultante: "+imprimePila(pila3));
        
        pila4.push(new Double(3.1416));
        // Debería imprimir: null
        System.out.println("Cuarta prueba...se eliminó: "+eliminaSegundo(pila4));
        // Debería imprimir: 3.1416
        System.out.println("Pila resultante: "+imprimePila(pila4));
    }
    
    // Elimina y regresa el segundo elemento de una pila, contando desde arriba
    // (desde el tope) hacia abajo.  En caso de que la pila no tenga por lo
    // menos dos elementos, deja intacta la pila y regresa "null":
    public static <T> T eliminaSegundo(ArrayStack<T> pila) {
        T eliminado = null;
        T aux;
        
        if(pila!=null){
            if (!pila.isEmpty()){
                aux=pila.pop();
                if(!pila.isEmpty())
                    eliminado = pila.pop();
                pila.push(aux);
            }
        }
        return eliminado;
    }
    
    // Imprime el contenido de una pila, de forma no destructiva, escribiendo
    // de izquierda a derecha los elementos empezando por el que está en el
    // fondo de la pila y terminando por el que está en el tope de la pila:
    public static <T> String imprimePila(ArrayStack<T> pila) {
        StringBuilder cad = new StringBuilder("");
        ArrayStack <T> aux = new ArrayStack();
        T palabra = null;
        
        if (pila != null){
            while (!pila.isEmpty())
                aux.push(pila.pop());
            while (!aux.isEmpty()){
                palabra = aux.pop();
                cad.append(palabra);
                if(!aux.isEmpty())
                    cad.append(" ");
                pila.push(palabra);
            }
                
        }
        return cad.toString();

    }
}
