import java.util.concurrent.TimeUnit;

public class OficinaFunilaria extends Oficina {

    public OficinaFunilaria() {
        super();
    }

    @Override
    public void trabalhar(Veiculo veiculo) {
        System.out.print("Produzindo... ");
        long tempoUsado = 300 * veiculo.tempoDeTrabalho();
        try {
            TimeUnit.MILLISECONDS.sleep(tempoUsado);
        } catch (InterruptedException exp) {
        }
        System.out.printf("(Tempo gasto: %d milissegundos), Feito.\n", tempoUsado);
    }

}
