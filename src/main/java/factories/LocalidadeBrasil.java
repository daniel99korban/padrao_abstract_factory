
package factories;

import objetos.Data;
import objetos.DataBrasil;
import objetos.Moeda;
import objetos.MoedaBrasil;

/**
 *
 * @author danielkorban
 */
public class LocalidadeBrasil implements LocalidadeAbstractFactory{

    @Override
    public Data getData() {
        return new DataBrasil();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaBrasil();
    }
    
}
