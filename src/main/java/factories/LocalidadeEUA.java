
package factories;

import objetos.Data;
import objetos.DataEUA;
import objetos.Moeda;
import objetos.MoedaEUA;

/**
 *
 * @author danielkorban
 */
public class LocalidadeEUA implements LocalidadeAbstractFactory{

    @Override
    public Data getData() {
        return new DataEUA();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaEUA();
    }
    
}
