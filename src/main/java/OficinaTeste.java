import java.util.concurrent.TimeUnit;

public class OficinaTeste extends Oficina{

    public OficinaTeste() {
        super();
    }

    @Override
    public void trabalhar(Veiculo veiculo) {
        System.out.print("Produzindo... ");
        long tempoUsado = 15 * veiculo.tempoDeTrabalho();
        try {
            TimeUnit.MILLISECONDS.sleep(tempoUsado);
        } catch (InterruptedException exp) {
        }
        System.out.printf("(Tempo gasto: %d milissegundos), Feito.\n", tempoUsado);
    }
}
