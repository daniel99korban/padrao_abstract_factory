
package com.mycompany.padrao_abstract_factory_exercicio;

import factories.Factory;
import factories.LocalidadeAbstractFactory;
import objetos.Data;
import objetos.Moeda;

/**
 *
 * @author danielkorban
 */
public class Teste {

    public static void main(String[] args) {
        // interfaces
        Data data;
        Moeda moeda;
        LocalidadeAbstractFactory fab;
        
        fab  = Factory.escolherFabrica();
        
        // iremos receber formatações de acordo com a localidade lida do arquivo de propriedades
        data = fab.getData();
        moeda = fab.getMoeda();
        // setar valores
        
        data.apresentar();
        moeda.apresentar();
        
    }
}
