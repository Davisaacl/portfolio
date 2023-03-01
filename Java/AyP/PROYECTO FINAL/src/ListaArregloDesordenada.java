/* David López	CU:173993
 * 08/05/2018
 * LISTA ARREGLO DESORDENADA
 */
public class ListaArregloDesordenada <T> {
	private T[] a;
	private int n;
	private final int MAX = 50;
	
	public ListaArregloDesordenada(){
		a = (T[]) new Object[MAX];
		n = 0;
	}
	
	public ListaArregloDesordenada(int max){
		a = (T[]) new Object[max];
		n = 0;
	}
	
	public ListaArregloDesordenada (T arr[]){
		int tam;
		
		if (arr.length>MAX)
			tam = arr.length*2;
		else
			tam = MAX;
		a = (T[]) new Object [tam];
		n = arr.length;
		for (int i=0;i<n;i++)
			a[i]=arr[i];
	}
	
	public boolean add(T x, int pos){
		boolean resp = false;
		
		if (pos>=0){
			if (n==a.length)
				expandCapacity();
			ManejadorArreglosGenerico.unCorrimientoDerecha(a, n, pos);
			a[pos] = x;
			resp = true;
			n++;
		}
		return resp;
	}
	
	public void addFirst(T x){
		add(x,0);
	}
	
	public void addLast (T x){
		add(x,n);
	}
	
	public T remove (int pos){
		T resp = null;
		
		if (pos<n && pos>=0){
			resp = a[pos];
			ManejadorArreglosGenerico.unCorrimientoIzquierda(a, n, pos);
			n--;
		}
		return resp;
	}
	
	public T remove (T x){	// invocar remove (pos)
		int pos;
		T resp = null;
		
		pos = ManejadorArreglosGenerico.busquedaSecuencialDesordenada(a, n, x);
		resp = remove(pos);
		return resp;
	}
	
	public int indexOf(T x){
		return ManejadorArreglosGenerico.busquedaSecuencialDesordenada(a, n, x);
	}
	
	public T get(int pos){
		T resp = null;
		
		if (pos<n && pos>=0)
			resp = a[pos];
		return resp;
	}
	
	public boolean contains(T x){
		boolean resp = false;
		int pos;
		
		pos = ManejadorArreglosGenerico.busquedaSecuencialDesordenada(a, n, x);
		if (pos>=0)
			resp = true;
		return resp;
	}
	
	public int size(){
		return n;
	}
	
	public boolean isEmpty(){
		boolean resp = false;
		
		if (n==0)
			resp = true;
		return resp;
	}
	
	public void clear(){
		a = (T[]) new Object[MAX];
		n=0;
	}
	
	public void expandCapacity(){
		T arr[];
		
		arr =(T[]) new Object [a.length*2];	
		for (int i=0;i<n;i++)
			arr[i] = a[i];
		a = arr;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		for (int i=0;i<n;i++)
			cad.append("\n " + a[i].toString());
		return cad.toString();
	}
}
