
package objetos;

/**
 *
 * @author danielkorban
 */
public class MoedaBrasil implements Moeda{
// $25.00 R$25,00
    private Double valor;
    
    public MoedaBrasil(){
        this.valor = 25d;
    }

    @Override
    public String toString() {
        return "R$" + valor;
    }
    
    @Override
    public void apresentar() {
        System.out.println("valor: " + this.toString());
    }
    
}
