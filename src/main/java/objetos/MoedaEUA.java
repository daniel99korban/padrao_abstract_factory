
package objetos;

/**
 *
 * @author danielkorban
 */
public class MoedaEUA implements Moeda{
    // $25.00 R$25,00
    private Double valor;

    public MoedaEUA(){
        this.valor = 25d;
    }

    @Override
    public String toString() {
        return "$" + valor;
    }
    
    @Override
    public void apresentar() {
        System.out.println("Valor: " + this.toString());
    }
    
}
