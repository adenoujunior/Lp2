
package lab02;
import java.util.Scanner;

public class Clube {
    private String cidade;
    private String nomeDoClubeMandante;
    private String estado;
    private String nomeDoClubeVisitante;
    
    
     private Funcionario funcionario[]= new Funcionario[50];
    private int quantidadeFuncionario=0;
    
    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario[this.quantidadeFuncionario] = funcionario;
        this.quantidadeFuncionario++;
    }

    public void setNomeDoClubeMandante(){
        Scanner nome4 = new Scanner(System.in);
        
        System.out.print("Informe o cluibe mandante da partida: " ); 
        nomeDoClubeMandante = nome4.next(); 
    }
    
    public void setNomeDoClubeVisitante(){
        Scanner nome2 = new Scanner(System.in);
        System.out.print("Informe o cluibe visitante da partida: " ); 
        nomeDoClubeVisitante = nome2.next();
    }
    
    
    
    
    
    
    
    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeDoClube() {
        return nomeDoClubeMandante;
    }

    public void setNomeDoClube(String nomeDoClube) {
        this.nomeDoClubeMandante = nomeDoClube;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeDoClubeVisitante() {
        return nomeDoClubeVisitante;
    }

    public void setNomeDoClubeVisitante(String nomeDoClubeVisitante) {
        this.nomeDoClubeVisitante = nomeDoClubeVisitante;
    }
    
}
