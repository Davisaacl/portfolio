/* David López	CU:173993
 * 02/05/2018
 * LISTA ARREGLO ORDENADA
 */
public class ListaArregloOrdenada <T extends Comparable<T>> {
	
	private T[] a;
	private int n;
	private final int MAX = 50;
	
	public ListaArregloOrdenada(){
		a = (T[]) new Comparable[MAX];
		n = 0;
	}
	
	public ListaArregloOrdenada(int max){
		a = (T[]) new Comparable[max];
		n = 0;
	}
	
	public ListaArregloOrdenada (T arr[]){
		int tam;
		
		if (arr.length>MAX)
			tam = arr.length*2;
		else
			tam = MAX;
		a = (T[]) new Comparable [tam];
		n = arr.length;
		for (int i=0;i<n;i++)
			a[i]=arr[i];
		ManejadorArreglosGenerico.ordenamientoPorSeleccionDirecta(a, n);
	}
	
	public boolean add(T x){
		boolean resp = false;
		
		if (n==a.length)
			expandCapacity();
		a[n] = x;
		ManejadorArreglosGenerico.ordenamientoPorSeleccionDirecta(a, n);
		n++;
		resp = true;
		return resp;
	}
	
	public T remove(int pos){
		T resp = null;
		
		if (pos<n && pos>=0){
			resp = a[pos];
			ManejadorArreglosGenerico.unCorrimientoIzquierda(a, n, pos);
		}
		return resp;
	}
	
	public T remove (T x){
		T resp = null;
		int pos;
	
		pos = ManejadorArreglosGenerico.busquedaBinaria(a, n, x);
		if (pos>=0){
			resp = a[pos];
			remove(pos);
		}
		return resp;
	}
	
	
	public int size(){
		return n;
	}
	
	public int indexOf(T x){
		return ManejadorArreglosGenerico.busquedaBinaria(a, n, x);
	}

	public boolean contains(T x){
		return indexOf(x) == 0 ? true: false;
	}
	
	public void clear(){
		for (int i=0;i<n;i++)
			a[i] = null;
		n = 0;
	}
	
	private void expandCapacity(){
		T arr[] = null;
		
		if (n==a.length)
			arr =(T[]) new Comparable [a.length*2];
		for (int i=0;i<n;i++)
			arr[i] = a[i];
	}
	
	public boolean isEmpty(){
		return n==0 ? true:false;
	}
	
	public T get(int indice){
		T resp = null;
		
		if (indice<n)
			resp = a[indice];
		return resp;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		for (int i=0; i<n; i++)
			cad.append("\n " + a[i]);
		return cad.toString();
	}
	
}