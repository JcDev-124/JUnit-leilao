import leilao.Avaliador;
import leilao.Lance;
import leilao.Leilao;
import leilao.Usuario;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static leilao.Avaliador.retornaMaiorLance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class AvaliadorTest {


    @Test
    void testRetornaMaiorLance() {
        List<Lance> lances = new ArrayList<>();
        Usuario usuario1 = new Usuario(1,"Alice");
        Usuario usuario2 = new Usuario(2,"Bob");

        lances.add(new Lance(100.0, usuario1));
        lances.add(new Lance(150.0, usuario2));
        lances.add(new Lance(120.0, usuario1));

        Lance lanceMaior = retornaMaiorLance(lances);

        assertEquals(150.0, lanceMaior.getValor());
    }

    @Test
    void testRetornaMaiorLanceComListaVazia() {
        List<Lance> lances = new ArrayList<>();

        Lance lanceMaior = retornaMaiorLance(lances);

        assertNull(lanceMaior);
    }

}
