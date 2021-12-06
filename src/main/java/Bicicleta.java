public class Bicicleta extends Veiculo {

    @Override
    public void fabricar() {
        System.out.println("Fabricando Bicicleta...");
        oficinas.stream().forEach(oficina -> oficina.trabalhar(this));
        System.out.println("Terminado.");
        System.out.println();
    }

    @Override
    public int tempoDeTrabalho() {
        return 10;
    }

}
