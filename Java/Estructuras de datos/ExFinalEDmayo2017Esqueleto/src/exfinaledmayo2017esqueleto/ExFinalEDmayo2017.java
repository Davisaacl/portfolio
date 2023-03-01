
package exfinaledmayo2017esqueleto;

/**
 *
 * @author 
 */
public class ExFinalEDmayo2017 {
    // Método que debe escribirse para resolver el inciso 1: 
    public static boolean verificaLenguajeDyck(String cadena){
        
        return verificaLenguajeDyck(cadena, 0,0);
    }
    
    public static boolean verificaLenguajeDyck(String cadena, int fijo, int cont){
        if (!cadena.equals(null)){
            if (fijo<cadena.length()){
                 return true;
                if (cadena.charAt(fijo)=='{'){
                    if (cadena.charAt(cont)=='}')
                        return verificaLenguajeDyck(cadena,fijo+1,fijo);
                    verificaLenguajeDyck(cadena,fijo,cont+1);
                }
                if (cadena.charAt(fijo)=='['){
                    if (cadena.charAt(cont)==']')
                        return verificaLenguajeDyck(cadena,fijo+1,fijo);
                    verificaLenguajeDyck(cadena,fijo,cont+1);
                }
                if (cadena.charAt(fijo)=='('){
                    if (cadena.charAt(cont)==')')
                        return verificaLenguajeDyck(cadena,fijo+1,fijo);
                    verificaLenguajeDyck(cadena,fijo,cont+1);
                }
            return verificaLenguajeDyck (cadena,fijo+1,fijo);
            
            }
        }
        else
          
            return false;

    }
    
    
    /* Método main para probar tus soluciones.
    * Puedes agregar todos los casos de prueba adicionales que creas conveniente
    * para asegurarte de que tus soluciones sean correctas, completas y
    * eficientes: */
    public static void main(String[] args) {
        
        //----  Pruebas iniciales para el inciso 1: ----
        
        String cadena1,cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8,cadena9;
        
        cadena1 = "[8 + 3 * (5 + 2)]";
        cadena2 = "[8 + 3 * (5 + 2)";
        cadena3 = "[32 - 16 / [4 - 3]}";
        cadena4 = "{46 / 24 * (3 / ( 6 + 18)) * 15 - 3} + 16";
        cadena5 = "46 / 24 * (3 / (6 + 18)) * 15 - 3} + 16)";
        cadena6 = "{[(())]}";
        cadena7 = "a(mí me gustan las) estructuras (de datos)";
        cadena8 = "";
        cadena9 = "78 + 4 )";        
        
        //Caso de prueba 1 para inciso 1 (debería escribir true):
        System.out.println("\nResultado al evaluar la cadena 1: " + verificaLenguajeDyck(cadena1));
        
        //Caso de prueba 2 para inciso 1 (debería escribir false):
        System.out.println("\nResultado al evaluar la cadena 2: " + verificaLenguajeDyck(cadena2));
        
        //Caso de prueba 3 para inciso 1 (debería escribir false):
        System.out.println("\nResultado al evaluar la cadena 3: " + verificaLenguajeDyck(cadena3));
        
        //Caso de prueba 4 para inciso 1 (debería escribir true):
        System.out.println("\nResultado al evaluar la cadena 4: " + verificaLenguajeDyck(cadena4));
        
        //Caso de prueba 5 para inciso 1 (debería escribir false):
        System.out.println("\nResultado al evaluar la cadena 5: " + verificaLenguajeDyck(cadena5));
        
        //Caso de prueba 6 para inciso 1 (debería escribir true):
        System.out.println("\nResultado al evaluar la cadena 6: " + verificaLenguajeDyck(cadena6));

        //Caso de prueba 7 para inciso 1 (debería escribir true):
        System.out.println("\nResultado al evaluar la cadena 7: " + verificaLenguajeDyck(cadena7));
        
        //Caso de prueba 8 para inciso 1 (debería escribir true):
        System.out.println("\nResultado al evaluar la cadena 8: " + verificaLenguajeDyck(cadena8));

        //Caso de prueba 9 para inciso 1 (debería escribir false):
        System.out.println("\nResultado al evaluar la cadena 9: " + verificaLenguajeDyck(cadena9));
        
        //----  Pruebas iniciales para el inciso 2: ----
        ListaDesordenada<Integer> lisNum1 = new ListaDesordenada();
        lisNum1.agregaFinal(6);
        lisNum1.agregaFinal(7);
        lisNum1.agregaFinal(8);
        lisNum1.agregaFinal(9);
        lisNum1.agregaFinal(10);
        lisNum1.agregaFinal(4);
        
        //Caso de prueba 1 para inciso 2:
        //Debería imprimir 6 7 8 9 10 4:
        System.out.println("\n\nLista 1 antes de cambiar el 8:   " + lisNum1);
        lisNum1.cambiaOrden(8);
        //Debería imprimir 8 6 7 9 10 4:
        System.out.println("\nLista 1 después de cambiar el 8:   " + lisNum1);
        
        ListaDesordenada<Integer> lisNum2 = new ListaDesordenada();
        lisNum2.agregaFinal(6);
        lisNum2.agregaFinal(7);
        lisNum2.agregaFinal(8);
        lisNum2.agregaFinal(9);
        lisNum2.agregaFinal(8);
        lisNum2.agregaFinal(4);
        lisNum2.agregaFinal(8);
        lisNum2.agregaFinal(8);
        lisNum2.agregaFinal(2);
        
        //Caso de prueba 2 para inciso 2:
        //Debería imprimir 6 7 8 9 8 4 8 8 2:
        System.out.println("\n\nLista 2 antes de cambiar el 8:   " + lisNum2);
        lisNum2.cambiaOrden(8);
        //Debería imprimir 8 8 8 8 6 7 9 4 2:
        System.out.println("\nLista 2 después de cambiar el 8:   " + lisNum2);
        
        ListaDesordenada<Integer> lisNum3 = new ListaDesordenada();
        lisNum3.agregaFinal(6);
        lisNum3.agregaFinal(7);
        lisNum3.agregaFinal(9);
        lisNum3.agregaFinal(4);
        lisNum3.agregaFinal(2);
        
        //Caso de prueba 3 para inciso 2:
        //Debería imprimir 6 7 9 4 2:
        System.out.println("\n\nLista 3 antes de cambiar el 8:   " + lisNum3);
        lisNum3.cambiaOrden(8);
        //Debería imprimir 6 7 9 4 2:
        System.out.println("\nLista 3 después de cambiar el 8:   " + lisNum3);        

        ListaDesordenada<Integer> lisNum4 = new ListaDesordenada();
        
        //Caso de prueba 4 para inciso 2:
        //Debería imprimir la lista vacía en los dos casos:
        System.out.println("\n\nLista 4 antes de cambiar el 8:   " + lisNum4);
        lisNum4.cambiaOrden(8);
        System.out.println("\nLista 4 después de cambiar el 8:   " + lisNum4); 

        ListaDesordenada<Integer> lisNum5 = new ListaDesordenada();
        lisNum5.agregaFinal(8);
        lisNum5.agregaFinal(7);
        lisNum5.agregaFinal(9);
        
        //Caso de prueba 5 para inciso 2:
        //Debería imprimir 8 7 9:
        System.out.println("\n\nLista 5 antes de cambiar el 8:   " + lisNum5);
        lisNum5.cambiaOrden(8);
        //Debería imprimir 8 7 9:
        System.out.println("\nLista 5 después de cambiar el 8:   " + lisNum5);  

        ListaDesordenada<Integer> lisNum6 = new ListaDesordenada();
        lisNum3.agregaFinal(8);
        lisNum3.agregaFinal(8);
        
        //Caso de prueba 6 para inciso 2:
        //Debería imprimir 8 8:
        System.out.println("\n\nLista 6 antes de cambiar el 8:   " + lisNum6);
        lisNum6.cambiaOrden(8);
        //Debería imprimir 8 8:
        System.out.println("\nLista 6 después de cambiar el 8:   " + lisNum6);  
        
        ListaDesordenada<Integer> lisNum7 = new ListaDesordenada();
        lisNum7.agregaFinal(8);
        
        //Caso de prueba 7 para inciso 2:
        //Debería imprimir 8:
        System.out.println("\n\nLista 7 antes de cambiar el 8:   " + lisNum7);
        lisNum7.cambiaOrden(8);
        //Debería imprimir 8:
        System.out.println("\nLista 7 después de cambiar el 8:   " + lisNum7);  
        
        //----  Pruebas iniciales para el inciso 3: ----
        Empresa unaEmp = new Empresa();
        unaEmp.altaCamion("Volvo", "AX24-128TR", "PAB-204", 6.5);
        unaEmp.altaCamion("Mercedes", "BJT1-706AA", "BUN-693", 4.0);
        unaEmp.altaCamion("Volvo", "JL98-325PL", "NAB-411", 40);
        unaEmp.altaCamion("Volvo", "SW88-145QW", "LAC-887", 35);
        unaEmp.altaCamion("Ford", "AQ35-589YR", "YQG-222", 40);
        unaEmp.altaCamion("GM", "POU0-457HY", "COL-975", 45);
        unaEmp.altaCamion("Volvo", "BB33-215CC", "TAN-356", 5.7);
        
        int totCambios;
        
        System.out.println("\nLista de camiones antes de modificar: " + unaEmp.generaReporteCamiones());
        
        //Caso de prueba 1 para inciso 3:
        totCambios=unaEmp.incrementaPasajerosPorMarca("Volvo", 5);
        //A dos de los cuatro camiones Volvo se les debe haber aumentado en 5 su capacidad de pasajeros:
        if(totCambios>0)
            System.out.println("\nLista de camiones luego de modificar los Volvos: " + unaEmp.generaReporteCamiones());
        
        //Caso de prueba 2 para inciso 3:
        totCambios=unaEmp.incrementaPasajerosPorMarca("Mercedes", 8);
        //No se le debe haber aumentado la capacidad a ningún camión:
        if(totCambios>0)
            System.out.println("\nLista de camiones luego de modificar los Mercedes: " + unaEmp.generaReporteCamiones());

        //Caso de prueba 3 para inciso 3:
        totCambios=unaEmp.incrementaPasajerosPorMarca("Tata", 10);
        //No se le debe haber aumentado la capacidad a ningún camión:
        if(totCambios>0)
            System.out.println("\nLista de camiones luego de modificar los Tata: " + unaEmp.generaReporteCamiones());
    }
}
