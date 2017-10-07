package lab02;
import java.util.Scanner;

public class Estadio {
    
    private String cidadeDoEstadio;
    private String nomeDoEstadio;
    private String estadoDoEstadio;
    
    private int quantideClubes = 0;
    private Clube clubes[] = new Clube[4];

    public Clube[] getClubes() {
        return clubes;
    }

    public void setClubes(Clube clube) {
        this.clubes[this.quantideClubes] = clube;
        this.quantideClubes++;
    }

   
    public void setNomeDoEstadio(){
        Scanner nome1 = new Scanner(System.in);
        System.out.print("Informe o Estadio: " ); 
        nomeDoEstadio = nome1.next();
        
    }
    
    public void setCidadeDoEstadio(){
        Scanner nome1 = new Scanner(System.in);
        System.out.print("Informe a cidade do estadio: " ); 
        cidadeDoEstadio = nome1.next();
    }
    
    public void setEstadoDoEstadio(){
        Scanner nome2 = new Scanner(System.in);
        System.out.print("Informe o estado do estadio: " ); 
        estadoDoEstadio = nome2.next();
    }
    
    
    
    /*Parte do gerador automatico*/
    public int getQuantideClubes() {
        return quantideClubes;
    }

    public void setQuantideClubes(int quantideClubes) {
        this.quantideClubes = quantideClubes;
    }

    public String getCidadeDoEstadio() {
        return cidadeDoEstadio;
    }

    public void setCidadeDoEstadio(String cidadeDoEstadio) {
        this.cidadeDoEstadio = cidadeDoEstadio;
    }

    public String getNomeDoEstadio() {
        return nomeDoEstadio;
    }

    public void setNomeDoEstadio(String nomeDoEstadio) {
        this.nomeDoEstadio = nomeDoEstadio;
    }

    public String getEstadoDoEstadio() {
        return estadoDoEstadio;
    }

    public void setEstadoDoEstadio(String estadoDoEstadio) {
        this.estadoDoEstadio = estadoDoEstadio;
    }

    void setScanner(String nomeDoEstadio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
