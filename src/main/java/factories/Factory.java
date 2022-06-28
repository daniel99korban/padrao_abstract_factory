package factories;

import util.LeitorDePropriedades;

/**
 *
 * @author danielkorban
 */
public class Factory {
    
    private static String localidade;
    
    public static LocalidadeAbstractFactory escolherFabrica(){
        
        localidade = LeitorDePropriedades.lerPropriedades("/home/danielkorban/NetBeansProjects/padrao_abstract_factory_exercicio/src/main/java/util/dados.properties");
        
        if(localidade.equalsIgnoreCase("Brasil")){
            return new LocalidadeBrasil();
        }else if(localidade.equalsIgnoreCase("EUA")){
            return new LocalidadeEUA();
        }else if(localidade.equalsIgnoreCase("")){
            System.out.println("Arquivo vazio");
        }
        return null;
    }

}
