public class Carro extends Veiculo {

    @Override
    public void fabricar() {
        System.out.println("Fabricando Carro...");
        oficinas.stream().forEach(oficina -> oficina.trabalhar(this));
        System.out.println("Terminado.");
        System.out.println();
    }

    @Override
    public int tempoDeTrabalho() {
        return 50;
    }

}
