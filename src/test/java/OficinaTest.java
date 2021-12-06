import org.junit.jupiter.api.Test;

class OficinaTest {

    @Test
    void deveProduzirBicicleta(){
        Veiculo bicicleta = new Bicicleta();
        bicicleta.entrarOficina(new OficinaFunilaria());
        bicicleta.entrarOficina(new OficinaMontagem());
        bicicleta.entrarOficina(new OficinaTeste());
        bicicleta.fabricar();
    }

    @Test
    void deveProduzirCarro(){
        Veiculo carro = new Carro();
        carro.entrarOficina(new OficinaFunilaria());
        carro.entrarOficina(new OficinaMontagem());
        carro.entrarOficina(new OficinaPintura());
        carro.entrarOficina(new OficinaTeste());
        carro.fabricar();
    }

    @Test
    void DeveRepararOnibus(){
        Veiculo onibus = new Onibus();
        onibus.entrarOficina(new OficinaReparo());
        onibus.entrarOficina(new OficinaMontagem());
        onibus.entrarOficina(new OficinaTeste());
        onibus.fabricar();
    }
}
