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
public class Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArraySet<String> conjuntoUniv=new ArraySet();
        conjuntoUniv.add("Hola");
        conjuntoUniv.add("Adios");
        conjuntoUniv.add("Elefante");
        conjuntoUniv.add("Rinoceronte");
        conjuntoUniv.add("Loco");
        
        ArraySet<String> conjunto1=new ArraySet();
        conjunto1.add("Hola");
        conjunto1.add("Elefante");
        conjunto1.add("Loco");
        
        ArraySet<String> conjunto2=new ArraySet();
        
        ArraySet<String> conjunto3=new ArraySet();
        conjunto3.add("En un");
        conjunto3.add("lugar de");
        conjunto3.add("La Mancha");
        
        SetADT<String> res1=conjunto1.complemento(conjuntoUniv);
        // Debería imprimir: Adios Rinoceronte (o alguna permutación):
        System.out.println(res1);
        
        SetADT<String> res2=conjunto1.complemento(conjunto2);
        // Debería imprimir: (nada, conjunto vacío):
        System.out.println(res2);
        
        SetADT<String> res3=conjuntoUniv.complemento(conjunto1);
        // Debería imprimir: (nada, conjunto vacío):
        System.out.println(res3);

        SetADT<String> res4=conjunto3.complemento(conjunto1);
        // Debería imprimir: Hola Elefante Loco (o alguna permutación):
        System.out.println(res4);
        
        SetADT<String> res5=conjunto1.complemento(conjunto3);
        // Debería imprimir: En un lugar de La Mancha (o alguna permutación):
        System.out.println(res5);
        
        SetADT<String> res6=conjunto2.complemento(conjuntoUniv);
        // Debería imprimir: Hola Adios Elefante Rinoceronte Loco (o alguna permutación):
        System.out.println(res6);
    }
}
