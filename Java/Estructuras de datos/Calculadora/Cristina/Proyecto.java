/*
24 de febrero del 2018
 */
package proyecto;

/**
 *
 * @author crisc
 */
public class Proyecto {
    private static <T>String stringPilaVaciar(PilaA<Object> p){
        StringBuilder cad=new StringBuilder();
        while(p.peek()!=null)
            cad.append(p.pop()+" , ");
        return cad.toString();
    }

    public static void main(String[] args) {
        
        //prueba del método posfijo:
        
        boolean res=false;
        PilaA<Object> exp= new PilaA();
        PilaA<Object> result= Metodos.postfija("((1-2)*(4+5)*(-20)/(3*2)+1.001)*(-1)");
        String expString;
        String resultString;
        exp.push('*');
        exp.push('-');
        exp.push(1);
        exp.push(0);
        exp.push('+');
        exp.push(1.001);
        exp.push('/');
        exp.push('*');
        exp.push(2);
        exp.push(3);
        exp.push('*');
        exp.push('-');
        exp.push(20);
        exp.push(0);
        exp.push('*');
        exp.push('+');
        exp.push(5);
        exp.push(4);
        exp.push('-');
        exp.push(2);
        exp.push(1);
        expString=stringPilaVaciar(exp);
        resultString=stringPilaVaciar(result);
        res=expString.equals(resultString);
        System.out.println(res);
        
        
    }
    
}
