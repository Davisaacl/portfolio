/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author David ISAAC
 */
public class Estacionamiento{	//cont cuantos va agregando
    private String encargado;
    private int capacidad,cont;
    private ArrayStackLimitada coches;

    public Estacionamiento(){
	cont = 0;
    }

    public Estacionamiento(String encargado, int capacidad){
	this.encargado = encargado;
	this.capacidad = capacidad;
        coches = new ArrayStackLimitada(capacidad);
    }


    public String toString(){
        StringBuilder sb;
        sb=new StringBuilder();
        return sb.toString();
    }
    
    public boolean agregaCoche(Coche arr[],String placas, int n){
        boolean res=false;

        if(buscaCocheBaseDatos(arr,placas,n) && !(buscaCocheEstacionamiento(placas)) && !coches.isFull()){
            coches.push(arr[cont]);
            cont++;
            res=true;
        }
        return res;
    }
   
    public boolean buscaCocheEstacionamiento(String placas){
        boolean res;
        ArrayStack pila = new ArrayStack();
        int contador = 0;
        
        while(!coches.isEmpty() && !(((Coche)coches.peek()).getPlacas()==placas)){
            pila.push(coches.pop());
            contador++;
        }
        if(contador<cont){
            res = true;
        }
        else{
            res = false;
        }
        for(int i=0;i<contador;i++)    
            coches.push(pila.pop());
            
        return res;
    }
    
    public boolean buscaCocheBaseDatos(Coche arr[],String placas,int n){
        boolean res = false;
        int i=0;
        
        while(i<n && !(arr[i].getPlacas()==placas))
            i++;
        if (i<n)
            res = true;
        
        return res;
    }
    
    public int eliminaCoche(String placas){
        Coche arr[] = new Coche[capacidad*2];
        int contador = 0;
        
        if(buscaCocheEstacionamiento(placas))
            while ()
            coches.pop();
        return 0;
    }

}

