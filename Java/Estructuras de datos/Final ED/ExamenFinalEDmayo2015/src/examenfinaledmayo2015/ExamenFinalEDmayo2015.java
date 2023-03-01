
package examenfinaledmayo2015;

import java.util.Iterator;

/**
 *
 * @author sguardatb
 */
public class ExamenFinalEDmayo2015 {

   
     
  
    public static void main(String[] args) {
        BolsaPlus <String> b1 = new BolsaPlus();
        BolsaPlus <String> b2 = new BolsaPlus();
        BolsaPlus <String> b3 = new BolsaPlus();
        BolsaPlus <String> b4 = new BolsaPlus();
        
        b1.agrega("uno");
        b1.agrega("due");
        b1.agrega("uno");
        b1.agrega("tre");
        b1.agrega("tre");
        b1.agrega("uno");
        b1.agrega("tre");
        b1.agrega("cinque");
        b1.agrega("uno");
        
        b2.agrega("cinque");
        b2.agrega("due");
        
        // PRUEBA DEL MÉTODO contieneA()
        
        // Prueba 1: b1 sí contiene a b2
        if (b1.contieneA(b2))
            System.out.println("\nCaso 1: La bolsa b1 sí contiene a la bolsa b2");
        else
            System.out.println("\nCaso 1: La bolsa b1 no contiene a la bolsa b2");
        
        b2.agrega("cinque");  
        // Prueba 2: b1 sí contiene a b2
        if (b1.contieneA(b2))
            System.out.println("\nCaso 2: La bolsa b1 sí contiene a la bolsa b2");
        else
            System.out.println("\nCaso 2: La bolsa b1 no contiene a la bolsa b2");
        
        
        b2.agrega("quattro");        
        // Prueba 3: b1 no contiene a b2
        if (b1.contieneA(b2))
            System.out.println("\nCaso 3: La bolsa b1 sí contiene a la bolsa b2");
        else
            System.out.println("\nCaso 3: La bolsa b1 no contiene a la bolsa b2");
        
        // Prueba 4: b1 sí contiene a b3
        if (b1.contieneA(b3))
            System.out.println("\nCaso 4: La bolsa b1 sí contiene a la bolsa b3");
        else
            System.out.println("\nCaso 4: La bolsa b1 no contiene a la bolsa b3");
        
        // Prueba 5: b3 no contiene a b1
        if (b3.contieneA(b1))
            System.out.println("\nCaso 5: La bolsa b3 sí contiene a la bolsa b1");
        else
            System.out.println("\nCaso 5: La bolsa b3 no contiene a la bolsa b1");
        
        // PRUEBA DEL MÉTODO quitaRepetidos()
        
        b1.quitaRepetidos();        
         // Prueba 6: Imprime sólo 2 elementos: due y cinque (en cualquier orden)
        System.out.println("\n\nCaso 6: Debe imprimir sólo: due y cinque (en el orden determinado por el método agrega)\n");
        for(String s: b1)
            System.out.println(s);
               
        b2.quitaRepetidos();        
         // Prueba 7: Imprime sólo 2 elementos: due y quattro (en cualquier orden)
        System.out.println("\n\nCaso 7: Debe imprimir sólo: due y quattro (en el orden determinado por el método agrega)\n");
        for(String s: b2)
            System.out.println(s);
        
        b3.quitaRepetidos();
         // Prueba 8: No imprime elementos, la bolsa está vacía
        System.out.println("\n\nCaso 8: No debe imprimir ningún elemento\n");
        for(String s: b3)
            System.out.println(s);
        
        b4.agrega("uno");
        b4.agrega("otto");
        b4.agrega("uno");
        b4.agrega("otto");
        b4.agrega("uno");
        b4.agrega("otto");
        
        b4.quitaRepetidos();
         // Prueba 9: No imprime elementos, la bolsa quedó vacía luego de aplicar el método
        System.out.println("\n\nCaso 9: No debe imprimir ningún elemento\n");
        for(String s: b4)
            System.out.println(s);
        
        b3.agrega("uno");
        b3.agrega("dos");
        b3.agrega("tre");
        b3.agrega("quattro");
         // Prueba 10: Imprime los 4 elementos que agregó
        System.out.println("\n\nCaso 10: Imprime uno, dos, tre y quattro (en el orden determinado por el método agrega)\n");
        for(String s: b3)
            System.out.println(s);
        
    }
    
}
