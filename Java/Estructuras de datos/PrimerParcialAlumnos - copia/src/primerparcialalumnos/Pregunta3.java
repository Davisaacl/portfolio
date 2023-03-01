
package primerparcialalumnos;

/**
 *
 * @author agomezdg
 */
public class Pregunta3 {
    public static void main(String args[]) {
        Integer a,b,c;
        Double d,e;
        String f,g,h,i;
        Character j,k;
        double suma;

        a=new Integer(8); b=new Integer(-16); c=new Integer(33);
        d=new Double(-3.33); e=new Double(18.68);
        f="Hola"; g="Adios"; h="ITAM"; i="Vladivostok";
        j=new Character('y');k=new Character('4');

        Object[] datos={a,d,f,b,g,h,e,c,j,i,k};
        Object[] datos2={f,i,j};

        /* El resultado debería ser 40.35 (=8-3.33-16+18.68+33): */
        suma=sumaDatosNumericos(datos);
        System.out.println("La suma de los datos numéricos del primer arreglo es: "+suma);
        
        /* El resultado debería ser 0: */
        suma=sumaDatosNumericos(datos2);
        System.out.println("La suma de los datos numéricos del segundo arreglo es: "+suma);
    }

    // Obtiene y regresa la suma de los valores de tipo Integer y Double que
    // aparecen en un arreglo polimórfico:
    public static double sumaDatosNumericos(Object[] datos) {
        double res = 0;
        
        for (int i=0;i<datos.length;i++)
            if (datos[i] instanceof Integer)
                res = res + ((Integer)datos[i]);
                else if (datos[i] instanceof Double)
                    res = res + ((Double)datos[i]);

        return res;

    }    
}
