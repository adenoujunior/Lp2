package lab02;


public class Partida {
     private Arbitro juizes[] = new Arbitro[5];
    int quantidadeArbitro=0;

    public Arbitro[] getJuizes() {
        return juizes;
    }

    public void setJuizes(Arbitro juizes) {
        this.juizes[this.quantidadeArbitro] = juizes;
        this.quantidadeArbitro++;
    }
    
}
