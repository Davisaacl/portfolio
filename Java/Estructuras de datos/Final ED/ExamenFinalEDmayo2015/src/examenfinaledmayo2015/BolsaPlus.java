package examenfinaledmayo2015;

import java.util.Iterator;

/**
 *
 */
public class BolsaPlus<T> extends Bolsa<T> {

    public BolsaPlus() {
        super();
    }

    public boolean contieneA(Bolsa<T> unaBolsa) {
        if (unaBolsa != null) {
            T a, b;
            boolean resp = true;
            Iterator<T> it1 = iterator();
            Iterator<T> it2 = unaBolsa.iterator();
            while (it2.hasNext() && resp) {
                b = it2.next();
                resp = false;
                while (it1.hasNext() && !resp) {
                    a = it1.next();
                    if (b.equals(a)) {
                        resp = true;
                    }
                }
                it1 = iterator();
            }
            return resp;
        } else {
            return false;
        }
    }

    public void quitaRepetidos() {
        int cont = 0;
        T aux;
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            aux = it.next();
            cont = buscaCuantos(aux);
            if (cont > 1) {
                elimina(aux);
            }
            cont = 0;
        }
    }
}
