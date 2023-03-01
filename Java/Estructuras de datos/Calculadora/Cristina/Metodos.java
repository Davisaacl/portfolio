/*
Eyal Schuller Tawil
Cristina Crespo Sánchez
Luisa Fernanda García Lamoyi

Terminado el 25 de febrero del 2017

Clase que contiene todos los métodos estáticos utilizados para el proyecto1
 */
package proyecto;


/**
 *
 * @author Cristina Crespo, Eyal Schuller y Luisa Fernanda
 */
public abstract class Metodos {
    
    /**
     * @param cad Operación matemática
     * @return Verdadero si es válida, falso si no lo es.
     * Este método determina si la operación dada es válida o no.
     */
    public static boolean esValido(String cad){
        PilaA<Character> pila=new PilaA();
        boolean res=!(cad.charAt(0)=='/'||cad.charAt(0)=='*')&&cad.charAt(cad.length()-1)>'/'||cad.charAt(cad.length()-1)==')';
        /*
        Es decir, la cadena no puede comezar con los operadores de multiplicación o división
        Y, además, la cadena no puede terminar con ningún operador. Se utiliza el código ASCII.
        */
        while(cad.contains("--")||cad.contains("\\+-")||cad.contains("\\+\\+")){
                cad=cad.replaceFirst("--", "\\+");
                cad=cad.replaceFirst("\\+-", "-");
                cad=cad.replaceFirst("\\+\\+", "\\+");
        }
        
        if(res){
            int i=0;
            char ch;
                        
            while(i<cad.length()&&res){
                ch=cad.charAt(i);
                switch(ch){
                    case '(':
                        pila.push('(');
                        if (cad.charAt(i+1)=='/'||cad.charAt(i+1)=='*')//un paréntesis abierto no puede estar seguido por un operador de multiplicacion o division
                            res=false;
                        break;
                    case ')':
                        if(pila.isEmpty()||cad.charAt(i-1)<='/'||cad.charAt(i-1)<='*') //un paréntesis cerrado debe tener su correspondiente paréntesis abierto y no puede ser precedido por un operador de división o multiplicación
                            res=false;
                        else 
                            pila.pop();
                        break;
                    case '*': case '/': case '-': case '+':
                        if (cad.charAt(i+1)<'0'&&cad.charAt(i+1)>')')//no puede ser seguido de otro operador, ni un punto, ni una coma
                            res=false;
                        break;
                    default :
                        if(Character.isAlphabetic(ch))//la expresión no puede tener letras
                            res=false;
                }
                i++;
            }            
        }
        return res&&pila.isEmpty();
    }
    /**
     * 
     * @param e Operación válida en notación infija
     * @return Pila que contiene la expresión en forma posfija.
     * Este método convierte una operación en forma injija en una pila que contiene la operación en forma psfija.
     */
    public static PilaA<Object> postfija(String e){
        int i=0;
        PilaADT<Object> num=new PilaA();
        PilaADT<Character> pila=new PilaA();
        PilaA<Object> res=new PilaA();
        char ch;
        StringBuilder numero;
        //Nota: los negativos tienen que tener paréntesis: (-1)
        //este ciclo expresa los negativos como una resta, simplifica signos y quita espacios y comas
        while(e.contains("--")||e.contains("\\+-")||e.contains("\\+\\+")||e.contains(" ")||e.contains(",")||e.contains("(-")){
                e=e.replaceFirst("--", "\\+");
                e=e.replaceFirst("\\+-", "-");
                e=e.replaceFirst("\\+\\+", "\\+");
                e=e.replaceFirst(" ", "");
                e=e.replaceFirst(",","");
                e=e.replaceFirst("\\(-", "\\(0-");
        }
        
        while(i<e.length()){
            ch=e.charAt(i);
            switch(ch){
                case '(':
                    pila.push(ch);
                    break;
                case ')':
                    while(pila.peek()!='(')
                        num.push(pila.pop());
                    pila.pop();
                    break;
                case '*': case '/':
                    while(!pila.isEmpty()&&(pila.peek()=='*'||pila.peek()=='/'))
                        num.push(pila.pop());
                    pila.push(ch);
                    break;
                case '-': case '+':
                    while(!pila.isEmpty()&&pila.peek()!='(')
                        num.push(pila.pop());
                    pila.push(ch);
                    break;
                default:
                    if(Character.isDigit(ch)||e.charAt(i)=='.'){
                        numero=new StringBuilder();
                        numero.append(ch);
                        while(i+1<e.length()&&(Character.isDigit(e.charAt(i+1))||e.charAt(i+1)=='.')){
                            numero.append(e.charAt(i+1));
                            i++;
                        }
                        num.push(numero);
                    }
                    break;
            }
            i++;
        }
        while(!pila.isEmpty()){
            num.push(pila.pop());
        }
        while(!num.isEmpty())
            res.push(num.pop());
        return res;
    }
    /**
     * @param pos Pila que contiene la operación en su forma posfija
     * @return Resultado de la operación
     * Este método calcula una operación y devuelve su resultado.
     */
    public static String calcula(PilaA<Object> pos){
        PilaADT<Double> pila= new PilaA();
        double aux;
        double op=0;
        
        while(!pos.isEmpty()){
            try{
                pila.push(Double.parseDouble(pos.peek().toString()));
                pos.pop();
            }
            catch(Exception e){
                aux=pila.pop();
                if(!pila.isEmpty()&& pos.peek()!=null){
                    
                    switch(pos.pop().toString().charAt(0)){
                        case'+':
                            op=pila.pop()+aux;
                            break;
                        case '-':
                            op=pila.pop()-aux;
                            break;
                        case '/':
                            op= pila.pop()/aux;
                            break;
                        case '*':
                            op=pila.pop()*aux;
                        default:
                            break;
                    }
                }
                pila.push(op);
            }
        }
        return pila.pop().toString();
    }
}

