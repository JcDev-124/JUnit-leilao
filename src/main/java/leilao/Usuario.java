package leilao;

public class Usuario {

    private Integer id;
    private String nome;

    public Usuario(){}

    public Usuario (Integer id, String nome){
        this.nome = nome;
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
