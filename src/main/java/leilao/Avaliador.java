package leilao;

import java.util.List;

public class Avaliador {


    public static Lance retornaMaiorLance(List<Lance> list){
        return list.stream()
                .max((lance1, lance2) -> Double.compare(lance1.getValor(), lance2.getValor()))
                .orElse(null);
    }
}
