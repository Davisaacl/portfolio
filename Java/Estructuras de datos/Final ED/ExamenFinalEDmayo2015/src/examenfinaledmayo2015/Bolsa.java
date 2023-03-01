package examenfinaledmayo2015;

import java.util.Iterator;

/**
 * 
 */
public class Bolsa<T> implements BolsaADT<T> {

    private NodoDoble<T> primero, ultimo;

    public Bolsa() {
        primero = null;
        ultimo = null;
    }

    public Iterator<T> iterator() {
        return new IteradorDoble(primero);
    }

    //Siempre agrega al inicio
    public void agrega(T dato) {
        if (dato != null) {
            NodoDoble<T> nuevo = new NodoDoble(dato);
            if (primero == null) {
                primero = nuevo;
                ultimo = nuevo;
            } else {
                nuevo.setDer(primero);
                nuevo.getDer().setIzq(nuevo);
                primero = nuevo;
            }
        }
    }

    public boolean elimina(T dato) {
        if (dato == null) {
            return false;
        } else {
            return elimina(dato, primero, false, null);
        }
    }

    private boolean elimina(T dato, NodoDoble<T> aux, boolean resp, NodoDoble<T> ant) {
        if (aux != null) {
            if (aux.getDato().equals(dato)) { //El dato buscado esta en ese nodo
                if (aux == primero) { //El dato buscado esta en la primero posicion
                    if (aux.getDer() == null) { //Solo hay un elemento
                        aux = aux.getDer();
                        primero = null;
                        return true;
                    } else { //Hay mas de un elemento
                        aux = aux.getDer();
                        aux.getIzq().setDer(null);
                        aux.setIzq(null);
                        primero = aux;
                        return elimina(dato, aux, true, null);
                    }
                } else if (aux == ultimo) { // El dato buscado esta en la ultima posicion
                    aux = aux.getIzq();
                    aux.getDer().setIzq(null);
                    aux.setDer(null);
                    ultimo = aux;
                    return true;
                } else { //El dato buscado esta en alguna posicion en medio
                    aux.getIzq().setDer(aux.getDer());
                    aux.getDer().setIzq(aux.getIzq());
                    ant = aux;
                    aux = aux.getDer();
                    ant.setIzq(null);
                    ant.setDer(null);
                    return elimina(dato, aux, true, null);
                }
            } else { //El dato buscado no esta en el nodo, se avanza al siguiente
                return elimina(dato, aux.getDer(), resp, null);
            }
        } else { //Se termino de recorrer la estructura
            return resp;
        }
    }

    //Metodo extra, auxiliar para BolsaPlus
    //Cuenta cuantos elementos iguales al dato dado hay
    public int buscaCuantos(T dato) {
        int cont = 0;
        NodoDoble<T> aux = primero;
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                cont++;
            }
            aux = aux.getDer();
        }
        return cont;
    }

    public static void main(String[] args) {
        Bolsa<Integer> x = new Bolsa();
        x.agrega(4);
        x.agrega(2);
        x.agrega(2);
        x.agrega(1);
        x.agrega(3);

        x.elimina(2);
        Iterator<Integer> it = x.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
