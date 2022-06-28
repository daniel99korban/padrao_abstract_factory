
package objetos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author danielkorban
 */
public class DataEUA implements Data{
    
    @Override
    public void apresentar() {
        String[] meses = {"January", "February", "Mar", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        // ler data atual
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String data =  dtf5.format(LocalDateTime.now());
        // formatar
        String dia = data.split("/")[2];
        String mes = meses[Integer.parseInt(data.split("/")[1])];
        String ano = data.split("/")[0];
        // apresentar
        System.out.println("Eua\n" + mes + " " + dia + ", " + ano);
    }
    
}
