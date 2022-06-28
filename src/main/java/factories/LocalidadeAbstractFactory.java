
package factories;

import objetos.Data;
import objetos.Moeda;

/**
 *
 * @author danielkorban
 */
public interface LocalidadeAbstractFactory {
    public Data getData();
    public Moeda getMoeda();
}
