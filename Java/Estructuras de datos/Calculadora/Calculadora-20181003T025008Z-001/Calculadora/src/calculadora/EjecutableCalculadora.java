/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author David ISAAC
 */
public class EjecutableCalculadora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora c1 = new Calculadora();
        /*
        String [] prueba = new String [3];
        prueba[0]="2";
        prueba[1]="+";
        prueba[2]="5";
        
        
        c1.calcula();
        System.out.println("Resultado " + c1.getResultado());

        //System.out.println(c1.conviertePostfija(prueba));
        */
        
        String cad= new String("28+8*3-6");
        String arr[]={"4","5","+"};
        //arr = c1.obtieneTokens(cad);
        System.out.println(c1.conviertePostfijaN(cad));
        //System.out.println(c1.evaluaExpresion(arr));
        
        
        
    }
    
}
