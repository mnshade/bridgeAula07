import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {

    protected List<Oficina> oficinas = new ArrayList<Oficina>();

    public Veiculo() {
        super();
    }

    public boolean entrarOficina(Oficina oficina) {
        return oficinas.add(oficina);
    }

    public abstract void fabricar();

    public abstract int tempoDeTrabalho();

}
