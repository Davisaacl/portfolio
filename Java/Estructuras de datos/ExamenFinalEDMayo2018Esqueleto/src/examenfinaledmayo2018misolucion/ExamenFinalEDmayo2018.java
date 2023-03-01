/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaledmayo2018misolucion;

/**
 *
 * @author agomezdg
 */
import java.util.*;

public class ExamenFinalEDmayo2018 {
    public static ListaOrdenada<MaterialBibliografico> obtieneListaRevistas(ListaOrdenada<MaterialBibliografico> material, int total, double precio){
        ListaOrdenada<MaterialBibliografico> result = null;
        MaterialBibliografico help = null;
        if(material!=null && total>=0 && precio>=0){
          Iterator<MaterialBibliografico> it=material.iterator();
          while(it.hasNext()){
              help=it.next();
          if(help instanceof Divulgacion)
              if(((Divulgacion)help).getTiraje()>total && ((Divulgacion)help).getPrecio()<precio ){
                   result.add(help);
                  }//cumple condiciones
            }
        }
        return result;
    }
    
     public static ListaOrdenada<MaterialBibliografico> obtieneListaRevistasRecursivo(ListaOrdenada<MaterialBibliografico> material, int total, double precio){
        if(material!=null && total>=0 && precio>=0){
             Iterator<MaterialBibliografico> it=material.iterator();
            return obtieneListaRevistasRecursivo(it,material,total,precio,null);
        }else
            return null;
    }
     private static ListaOrdenada<MaterialBibliografico> obtieneListaRevistasRecursivo(Iterator<MaterialBibliografico> it,ListaOrdenada<MaterialBibliografico> material, int total, double precio,ListaOrdenada<MaterialBibliografico>resp){
          if(!it.hasNext())
              return resp;
          else{
              MaterialBibliografico help = null;
              help=it.next();
              if(help instanceof Divulgacion)
              if(((Divulgacion)help).getTiraje()>total && ((Divulgacion)help).getPrecio()<precio ){
                   resp.add(help);
                  }//cumple condiciones
              return obtieneListaRevistasRecursivo(it,material,total,precio,resp);
          }
    }
    public static void main(String[] args) {
        //Prueba 1: ambas llenas ismo tamaño
        ListaOrdenada<Integer> lis1=new ListaOrdenada<Integer>();
        ListaOrdenada<Integer> lis2=new ListaOrdenada<Integer>();
        ListaOrdenada<Integer> lis12=new ListaOrdenada<Integer>();
        lis1.add(2);
        lis1.add(3);
        lis1.add(8);
        lis1.add(9);
        lis1.add(10);
        
        lis2.add(3);
        lis2.add(3);
        lis2.add(3);
        lis2.add(8);
        lis2.add(7);
        
       lis1.combina(lis2);
        
        //Prueba 2: actual con 1 nodo y la otra llena 
        ListaOrdenada<Integer> lis3=new ListaOrdenada<Integer>();
        ListaOrdenada<Integer> lis4=new ListaOrdenada<Integer>();
        lis3.add(2);
        
        lis4.add(3);
        lis4.add(3);
        lis4.add(3);
        
        lis3.combina(lis4);
        
        //Prueba 3: actual con 1 nodo y la otra llena 
        ListaOrdenada<Integer> lis5=new ListaOrdenada<Integer>();
        ListaOrdenada<Integer> lis6=new ListaOrdenada<Integer>();
        
        lis5.add(2);
        
        lis6.add(3);
        lis6.add(3);
        lis6.add(3);
        
        lis6.combina(lis5);
        
        ListaOrdenada<MaterialBibliografico>hola= new ListaOrdenada<MaterialBibliografico>();
        ListaOrdenada<MaterialBibliografico>resp;
        MaterialBibliografico un= new Cientifica("COOL", "anual", 1999, 23, "cos", 45.8);
        MaterialBibliografico un1= new Cientifica("CL", "anual", 3000, 45, "mi", 40.8);
        MaterialBibliografico un2= new Divulgacion(23, "mensuao", 344, 78, "Gui", 45.9);
        hola.add(un);
        hola.add(un1);
        hola.add(un2);
        resp=obtieneListaRevistas(hola,20,60);
        System.out.println(resp.toString());
        
    }
}
