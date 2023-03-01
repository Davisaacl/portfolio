import java.util.ArrayList;

/*
 * David López
 */
public class PruebaManejador {
	
	public static <T> void imprimeArreglo(T arr[], int n){
		for (int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10;
		String arr[] = new String[MAX];
		String arr2[] =  {"David", "Paola", "Hugo", "Sofía", "Carola"};
		String arr3[] = {"Carola", "Paola", "Hugo", "Sofía", "David"};
		ArrayList<T> lista = new ArrayList<T>();
		
		arr[0] = "David";
		arr[1] = "Paola";
		arr[2] = "Hugo";
		arr[3] = "Sofía";
		arr[4] = "Carola";
		lista.add((T) "David");
		
		
		imprimeArreglo(arr,5);
		
		//posMayor
		System.out.println("Posición del mayor: " +ManejadorArreglosGenerico.posMayor(arr, 5));
		
		//posMenor
		System.out.println("Posición del menor: " +ManejadorArreglosGenerico.posMin(arr, 5));
		
		//CuantosMayorX
		System.out.println("Cuántos mayores a Hugo " +ManejadorArreglosGenerico.cuantosMayorX(arr, 5, "Hugo"));
		
		//CuantosMenorX
		System.out.println("Cuántos menores a Hugo " +ManejadorArreglosGenerico.cuantosMenorX(arr, 5, "Hugo"));
		
		//CualesMayoresX
		System.out.println("Cuales mayores a Hugo " +ManejadorArreglosGenerico.cualesMayoresX(arr, 5, "Hugo"));
		
		//CualesMenoresX
		System.out.println("Cuales menores a Hugo " +ManejadorArreglosGenerico.cualesMenoresX(arr, 5, "Hugo"));
		
		//Swap
		System.out.println("Swap");
		ManejadorArreglosGenerico.swap(arr, 0, 4);
		imprimeArreglo(arr,5);
		//SwapRegreso
		ManejadorArreglosGenerico.swap(arr, 0, 4);
		
		//Invierte
		System.out.println("Invierte");
		ManejadorArreglosGenerico.invierte(arr, 5);
		imprimeArreglo(arr,5);
		//InvierteRegreso
		ManejadorArreglosGenerico.invierte(arr, 5);
		
		//Corrimiento k lugares a la derecha
		System.out.println("Corrimiento a la derecha");
		ManejadorArreglosGenerico.corrimientoDerecha(arr, 5, 2);
		imprimeArreglo(arr,7);
		
		//Corrimiento k lugares a la izquierda
		System.out.println("Corrimiento a la izquierda");
		ManejadorArreglosGenerico.corrimientoIzquierda(arr, 7, 2);
		imprimeArreglo(arr,5);
		
		//Corrimiento circular a la derecha
		System.out.println("Corrimiento circular a la derecha");
		ManejadorArreglosGenerico.corrimientoCircularDerecha(arr2, 5, 2);
		imprimeArreglo(arr2,5);
		
		//Corimiento circular a la izquierda
		System.out.println("Corrimiento circular a la izquierda");
		ManejadorArreglosGenerico.corrimientoCircularIzquierda(arr2, 5, 2);
		imprimeArreglo(arr2,5);
		
		//Busqueda Secuencial Desordenada
		System.out.println("Búsqueda secuencial desordenada de Paola");
		System.out.println(ManejadorArreglosGenerico.busquedaSecuencialDesordenada(arr, 5, "Paola"));
		
		//Otro pos min
		System.out.println("Posicion minimo " + ManejadorArreglosGenerico.posMin(arr3, 5, 1));
		
		//Ordenamiento por seleccion directa
		System.out.println("Ordenamiento por selección directa");
		ManejadorArreglosGenerico.ordenamientoPorSeleccionDirecta(arr, 5);
		imprimeArreglo(arr,5);
		
		//Busqueda secuencial ordenada
		System.out.println("Búsqueda sencuencial ordenada");
		System.out.println(ManejadorArreglosGenerico.busquedaSecuencialOrdenada(arr, 5, "Paola"));
		
		//Búsqueda binaria
		System.out.println("Búqueda binaria");
		System.out.println(ManejadorArreglosGenerico.busquedaBinaria(arr, 5, "Paola"));
		
		//Un corrimiento a la derecha
		System.out.println("Un corrimiento a la derecha");
		ManejadorArreglosGenerico.unCorrimientoDerecha(arr, 5, 2);
		imprimeArreglo(arr,6);
		
		//Un corrimiento a la derecha
		System.out.println("Un corrimiento a la izquierda");
		ManejadorArreglosGenerico.unCorrimientoIzquierda(arr, 5, 2);
		imprimeArreglo(arr,6);
	}

}
