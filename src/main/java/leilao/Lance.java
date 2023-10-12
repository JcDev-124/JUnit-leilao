package leilao;

public class Lance {

    private Double lance;
    private Usuario usuario;

    public Lance() {
    }
    public Lance(Double lance, Usuario usuario){
        this.lance = lance;
        this.usuario = usuario;
    }
    public double getValor(){
        return lance;
    }

    @Override
    public String toString() {
        return "Lance{" +
                "lance=" + lance +
                ", usuario=" + usuario.getNome() +
                '}';
    }
}
