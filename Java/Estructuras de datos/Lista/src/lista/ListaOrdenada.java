/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Iterator;

/**
 *
 * @author Shanti
 */
public class ListaOrdenada<T extends Comparable<T>> extends Lista<T> implements ListaOrdenadaADT<T> {
//que esta T sea reemplazable por objetos que implementen Comparable
    
public ListaOrdenada() {
        super();
    }

//    public void agrega(T dato) {
//        NodoDoble<T> nuevo = new NodoDoble(dato);
//        if (this.estaVacia()) {
//            primero = nuevo;
//        } else if (primero.getDato().compareTo(dato) >= 0) {
//            nuevo.setSiguiente(primero);
//            primero = nuevo;
//        } else {
//            NodoDoble<T> ant, act;
//            act = primero;
//            ant = primero;
//            while (act != null && act.getDato().compareTo(dato) < 0) {
//                ant = act;
//                act = act.getSiguiente();
//            }
//            ant.setSiguiente(nuevo);
//            nuevo.setSiguiente(act);
//        }
//    }

    public boolean agregaNR(T dato) {
        boolean resp = true;
        NodoDoble<T> nuevo = new NodoDoble(dato);
        if (this.estaVacia()) {
            primero = nuevo;
        } else if (primero.getDato().compareTo(dato) > 0) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else {
            NodoDoble<T> ant, act;
            act = primero;
            ant = primero;
            while (act != null && act.getDato().compareTo(dato) < 0) {
                ant = act;
                act = act.getSiguiente();
            }
            if ((act != null && !act.getDato().equals(dato)) || act == null) {
                ant.setSiguiente(nuevo);
                nuevo.setSiguiente(act);
            } else {
                resp = false;
            }
        }
        return resp;
    }

	public boolean contains (T dato){
		boolean resp;
		resp=false;
			if(dato!=null &&  !estaVacia())
				resp=contains(dato,iterator());
		return resp;
}
	private boolean contains (T dato, Iterator<T> it){
		if(!it.hasNext())
			return false;
		else{
			T temp;
			temp=it.next();
			if(temp.equals(dato))
			return true;
			else
				if(temp.compareTo(dato)>0)
					return false;
				else
					return contains(dato,it);
            }

        }
//	public boolean contains (T dato){
//		boolean resp;
//		resp=false;
//		if(dato!=null &&  !estaVacia() && dato.compareTo(ultimo.getDato())<=0)
//			if(dato.equals(ultimo.getDato())
//		resp=true;
//		else
//		resp=contains(dato,iterator());
//	return resp;
//}
//// mas grade que el ultimo que yo tenia para este caso ni funciona.
//	private boolean contains (T dato, Iterator<T> it){
//		//minimo tengo un nodo
//			T temp;
//			temp=it.next();
//			if(temp.equals(dato))
//			return true;
//			else
//				if(temp.compareTo(dato)>0)
//					return false;
//				else
//					return contains(dato,it);
//}
//
//CLASE
//-dato nulo
//-que no lo encuentre
//-que este vacío
//-que sea el primero, el ultimo o en posición intermedia
//
//public class T quita(T dato){
//	resul=null;
//	if(dato!=null && !estaVacia() && dato.compareTo(prim.getDato())>=0 && dato.compareTo(ultimo.getDato())<=0)
//		if(dato.equals(primero.getDato()) //el dato sea el primero
//			resul=quitaInicio();
//		else
//		    if(dato.equals(ultimo.getDato())//el dato sea el ultimo
//			resul=quitaUltimo();
//		else
//			resul=quita(dato, ult.getIzq());
//
//		return resul;
//}

//private T quita(T dato, NodoDoble<T> ap){
//	if(dato.equals(ap.getDato()){
//		ap.getDer().setIzq(ap.getIzq());
//		ap.getIzq().setDer(ap.getDer());
//		ap.setDer(null);
//		ap.setIzq(null);
//	  return ap.getDato();
//		}//if
//	else{
//		if(dato.compareTo(ap.getDato()<0)
//			return quita(dato,ap.getIzq());
//		else
//			return null;
//}
////agregamos y sin duplicados
public boolean agrega(T dato){
	boolean resp=false;
	if(dato!=null)
		if(estaVacia() || dato.compareTo(primero.getDato())<0){
			NodoDoble<T> nuevo= new NodoDoble(dato);
                        
			nuevo.setSiguiente(primero);
			if(estaVacia())
				ultimo=nuevo;
			else
				primero.setAnterior(nuevo);
				primero=nuevo;
                                
		}else
			if(dato.compareTo(ultimo.getDato())>0){
				resp=true;
				NodoDoble<T> nuevo= new NodoDoble(dato);
				nuevo.setAnterior(ultimo);
				ultimo.setSiguiente(nuevo);
				ultimo=nuevo;
		}else{
			NodoDoble<T> ap= primero;
			while(dato.compareTo(ap.getDato())>0)
				ap=ap.getSiguiente();
                        
                        NodoDoble<T> nuevo= new NodoDoble(dato);//add
                        nuevo.setAnterior(ap.getAnterior());
                        nuevo.getAnterior().setSiguiente(nuevo);
                        ap.setAnterior(nuevo);
                        nuevo.setSiguiente(ap);
                        }
        return true;
}
					
    @Override
    public boolean contiene(T dato) {
        return contiene(dato, iterator());
    }

    private boolean contiene(T dato, Iterator<T> it) {
        if (it.hasNext()) {
            T aux = it.next();
            if (aux.equals(dato)) {
                return true;
            } else if (aux.compareTo(dato) > 0) {
                return false;
            } else {
                return contiene(dato, it);
            }
        } else {
            return false;
        }
    }
}


