package primerparcialalumnos;

/**
 *
 * @author agomezdg
 */
public class Pregunta1 {
    public static void main(String[] args) {
        String entrada;
        String salida;
        
        
        entrada="Yo yo quiero ir ir al partido de de de fut";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Yo yo quiero ir al partido de fut"
        System.out.println(salida);
        
        entrada="Yo yo quiero yo ir";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Yo yo quiero yo ir"
        System.out.println(salida);

        entrada="Yo quiero ir al partido de ir";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Yo quiero ir al partido de ir"
        System.out.println(salida);

        entrada="Yo quiero quiero ir ir al quiero de fut";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Yo quiero ir al quiero de fut"
        System.out.println(salida);

        entrada="";  // Cadena vacía
        salida=procesa(entrada);
        // Resultado esperado aquí: "" (Cadena vacía)
        System.out.println(salida);

        entrada="Quiero ir ir";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Quiero ir"
        System.out.println(salida);

        entrada="Yo Yo";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Yo"
        System.out.println(salida);

        entrada="Yo quiero    ir";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Yo quiero ir"
        System.out.println(salida);
        
        entrada="Hola";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Hola"
        System.out.println(salida);
        
        entrada="  Hola";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Hola"
        System.out.println(salida);
        
        entrada="Hola  ";
        salida=procesa(entrada);
        // Resultado esperado aquí: "Hola"
        System.out.println(salida);
        
        
    }

    public static String procesa(String s) {
        ArrayStack<String> temp1=convierteCadenaEnPila(s);
        eliminaRepeticiones(temp1);
        String temp2=conviertePilaEnCadena(temp1);
        return temp2;
    }
    
    // Convierte una cadena de caracteres que consiste de cero o más palabras
    // (secuencias de caracteres separadas por uno o más espacios en blanco)
    // en una pila de palabras (secuencias de caracteres que no incluyan
    // blancos), dejando en el tope la última palabra leída de izquierda a
    // derecha en la cadena original (y hasta abajo de la pila la primera
    // palabra leída de izquierda a derecha):
    public static ArrayStack<String> convierteCadenaEnPila(String s) {
        ArrayStack <String> res = new ArrayStack();
        String palabra = "";
        
        if(s!=null){
            for (int i=0;i<s.length();i++){

                if (s.charAt(i)!=' ')
                    palabra += s.charAt(i);
                else if(!palabra.equals("")){
                    res.push(palabra);
                    palabra = "";               
                } 
            }
            if(!palabra.equals(""))
                res.push(palabra);
        }

        
        return res;

    }
    
    // Método destructivo: elimina palabras repetidas de forma consecutiva
    // usando una pila auxiliar:
    public static void eliminaRepeticiones(ArrayStack<String> pila) {
        ArrayStack <String> aux = new ArrayStack();
        String temp;
        
        if (pila!=null){
            while (!pila.isEmpty()){
                temp = pila.pop();
                if(aux.isEmpty())
                    aux.push(temp);
                else if (!temp.equals(aux.peek()))
                    aux.push(temp);
            }
            while (!aux.isEmpty())
                pila.push(aux.pop());

        }
        
    }
    
    // Debe realizar la conversión de manera no destructiva y construir la
    // cadena que entrega como resultado de tal forma que su primera palabra
    // (al leerla de izquierda a derecha) sea el dato que haya estado hasta
    // abajo de la pila y la última palabra sea el dato que haya estado en el
    // tope de la pila.
    public static String conviertePilaEnCadena(ArrayStack<String> pila) {
        StringBuilder cad = new StringBuilder("");
        ArrayStack <String> aux = new ArrayStack();
        String palabra = "";
        
        if (pila != null){
            while (!pila.isEmpty())
                aux.push(pila.pop());
            while (!aux.isEmpty()){
                palabra = aux.pop();
                cad.append(palabra);
                if(!aux.isEmpty())
                    cad.append(" ");
                pila.push(palabra);
            }
                
        }
        return cad.toString();

    }
}
