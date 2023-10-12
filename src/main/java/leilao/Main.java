package leilao;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1,"Julio");
        Usuario usuario2 = new Usuario(2, "Cesar");

        Leilao leilao = new Leilao("Vacas");

        Lance lance = new Lance(200.0, usuario1);
        Lance lance2 = new Lance(300.0, usuario2);
        leilao.setLances(lance);
        leilao.setLances(lance2);

        Lance maiorLance = Avaliador.retornaMaiorLance(leilao.getLances());

        System.out.println(maiorLance);

    }
}