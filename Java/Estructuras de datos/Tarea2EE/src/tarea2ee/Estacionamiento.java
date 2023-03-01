/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2ee;

/**
 *
 * @author David ISAAC
 */
public class Estacionamiento{	//cont cuantos va agregando
    private String encargado;
    private int capacidad,cont;
    private LinkedStackLimitada coches;

    public Estacionamiento(){
	cont = 0;
    }

    public Estacionamiento(String encargado, int capacidad){
	this.encargado = encargado;
	this.capacidad = capacidad;
        coches = new LinkedStackLimitada(capacidad);
    }


    public String toString(){
        StringBuilder cad=new StringBuilder();
        LinkedStack pila = new LinkedStack();
        int i=0;
        
        cad.append("\nEncargado: " +  encargado);
        cad.append("\nCapacidad total: " +  capacidad);
        while (!coches.isEmpty()){
            cad.append("\nInformacion del coche: " + (i+1) + ((Coche)coches.peek()).toString());
            pila.push(coches.pop());
            i++;
        }
        for (int j=0;j<i;j++){
            coches.push(pila.pop());
        }
        return cad.toString();
    }
    /*
    public boolean agregaCoche(Coche arr[],String placas, int n){
        boolean res=false;

        if(buscaCocheBaseDatos(arr,placas,n)!=-1 && !(buscaCocheEstacionamiento(placas)) && !coches.isFull()){
            coches.push(arr[buscaCocheBaseDatos(arr,placas,n)]);
            cont++;
            res=true;
        }
        return res;
    }
   */
    public int agregaCoche(Coche arr[],String placas, int n){
        boolean res=false;
        int resp=0;

        if(buscaCocheBaseDatos(arr,placas,n)!=-1 && !(buscaCocheEstacionamiento(placas)) && !coches.isFull()){
            coches.push(arr[buscaCocheBaseDatos(arr,placas,n)]);
            cont++;
            res=true;
            resp=1;
        }
        
        if(!res){
             if(buscaCocheBaseDatos(arr,placas,n)==-1)
                resp=-1;
             else{
                 if(buscaCocheEstacionamiento(placas))
                     resp=-2;
                 if(coches.isFull())
                     resp=-3;
             }
        }
        return resp;
    }
    
    public boolean buscaCocheEstacionamiento(String placas){
        boolean res;
        LinkedStack pila = new LinkedStack();
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
    
    public int buscaCocheBaseDatos(Coche arr[],String placas,int n){
        int res=-1;
        int i=0;
        while(i<n && !(arr[i].getPlacas()==placas)){
            i++;
        }  
        if (i<n)
            res = i;
        return res;
    }
    
    public String eliminaCoche(String placas){
        int i=0;
        StringBuilder cad = new StringBuilder();
        LinkedStack pila = new LinkedStack();
        boolean res = false, vacio = false;
        
        
        if(buscaCocheEstacionamiento(placas) && !coches.isEmpty())
           while(!(((Coche)coches.peek()).getPlacas()==placas)){
               cad.append("\nSe elimina temporalmente este coche: " + ((Coche)coches.peek()).toString());
               pila.push(coches.pop());
               i++;
           }
        else{
            cad.append("No se puede sacar algún carro.");
        }
        if(i<cont){
            cad.append("\nSe elimina este coche definitivamente: " +  ((Coche)coches.pop()).toString());
            res = true;
        }
        for (int j=0;j<i;j++){
            coches.push(pila.pop());
            cad.append("\nSe regresa este coche: " +((Coche)coches.peek()).toString());
        }
        return cad.toString();
    }

}



