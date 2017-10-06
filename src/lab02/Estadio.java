package lab02;


public class Estadio {
    
    private String cidadeDoEstadio;
    private String nomeDoEstadio;
    private String estadoDoEstadio;
    
    int quantideClubes = 0;
    private Clube clubes[] = new Clube[4];

    public Clube[] getClubes() {
        return clubes;
    }

    public void setClubes(Clube clube) {
        this.clubes[this.quantideClubes] = clube;
        this.quantideClubes++;
    }
}
