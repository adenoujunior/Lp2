package lab02;

import java.util.Date;

public class Partida {
     
    private Date data;
    private Date hora;
    private Clube mandante;
    private Clube visitante;
    
    
    
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
