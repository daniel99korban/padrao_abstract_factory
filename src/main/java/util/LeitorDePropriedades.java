
package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author https://www.devmedia.com.br/utilizando-arquivos-de-propriedades-no-java/25546
 */

public class LeitorDePropriedades {
    
    private static Properties getProp(String path) throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(path);
        props.load(file);
        return props;

    }
    
    public static String lerPropriedades(String path){
        
        try {
            Properties prop =  LeitorDePropriedades.getProp(path);
            return  prop.getProperty("localidade");    
        } catch (IOException e) {
            System.err.println("Erro: "  + e.getMessage());
        }
        
        return "";
    }
    
}
