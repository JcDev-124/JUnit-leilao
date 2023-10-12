package leilao;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

    private String descricao;
    List<Lance> lances;

    public String getDescricao() {
        return descricao;
    }
    public Leilao(String nome){
        this.descricao = nome;
        this.lances = new ArrayList<>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Lance> getLances(){
        return this.lances;
    }
    public void setLances(Lance lance){
        this.lances.add(lance);
    }
}
