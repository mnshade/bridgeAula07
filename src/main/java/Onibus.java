public class Onibus extends Veiculo {

    @Override
    public void fabricar() {
        System.out.println("Fabricando Onibus...");
        oficinas.stream().forEach(oficina -> oficina.trabalhar(this));
        System.out.println("Terminado.");
        System.out.println();
    }

    @Override
    public int tempoDeTrabalho() {
        return 75;
    }

}
