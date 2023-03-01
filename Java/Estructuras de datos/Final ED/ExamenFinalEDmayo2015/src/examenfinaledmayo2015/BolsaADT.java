
package examenfinaledmayo2015;

import java.util.Iterator;

/**
 *
 * @author sguardatb
 * @param <T>
 */
public interface BolsaADT <T> extends Iterable<T> {
    @Override
    public Iterator<T> iterator();
    public boolean elimina(T dato);
    public void agrega(T dato);    
}
